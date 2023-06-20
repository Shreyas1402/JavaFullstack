package com.codekul.Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyListDirected {

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of vertices");
        int v = s.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        System.out.println("Enter the number of edges");
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        int e = s.nextInt();
        for (int i = 0; i < e; i++) {
            System.out.println("Enter the edge pairs");
            int v1 = s.nextInt();
            int v2 = s.nextInt();
            addEdge(adj, v1, v2);
        }
            print(adj);



    }
    public static void print(ArrayList<ArrayList<Integer>> adj){
        for(int i=0;i< adj.size();i++){
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
}
