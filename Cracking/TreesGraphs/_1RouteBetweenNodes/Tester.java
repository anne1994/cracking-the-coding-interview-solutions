package _1RouteBetweenNodes;

import common.GraphNode; 

public class Tester{ 
	public static void main(String[] args) {
		System.out.println(" Route between nodes\n");
		GraphNode node1 = new GraphNode(1);
		GraphNode node2 = new GraphNode(2);
		GraphNode node3 = new GraphNode(3);
		GraphNode node4 = new GraphNode(4);
		GraphNode node5 = new GraphNode(5);
		node1.addNeighbor(node2);
		node2.addNeighbor(node3);
		node3.addNeighbor(node1);
		node3.addNeighbor(node4);
		System.out.println("route present  " + RouteNodes.routePresent(node1, node5));
	}
	
}