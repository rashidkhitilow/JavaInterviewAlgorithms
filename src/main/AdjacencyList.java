/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author rashid.khitilov
 */
public class AdjacencyList {
    // Add edge

    static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
        am.get(s).add(d);
        am.get(d).add(s);
    }

    public static void main(String[] args) {

        // Create the graph
        int V = 11;
        ArrayList<ArrayList<Integer>> am = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++) {
            am.add(new ArrayList<Integer>());
        }

        // Add edges
        addEdge(am, 1, 2);
        addEdge(am, 1, 4);
        addEdge(am, 2, 1);
        addEdge(am, 2, 3);
        addEdge(am, 2, 7);
        addEdge(am, 3, 2);
        addEdge(am, 3, 5);
        addEdge(am, 4, 1);
        addEdge(am, 4, 10);
        addEdge(am, 5, 3);
        addEdge(am, 5, 6);
        addEdge(am, 5, 9);
        addEdge(am, 6, 5);
        addEdge(am, 6, 7);
        addEdge(am, 7, 2);
        addEdge(am, 7, 6);
        addEdge(am, 7, 8);
        addEdge(am, 8, 7);
        addEdge(am, 8, 9);
        addEdge(am, 9, 5);
        addEdge(am, 9, 8);
        addEdge(am, 9, 10);
        addEdge(am, 10, 4);
        addEdge(am, 10, 9);

        printGraph(am);
    }

    // Print the graph
    static void printGraph(ArrayList<ArrayList<Integer>> am) {
        for (int i = 0; i < am.size(); i++) {
            System.out.println("\nVertex " + i + ":");
            for (int j = 0; j < am.get(i).size(); j++) {
                System.out.print(" -> " + am.get(i).get(j));
            }
            System.out.println();
        }
    }
}
