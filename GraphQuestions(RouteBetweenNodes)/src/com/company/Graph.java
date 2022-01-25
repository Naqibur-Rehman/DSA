package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

    static ArrayList<GraphNode> nodeList;

    public enum State {
        Unvisited, Visited, Visiting
    }

    public Graph(ArrayList<GraphNode> nodeList) {
        Graph.nodeList = nodeList;
    }

    // add directed edge
    public void addDirectedEdge(int i, int j){
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbors.add(second);
    }

    // Route Between Nodes
    public static boolean search(GraphNode start, GraphNode end) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        for (GraphNode node : nodeList) {
            node.state = State.Unvisited;
        }
        start.state = State.Visiting;
        queue.add(start);
        GraphNode currentNode;
        while (!queue.isEmpty()) {
            currentNode = queue.removeFirst();
            if (currentNode != null) {
                for (GraphNode neighbor : currentNode.neighbors) {
                    if (neighbor.state == State.Unvisited) {
                        if (neighbor == end) {
                            return true;
                        } else {
                            neighbor.state =State.Visiting;
                            queue.add(neighbor);
                        }
                    }
                }
                currentNode.state = State.Visited;
            }
        }

        return false;
    }


}
