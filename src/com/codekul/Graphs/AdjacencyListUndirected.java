package com.codekul.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AdjacencyListUndirected
{
    public static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of vertices");
        int v=s.nextInt();
        ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>();
        System.out.println("Enter the number of edges");
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        int e=s.nextInt();
        for(int i=0;i<e;i++){
            System.out.println("Enter the edge pairs");
            int v1=s.nextInt();
            int v2=s.nextInt();
            addEdge(adj,v1,v2);

        }
      //  print(adj);
       // System.out.println(print(adj));

        BFSTRAVERSAL(adj,v);
          // DFS(adj,v);
    }

    public static void print(ArrayList<ArrayList<Integer>>adj){
        for(int i=0;i<adj.size();i++){
            for(int j=0;j<adj.get(i).size();j++) {
                System.out.print((adj.get(i).get(j)) + " ");
            }
            System.out.println();
        }

    }

    public static void BFS(ArrayList<ArrayList<Integer>>adj,int V,int s,boolean visited[]){
        Queue<Integer>Q=new LinkedList<>();
        Q.add(s);
        visited[s]=true;
      //  System.out.print(s+" ");
        while (!Q.isEmpty()){
            int u=Q.poll();
            System.out.print(u+" ");
            for(int v:adj.get(u)){
                if(visited[v]==false){
                    Q.add(v);
                    visited[v]=true;
                }
            }
        }
    }
    public static void BFSTRAVERSAL(ArrayList<ArrayList<Integer>>adj,int V){
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(visited[i]==false){
                System.out.println();
                BFS(adj,V,i,visited);
            }
        }

    }

    public static void DFSREC(ArrayList<ArrayList<Integer>>adj,int V,int s,boolean visited[]){

        visited[s]=true;
        System.out.print(s+"->");
        for(int i:adj.get(s)){
            if(visited[i]==false){
                visited[i]=true;
                DFSREC(adj,V,i,visited);
            }
        }
    }

    public static void DFS(ArrayList<ArrayList<Integer>>adj,int V){
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(visited[i]==false){
               DFSREC(adj,V,i,visited);
                //System.out.println( DFScycle(adj,i,visited,-1));
            }
        }
    }

    public static void BFSDIST(){

    };


    public static boolean DFScycle(ArrayList<ArrayList<Integer>>adj,int s,boolean visited[],int parent){
        visited[s]=true;

        for(int i:adj.get(s)){
            if(visited[i]==false){
                if(DFScycle(adj,i,visited,s));
                  return true;
            }
            else if (i!=parent) {
                return true;
            }
        }
        return false;
    }

}
