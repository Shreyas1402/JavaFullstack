package com.codekul.Graphs;

import javax.swing.text.Style;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class IsConnected {
    public static boolean IsConnectedBFS(int adj[][],int curr){
        boolean visit[]=new boolean[adj.length];
        Queue<Integer> Q=new LinkedList<>();
        Q.add(curr);
        visit[curr]=true;
        while(!Q.isEmpty()){
            int par=Q.poll();
            System.out.print(par+" -> ");
            for(int i=0;i< adj.length;i++){
                if(adj[par][i]==1&&visit[i]==false){
                    Q.add(i);
                    visit[i]=true;
                }
            }
        }
        for(int i=0;i<adj.length;i++){
            if(visit[i]==false){
                return false;
            }
        }
        return true;
    }

    public static boolean IsConnectedDFS(int adj[][],boolean visited[],int curr){
        visited[curr]=true;
        System.out.print(curr+" ");
        for(int i=0;i<adj.length;i++){
            if(adj[curr][i]==1&&visited[i]==false){
                IsConnectedDFS(adj,visited,i);
            }
        }
        for(int i=0;i<adj.length;i++){
            if(visited[i]==false){

                return false;
            }
        }
        return true;
    }
    public static void dfs(int adj[][],int curr){
        boolean visited[]=new boolean[adj.length];
        System.out.println(IsConnectedDFS(adj,visited,0));

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Vertice no");
        int v=sc.nextInt();
        System.out.println("edge no");
        int e=sc.nextInt();
        int adj[][]=new int[v][v];

        for(int i=0;i<e;i++){
            System.out.println("vertice no 1 and no 2");
            int v1= sc.nextInt();
            int v2= sc.nextInt();
            adj[v1][v2]=1;
            adj[v2][v1]=1;
        }
     //dfs(adj,0);
        System.out.println( IsConnectedBFS(adj,0));
    }
}
