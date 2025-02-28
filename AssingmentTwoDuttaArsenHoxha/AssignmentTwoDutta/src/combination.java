import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class combination {

	
	public int[] combo; 
	public double fitness;
	
	public combination( int[] combo, double fitness) {
		this.combo = combo;
		this.fitness = fitness;
	}

	public int[] getCombo() {
		return combo;
	}

	public void setCombo(int[] combo) {
		this.combo = combo;
	}

	public double getFitness() {
		return fitness;
	}

	public void setFitness(double fitness) {
		this.fitness = fitness;
	}
	
	public static ArrayList selection(ArrayList pop) {
		
		ArrayList<combination> OldGen = pop;
		ArrayList<combination> NextGen = new ArrayList<>();
		
		for( int i = 0; i < pop.size(); i++) {
		
		ArrayList<combination> two = RandomTwo(OldGen);
		combination x = two.get(0);
		combination y = two.get(1);
		combination newChild = reproduce( x, y);
		NextGen.add(newChild);
			
		}
		
		return NextGen;
		
	}
	
	public static ArrayList RandomTwo(ArrayList<combination> pop) {
		
		
		ArrayList<combination> Random = new ArrayList();
		Random random = new Random();
		ArrayList<combination> tournament = new ArrayList<>();
	    
	    
		for(int a = 0; a < 2; a++) {
		    for (int i = 0; i < pop.size() / 2; i++) {
		        int randomIndex = random.nextInt(pop.size());
		        tournament.add(pop.get(randomIndex));
		    }
		    
		   
		    combination bestIndividual = null;
		    double bestFitness = -1;
		    for (combination individual : tournament) {
		        if (individual.fitness > bestFitness) {
		            bestIndividual = individual;
		            bestFitness = individual.fitness;
		        }
		    }
	    Random.add(bestIndividual);
		}
		return Random;
		
	}
	
	 
    public static combination reproduce(combination x, combination y) {
		
		
		Random rand = new Random();		
		int n = x.combo.length;
		int c = rand.nextInt(n);
		
		int[] childCombo = new int[n];
		for( int i = 0; i <= c; i++) {
			childCombo[i] = x.combo[i];
			
		}
		for( int j = c + 1 ; j < n; j++) {
			childCombo[j] = y.combo[j];
		}
		
		combination child = new combination( childCombo, 0);
		
		//System.out.println("x combo: " + Arrays.toString(x.combo));
		//System.out.println("y combo: " + Arrays.toString(y.combo));
		//System.out.println("split : " + c);
		//System.out.println("child combo: " + Arrays.toString(child.combo));
		int MutateRate = rand.nextInt(100);
		if( MutateRate > 0 && MutateRate < 50) {
		child = mutate(child);
		}
		//System.out.println("child mutate: " + Arrays.toString(child.combo));
		
		return child;
		
	}
    
    public static combination mutate(combination temp) {
		
		Random rand = new Random();
		int n =  temp.combo.length;
		int number = rand.nextInt(n);
		int change  = rand.nextInt(n) + 1;
		temp.combo[number] = change;
		//System.out.println("Place to change :" + number + " change to: " + change);
		
		return temp;

	}
    public static ArrayList pop(int n) {
		
		Random rand = new Random();
		ArrayList<combination> pop = new ArrayList<>();

		
		for( int i = 0; i < 100; i++) {
			int[] curr = new int[n];
				for( int j = 0; j < n; j++) {
					int temp = rand.nextInt(n ) + 1 ;
					curr[j] = temp;
				}
			
			combination combo = new combination(curr , 0);
			pop.add(combo);
			
		}
		
		return pop;
		
	}
    
	
	public static combination LoopFitness( ArrayList<combination> list) {
		
		
		combination max = list.get(0);
		
		for( int i = 0; i < list.size(); i++) {
			
			CalculateFitness(list.get(i));	
			if(list.get(i).fitness > max.fitness) {
				max = list.get(i);
			}
		}
		
		return max;
		
	}
	
	public static void CalculateFitness( combination n){
		
		
		int length = n.combo.length;
		int collisions = 0;
		
		//row collision
		for( int i = 0; i < length; i++) {
			for( int j = i + 1; j < length; j++) {
				int xDiff = Math.abs(i - j);
				int yDiff = Math.abs( n.combo[i] - n.combo[j] );
				
				if(n.combo[i] == n.combo[j] || xDiff == yDiff ) {
					collisions++;
				}
			}
		}
		
		
		 n.fitness = length * (length - 1) / 2 - collisions;
			
	}
	
	public static void printBoard(combination temp) {
		
		int length = temp.combo.length;		
		Integer[][] nxn = new Integer[length][length];		
		for (int i = 0; i < length; i++){
			nxn[i][temp.combo[i] - 1] = temp.combo[i];
		}
		
		for( int i = 0; i < length; i++) {
			for( int j =0; j < length; j++) {
				if( nxn[i][j] == null  ) {
					System.out.print("_ ");
				}
				else {
					System.out.print("Q ");
				}
			}
			System.out.println();
		}
	}
}
	
	/*
	public static boolean goalState( combination temp  ) {
		
		int length = temp.combo.length;
		Integer[][] nxn = new Integer[length][length];
		
		for (int i = 0; i < length; i++){
			nxn[i][temp.combo[i ] - 1] = temp.combo[i];
		}
		
		for( int i = 0; i < length; i++) {
			int collision = 0;
			for( int j = 0; j < length; j++) {
				if(nxn[j][i] != null) {
					collision++;
					if( collision > 1) {
						return false;
					}
				}				
			}
		}
		
		
		
		for( int i = 0; i < length; i++) {
			if( queenCollisionR(nxn, i, 0) || queenCollisionR(nxn, 0 , i)) {
				return false;
			}
			
		}
		
		for( int i = length - 1 ; i  > -1 ; i--) {
			if( queenCollisionL(nxn, i, 0 ) ) {
				return false;
			}
			
		}
		
		for( int i = length - 1 ; i  > -1 ; i--) {
			if( queenCollisionL1(nxn, length - 1, i) ) {
				return false;
			}
			
		}
				
		
		return true;
				
			}	
			
	public static boolean queenCollisionR(Integer[][] nxn, int row, int col) {
		
		int length = nxn.length;
		int collision = 0;
		
		while( row < length && col < length) {
			if(nxn[row][col] != null) {
				collision++;
				if( collision > 1) {
					return true;
				}
			}
			row++;
			col++;
		}
		
		return false;
		
	}
	public static boolean queenCollisionL(Integer[][] nxn, int row, int col) {
		// r = 3 col = 0
		
		// 0 1 2 3
		// 0 1 2 3
		// 0 1 2 3
		// 0 1 2 3
		int collision = 0;
		
		while (row > -1 && col < nxn.length) {
	        if (nxn[row][col] != null) {
	            collision++;
	            if (collision > 1) {
	                return true;
	            }
	        }
	        row--;
	        col++;
	    }
		return false;
		
		
	}
	
	public static boolean queenCollisionL1(Integer[][] nxn, int row, int col) {
		// r = 0 col = 3
		
		// 0 1 2 3
		// 0 1 2 3
		// 0 1 2 3
		// 0 1 2 3
		int collision = 0;
		
		while (row > -1 && col < nxn.length) {
	        if (nxn[row][col] != null) {
	            collision++;
	            if (collision > 1) {
	                return true;
	            }
	        }
	        row--;
	        col++;
	    }
		return false;
		
		
	}
	*/
		