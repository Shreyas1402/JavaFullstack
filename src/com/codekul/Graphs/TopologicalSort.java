package com.codekul.Graphs;

import java.util.*;

public class TopologicalSort {
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v, int[] index) {
        adj.get(u).add(v);
        index[v]++;

    }


   /* public static void  print(ArrayList<ArrayList<Integer>> adj){
        for (int i=0;i<adj.size();i++){
            for(int u:adj.get(i)){
                System.out.print(u+" ");
            }
            System.out.println();
        }
    }*/

    public static void printIndex(ArrayList<ArrayList<Integer>> adj, int[] index2) {
        for (int i = 0; i < index2.length; i++) {
            for (int u : adj.get(i)) {
                index2[u]++;
            }
        }
            for (int j = 0; j < index2.length; j++) {
                System.out.print(index2[j] + " ");
            }

    }

    public static void topologicalsort(ArrayList<ArrayList<Integer>> adj, int index[], int v) {
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 0; i < v; i++) {
            if (index[i] == 0) {
                Q.add(i);
            }
        }
        while (!Q.isEmpty()) {
            int u = Q.poll();
            System.out.print(u + " ");
            for (int i : adj.get(u)) {
                index[i]--;

                if (index[i] == 0) {
                    Q.add(i);
                }
            }
        }
    }

    public static boolean IsCyclic(ArrayList<ArrayList<Integer>> adj, int index[], int v) {

        Queue<Integer> Q = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < index.length; i++) {
            if (index[i] == 0) {
                Q.add(i);
            }
        }
        while (!Q.isEmpty()) {
            int u = Q.poll();

            for (int i : adj.get(u)) {
                index[i]--;
                if (index[i] == 0) {
                    Q.add(i);
                }

            }
            count++;

        }
        if (count != v) {
            return true;
        }

        return false;
    }

    public static void DFSTOPO(ArrayList<ArrayList<Integer>> adj, int s, int v, boolean visited[], Stack<Integer> st) {
        visited[s] = true;
        for (int i : adj.get(s)) {
            if (visited[i] == false) {
                DFSTOPO(adj, i, v, visited, st);
            }
            st.add(s);
        }


    }

    public static void DFS(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean visited[] = new boolean[v];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < v; i++) {
            if (visited[i] == false) {
                DFSTOPO(adj, i, v, visited, st);
            }
        }
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }

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
        int index[] = new int[v];
        int index2[]= new int[v];
        for (int i = 0; i < e; i++) {
            System.out.println("Enter the edge pairs");
            int v1 = s.nextInt();
            int v2 = s.nextInt();
            addEdge(adj, v1, v2, index);
        }
        printIndex(adj, index2);

    }
}
