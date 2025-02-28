import java.util.*;

public class main{

	public static void main( String args[] ) {
		
		menu();
		
	}
	
	public static void menu() {	
			
			while(true) {
			System.out.println("Please enter number of queens or 0 to exit");		
			try{
				Scanner input = new Scanner(System.in);			
				int num = input.nextInt();	
				if( num ==0 ) {
					break;
				}
				long start = System.currentTimeMillis();				
				int gen = 0;
				int flag = 0;				
				ArrayList<combination> initial = combination.pop(num);							
				while( flag == 0) {
					
					
					combination max = combination.LoopFitness(initial);
					
					for( int a = 0; a < initial.size(); a++) {
					
						if (  initial.get(a).fitness == num * (num - 1) / 2 ) { // check if goal state is reached, print solution
							System.out.println("Solution found! generation: " + gen + " order is: " + Arrays.toString(initial.get(a).combo) );
							combination.printBoard(initial.get(a));
							long end = System.currentTimeMillis();
							System.out.println("Time taken: " + (end - start) + " msec");
							
							flag = 1;
							break;
							
						}
					}
					if(flag == 0) {
					
					System.out.println("generation: " + gen);
					
					System.out.println("highest fitness: " + Arrays.toString(max.combo));
					combination.printBoard(max);
					ArrayList<combination> newGen = new ArrayList();
					 newGen.clear();
					 newGen = combination.selection(initial);
					 initial.clear();
					 initial = newGen;
					 gen++;
					 
					}
					
				}
				
				
			}
			catch(InputMismatchException IME){
				System.out.println("Invalid input, enter [4 - 20]: ");
				menu();
			}		
			}
			return;
		}
	}