import java.util.*;

public class Node implements Comparable<Node>{
	
	
	public String name;
	public int x;
	public int y;
	public Node parent = null;
	
	public List<Edge> neighbors;
	
	public double total = Double.MAX_VALUE; // sum 
	public double traveled = Double.MAX_VALUE; // actual distance 
	
	public double heuristic; // estimated 
	
	Node ( double heuristic, String name, int x, int y){
		this.heuristic = heuristic;
		this.name = name;
		this.x = x;
		this.y = y;
		this.neighbors = new ArrayList<>();
		
	}
	
	@Override
	public int compareTo(Node node) {
		return Double.compare(this.total, node.total);
	}
	
	public static class Edge{
		Edge(Double startNode, Node shape){
			this.weight = startNode;
			this.shape = shape;
		}
		
		public Double weight;
		public Node shape;
	}
	
	public void addBranch(Double startNode, Node shape) {
		Edge newEdge = new Edge(startNode, shape);
		neighbors.add(newEdge);
	}
	
	public double calculateHeuristic( Node target) {
		return this.heuristic;
	}

	public static ArrayList ACTIONS(Node current){
		
		ArrayList<Edge> coords = new ArrayList();
		
		for( int i = 0; i < current.neighbors.size(); i++) {		
			Node.Edge edge = current.neighbors.get(i);									
			coords.add(edge);
		}
		
		return coords;
	}
	public static Node aStar( Node start, Node target) {
		PriorityQueue<Node> closedList = new PriorityQueue<>();
		PriorityQueue<Node> openList = new PriorityQueue<>();
		
		start.total = start.traveled + start.calculateHeuristic(target);
		
		openList.add(start);
		
		while( !openList.isEmpty()) {
			Node node = openList.peek();
			if( node == target) {
				return node;
			}
		
		ArrayList<Node> list = start.ACTIONS(node);
		
		for( int i = 0; i < list.size(); i++ ) {
			
			Node.Edge edge = node.neighbors.get(i);
			Node next = edge.shape;
			
			double totalWeight = node.traveled + edge.weight;
			
			if( !openList.contains(next) && !closedList.contains(next)) {
				next.parent = node;
				next.traveled = totalWeight;
				next.total = next.traveled + next.calculateHeuristic(target);
				openList.add(next);
			}
			else {
				if( totalWeight < next.traveled) {
					next.parent = node;
					next.traveled = totalWeight;
					next.total = next.traveled + next.calculateHeuristic(target);
					
					if(closedList.contains(next)) {
						closedList.remove(next);
						openList.add(next);
						
					}
				}
			}
			
		}
		
		openList.remove(node);
		closedList.add(node);
		}
		return null;
		
		
		
	} // end of aStar

	public static ArrayList printPath(Node target) {
		
		Node node = target;
		
		if ( node == null) {
			return null;
		}
		
		ArrayList<Node> path = new ArrayList<>();
		
		while(node.parent != null) {
			path.add(node);
			node = node.parent;
		}
		path.add(node);
		Collections.reverse(path);
		
		
		
		return path;
	} // end of path



} // end of Node


	
	
	