package com.company;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class WeightedGraph {
    ArrayList<WeightedNode> nodeList;

    public WeightedGraph(ArrayList<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    // add weighted edge
    public void addWeightedEdge(int i, int j, int weight) {
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.neighbors.add(second);
        first.weightMap.put(second, weight);
    }

    // Print path
    public static void pathPrint(WeightedNode node) {
        if (node.parent != null){
            pathPrint(node.parent);
        }
        System.out.print(node.name + " ");
    }

    // Dijkstra Algo
    public void dijkstra(WeightedNode node) {
        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        node.distance = 0;
        queue.addAll(nodeList);
        while (!queue.isEmpty()) {
            WeightedNode currentNode = queue.remove();
            for (WeightedNode neighbor : currentNode.neighbors) {
                if (queue.contains(neighbor)) {
                    if (neighbor.distance > currentNode.distance + currentNode.weightMap.get(neighbor)) {
                        neighbor.distance = currentNode.distance + currentNode.weightMap.get(neighbor);
                        neighbor.parent = currentNode;
                        queue.remove(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }

        for (WeightedNode nodeToCheck: nodeList){
            System.out.print("Node " + nodeToCheck + ", distance " + nodeToCheck.distance + ", path ");
            pathPrint(nodeToCheck);
            System.out.println();
        }
    }

    // BellmanFord Algo
    public void bellmanFord(WeightedNode sourceNode) {
        sourceNode.distance = 0;
        for (int i = 0; i < nodeList.size(); i++) {
            for (WeightedNode currentNode : nodeList) {
                for (WeightedNode neighbor : currentNode.neighbors) {
                    if (neighbor.distance > currentNode.distance + currentNode.weightMap.get(neighbor)) {
                        neighbor.distance = currentNode.distance + currentNode.weightMap.get(neighbor);
                        neighbor.parent = currentNode;
                    }
                }
            }
        }
        System.out.println("Checking for negative cycle.....");
        for (WeightedNode currentNode : nodeList) {
            for (WeightedNode neighbor : currentNode.neighbors) {
                if (neighbor.distance > currentNode.distance + currentNode.weightMap.get(neighbor)) {
                    System.out.println("Negative cycle found \n");
                    System.out.println("Vertex name " + neighbor.name);
                    System.out.println("Old cost " + neighbor.distance);
                    int newDistance = currentNode.distance + currentNode.weightMap.get(neighbor);
                    System.out.println("New cost " + newDistance);
                    return;
                }
            }
        }
        System.out.println("Negative cycle not found");

        for (WeightedNode nodeToCheck: nodeList){
            System.out.print("Node " + nodeToCheck + ", distance " + nodeToCheck.distance + ", path ");
            pathPrint(nodeToCheck);
            System.out.println();
        }
    }


}
