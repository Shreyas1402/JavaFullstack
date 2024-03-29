package com.codekul.Trees;


import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class KthNaive {

        public static void main(String[] args) {

            Map<Integer,Integer> M=new TreeMap<Integer,Integer>();

            Node root=new Node(15);
            root.left=new Node(5);
            root.left.left=new Node(3);
            root.right=new Node(20);
            root.right.left=new Node(18);
            root.right.left.left=new Node(16);
            root.right.right=new Node(80);
            int k=3;

            System.out.print("Kth Smallest: ");
            printKth(root,k);
        }

        static int count=0;
        public static void printKth(Node root, int k){
            if(root!=null){
                printKth(root.left,k);
                count++;
                if(count==k)
                {System.out.print(root.data);return;}
                printKth(root.right,k);
            }
        }
    }

