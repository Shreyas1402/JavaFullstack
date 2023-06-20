
package com.codekul.Graphs;

import java.util.*;

public class AdjacencyMatrix {

    public static void  GetPathBFS(int adj[][], int start, int end) {
        ArrayList<Integer> A = new ArrayList<>();
        boolean visited[] = new boolean[adj.length];
        visited[start] = true;
        if (start > adj.length - 1 || end > adj.length - 1) {
            A.add(-1);
           // return A;
        }
        Queue<Integer> Q = new LinkedList<>();
        HashMap<Integer, Integer> H = new HashMap<>();

        H.put(start, -1);
        Q.add(start);
        boolean PathFound = false;
        while (!Q.isEmpty()) {

           int parent = Q.remove();
           visited[parent]=true;
            for (int i = 0; i < adj.length; i++) {
                if (adj[parent][i] == 1 && visited[i] == false) {
                    Q.add(i);
                    H.put(i, parent);
                    if (i == end) {
                        PathFound = true;
                        break;// Path found
                    }

                }

            }

        }
        if (PathFound) {
            int curr = end;
            while (curr != -1) {
                A.add(curr);
                int par=H.get(curr);
                curr=par;

            }
            System.out.println(A);
          //  return  A;
        }

        else {
            System.out.println("null");
        }
        //return null;


        }




    public static boolean HasAPathDFS(int adj[][],boolean visited[],int start,int end){
        visited[start]=true;
        System.out.println(start);
        for(int i=0;i<adj.length;i++){
            if(adj[start][i]==1&&visited[i]==false){

                if(start==end){
                    return  true;
                }
                HasAPathDFS(adj,visited,i,end);
            }
        }
        return false;
    }
    public static void  HasAPathDFS(int adj[][],int start,int end){
        boolean visited[]=new boolean[adj.length];

        System.out.println(HasAPathDFS(adj,visited,start,end));
    }

    public static  boolean HasAPathBFS(int adj[][],int start,int end){
        if(start> adj.length-1||end> adj.length-1){
            return false;
        }
        boolean visited[]=new boolean[adj.length];
        Queue<Integer> Q=new ArrayDeque<>();
        Q.add(start);
        visited[start]=true;
        while(!Q.isEmpty()){
            int first=Q.poll();
            for(int i=0;i< adj.length;i++){
                if(adj[first][i]==1&&visited[i]==false){
                if(i==end) {
                    return true;
                }
                else{
                    Q.add(i);
                    visited[i]=true;
                }

                }
            }
        }
        return false;
    }

    public static void bftraversal(int adj[][],int curr) {
        boolean visited[] = new boolean[adj.length];

        Queue<Integer> Q = new ArrayDeque<>();
        Q.add(curr);
        visited[curr] = true;
        while (!Q.isEmpty()) {
            int first = Q.poll();
            System.out.print(first + "->");
            for (int i = 0; i < adj.length; i++) {
                if (adj[first][i] == 1 && visited[i] == false) {
                    Q.add(i);
                    visited[i] = true;
                }
            }

        }
        System.out.println();
        for (int i = 0; i < adj.length; i++) {
            if (!visited[i]){
                System.out.print(i+"->");
            }
        }
    }


    public static void dftraversal(int adj[][],int curr,boolean visit[]){
        System.out.print(curr+" ");
        visit[curr]=true;
        for(int i=0;i<adj.length;i++){
            if(adj[curr][i]==1&&visit[i]==false){

                dftraversal(adj,i,visit);
            }

        }
    }
    public static void dftraversal(int adj[][]){
        boolean visit[]=new boolean[adj.length];
        for(int i=0;i<adj.length;i++) {
            if (!visit[i])
                dftraversal(adj, i, visit);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF VERTICES: ");
        int v=s.nextInt();
        System.out.println("ENTER THE NUMBER OF EDGES: ");
        int e=s.nextInt();

        int adj[][]=new int[v][v];

        for(int i=0;i<e;i++){
            System.out.println("ENTER THE VERTICES THAT ARE CONNECTED: ");
            int v1=s.nextInt();
            int v2=s.nextInt();
            adj[v1][v2]=1;
            adj[v2][v1]=1;
        }

      /*  for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }*/
         //dftraversal(adj);

       // bftraversal(adj,0);
       // HasAPathDFS(adj,0,2);
        GetPathBFS(adj,0,7);

    }
}
