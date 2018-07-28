package _1RouteBetweenNodes;


import java.util.ArrayDeque;
import common.GraphNode;

public class RouteNodes{
	
	public static boolean routePresent(GraphNode start, GraphNode end) {
		if(start == end) {
			return true;
		}
	
	
	ArrayDeque<GraphNode> q = new ArrayDeque<>();
	start.visit();
	q.add(start);	
	
	while(!q.isEmpty()) {
		GraphNode curr = q.removeFirst();
		if(curr == end) {
			return true;
		}
		
		for(GraphNode neighbor: curr.getNeighbors()) {
			if(!neighbor.visited) {
				neighbor.visit();
				q.add(neighbor);
			}
		}
	}
	return false;	
	}
}