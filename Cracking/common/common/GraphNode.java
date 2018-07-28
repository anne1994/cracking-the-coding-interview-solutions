package common; 

import java.util.ArrayList;

public class GraphNode{
	
	public int data;
	public boolean visited;
	private ArrayList<GraphNode> neighbors;
	
	
	//constructor
	public GraphNode(int data) {
		this.data = data;
		visited = false;
		neighbors = new ArrayList<>();
	}
	
	public void visit() {
		visited =true;
	}
	
	public ArrayList<GraphNode> getNeighbors(){
		return neighbors;
	}
	
	
	
	public void addNeighbor(GraphNode neighbor) {
		neighbors.add(neighbor);
	}
	
}