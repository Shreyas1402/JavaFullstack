package com.codekul.Trees;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class PrintPath {

    public static boolean printall(Node root,ArrayList<Integer>A,int x){
       if(root==null){
           return false;
       }
       A.add(root.data);
       if(root.data==x){
           return true;
       }
       boolean ansL=printall(root.left,A,x);
       boolean ansR=printall(root.right,A,x);
       if(ansL||ansR){
           return true;
       }
      /* if(printall(root.left,x)||printall(root.right,x)){
           return true;
       }*/
       A.remove(A.size()-1);
       return false;



    }

    public static void main(String[] args) {
        ArrayList<Integer>path1=new ArrayList<>();
        ArrayList<Integer>path2=new ArrayList<>();
        Node root=new Node(10);
        Node n1=new Node(20);
        Node n2=new Node(30);
        Node n3=new Node(40);
        Node n4=new Node(50);
        Node n5=new Node(60);
        Node n6=new Node(70);
        root.left=n1;
        root.right=n2;
        n1.left=n3;
        n1.right=n4;
        n2.left=n5;
        n2.right=n6;

          printall(root,path1,50);
          printall(root,path2,70);

        System.out.println(path1);
        System.out.println(path2);
    }
}

class Node{
    int data;
    Node left;
    Node right;
    Node(int x){
        data=x;
    }

        }
