package com.codekul.Trees;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ParentNode {
    public static void ParentNode(Node root){
        if(root==null){
            return;
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>A=new ArrayList<>();
        Queue<Node>Q=new LinkedList<>();
        Q.add(root);
        A.add(root.data);
        map.put(root.data, -1);
        while(!Q.isEmpty()){
            Node curr=Q.remove();
            if(curr.left!=null){
                map.put(curr.left.data,curr.data);
                A.add(curr.left.data);
                Q.add(curr.left);
            }
            if(curr.right!=null){
                map.put(curr.right.data,curr.data);
                A.add(curr.right.data);
                Q.add(curr.right);
            }
        }
        System.out.println(map);
        System.out.println(A);

    }


    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);

        ParentNode(root);
    }
}
