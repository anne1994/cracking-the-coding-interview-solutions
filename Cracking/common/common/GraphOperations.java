package common;

import java.util.ArrayDeque;

public class GraphOperations{
	
	public static void connectNodes(GraphNode node1, GraphNode node2){
		
		node1.addNeighbor(node2);
		node2.addNeighbor(node1);
	}
	
	//do dfs and bfs
	public static void DFS(GraphNode node, int data) {
		if(node == null) return;
		
		if(node.data == data) {
			System.out.println("node found by doing DFS" + node.data);
			return;
		}
		
		//checks for each neighbor then goes to next - dfs
		for(GraphNode neighbor: node.getNeighbors()) {
			if(!neighbor.visited) {
				neighbor.visit();
				DFS(neighbor,data);
			}
		}
	}
	
	public static void BFS(GraphNode node, int data) {
		
		if(node == null) {
			return;
		}
		
		//before adding to queue set node as visited
		
		ArrayDeque<GraphNode> deque = new ArrayDeque<>();
		node.visit();
		deque.add(node);
		
		
		while(!deque.isEmpty()) {
			GraphNode current = deque.removeFirst();
			if(current.data == data) {
				System.out.println("node found by bfs" + current.data);
			}
			for(GraphNode neighbor : current.getNeighbors()) {
				
				if(!neighbor.visited) {
					neighbor.visit();
					deque.addLast(neighbor);
				}
			}
		}
	}
	
	
	//build  default graph
	public static GraphNode createGraph() {
		GraphNode node1 = new GraphNode(1);
		node1.addNeighbor(new GraphNode(3));
		node1.addNeighbor(new GraphNode(4));
		GraphNode node2 = new GraphNode(2);
		node2.addNeighbor(new GraphNode(5));
		node2.addNeighbor(new GraphNode(6));
		connectNodes(node1, node2);
		return node1;
	}
	
}