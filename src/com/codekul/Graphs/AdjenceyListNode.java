package com.codekul.Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class AdjenceyListNode {
   private int V;
   private int weight;
     AdjenceyListNode(int v,int W){
        V=v;
        weight=W;
    }
    int getV(){
        return V;
    }
    int getWeight(){
        return weight;
    }
}

class Graph{
    //private int v;
    private LinkedList<AdjenceyListNode>adj[];
    Graph(int V){
        adj=new LinkedList[V];
        for(int i=0;i<V;i++){
            adj[i]=new LinkedList<AdjenceyListNode>();

        }
    }

    void addEdge(int u,int v,int weight){
        AdjenceyListNode node=new AdjenceyListNode(v,weight);
        adj[u].add(node);

    }
    void print(LinkedList<AdjenceyListNode>adj[],int v){
        for(int i=0;i<v;i++){
            for(int j=0;j<adj[i].size();j++){
                System.out.print(adj[i].get(j).getV()+" -> ");
            }
            System.out.println();
        }

    }

    public void BFS(LinkedList<AdjenceyListNode>adj[],int v,int s) {
        boolean visited[]=new boolean[v];
        visited[s]=true;
        Queue<Integer> Q=new LinkedList<>();
        Q.add(s);

        }
    }



class main{
    public static void main(String[] args) {
        int v=5;
        Graph g=new Graph(v);
        g.addEdge(0,1,2);
        g.addEdge(0,2,5);
        g.addEdge(1,2,5);
        g.addEdge(2,3,4);
        g.addEdge(3,1,5);


    }
        }
