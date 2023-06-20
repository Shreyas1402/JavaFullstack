package com.codekul.Graphs;

import com.codekul.Final.A;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class WEIGHTEDGRAPH {
    int Weight;
    int V;
    WEIGHTEDGRAPH(int V,int Weight){
        this.Weight=Weight;
        this.V=V;
    }

    public int getV() {
        return V;
    }

    public int getWeight() {
        return Weight;
    }
}
class Adjecnt {
    static LinkedList<WEIGHTEDGRAPH> adj[];

    public static void Adjecnt(int V) {

        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<WEIGHTEDGRAPH>();
        }
    }

    public static void AddEdge(int u, int v, int weight) {
        WEIGHTEDGRAPH node = new WEIGHTEDGRAPH(v, weight);
        adj[u].add(node);

    }

    public static void print(int V) {
        for (int i = 0; i < V; i++) {
            System.out.print(i+" -> ");
            Iterator<WEIGHTEDGRAPH> it = adj[i].iterator();
            while (it.hasNext()) {
                WEIGHTEDGRAPH node=it.next();
                System.out.print(node.getV()+ " " + node.getWeight()+ "   ");
            }
            System.out.println();
        }
    }

    public static void TopologicalSort(int V){
        int Derived[]=new int[V];
        Queue<Integer>Q=new LinkedList<>();
        ArrayList<Integer>A=new ArrayList<>();
        for(int i=0;i<V;i++){
            Iterator<WEIGHTEDGRAPH>it=adj[i].iterator();
            while(it.hasNext()) {
                WEIGHTEDGRAPH node = it.next();
                Derived[node.getV()]++;
            }
        }
        for(int i=0;i<V;i++){
            if(Derived[i]==0){
                Q.add(i);
            }

        }
       
        while(!Q.isEmpty()){
            int u=Q.poll();
            A.add(u);
            for(WEIGHTEDGRAPH v:adj[u]){
                if(Derived[v.getV()]-1==0){
                    Q.add(v.getV());
                }
                else {
                    Derived[v.getV()]--;
                }
            }
        }

        System.out.println(A);
    }

    public static void main(String[] args) {
        Adjecnt(5);
        AddEdge(0, 1, 3);
        AddEdge(1, 2, 5);
        AddEdge(2, 3, 6);
        AddEdge(3, 4, 7);
        AddEdge(0, 3, 8);
        TopologicalSort(5);
       // print(5);


    }
}

