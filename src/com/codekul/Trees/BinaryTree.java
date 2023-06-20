package com.codekul.Trees;

import com.codekul.Trees.BinaryNode;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public BinaryNode root;

    public BinaryTree() {
        this.root = null;
    }

    public void PreOrder(BinaryNode node) {
        if (node == null) {
            return;
        } else {
            System.out.println(node.value + " ");
            PreOrder(node.left);
            PreOrder(node.right);
        }

    }

    public void InOrder(BinaryNode node) {

        if (node == null) {
            return;
        } else {
            InOrder(node.left);
            System.out.print(node.value + " -> ");
            InOrder(node.right);
        }

    }

    public void PostOrder(BinaryNode node) {

        if (node == null) {
            return;
        }

        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.value + " -> ");
    }

    public void LevelTransversal() {
        BinaryNode node;
        if (root == null) {
            return;

        }
        Queue<BinaryNode> Q = new LinkedList<>();
        Q.add(root);
        while (!Q.isEmpty()) {
            BinaryNode present = Q.remove();
            System.out.println(present.value);
            if (present.left != null) {
                Q.add(present.left);
            }
            if (present.right != null) {
                Q.add(present.right);
            }
        }
    }

    public void Search(String value) {
        // BinaryNode node;
        Queue<BinaryNode> Q = new LinkedList<>();
        Q.add(root);
        while (!Q.isEmpty()) {
            BinaryNode Present = Q.remove();
            if (Present.value == value) {
                System.out.println("FOUND VLAUE ->" + Present.value);
                return;
            } else {
                if (Present.left != null) {
                    Q.add(Present.left);
                }
                if (Present.right != null) {
                    Q.add(Present.right);
                }
            }
        }
        System.out.println("not found");
    }

    public void Insert(String val) {
        BinaryNode newNode=new BinaryNode();
        newNode.value=val;
        if(root==null){
            root=newNode;
            System.out.println("ROOT CREATED");
            return;
        }
        Queue<BinaryNode> Q = new LinkedList<>();
        Q.add(root);
        while(!Q.isEmpty()){
        BinaryNode present=Q.remove();
        if(present.left==null){
            present.left=newNode;

            break;
        }
        else if(present.right==null){
            present.right=newNode;

            break;
        }
        else{
            Q.add(present.left);
            Q.add(present.right);
        }





        }

    }

    public BinaryNode getDeepest(){
        Queue<BinaryNode> Q=new LinkedList<>();
        Q.add(root);
        BinaryNode Present=null; // so that it stores the value of the last element.
        while(!Q.isEmpty()){
            Present=Q.remove();
            if(Present.left!=null){
                Q.add(Present.left);
            }
            if(Present.right!=null){
                Q.add(Present.right);
            }
        }
        return Present;
    }
    public void DeleteDeepest(){
        Queue<BinaryNode> Q=new LinkedList<>();
        Q.add(root);
        BinaryNode prev,pres=null;
        while(!Q.isEmpty()){
            prev=pres;
            pres=Q.remove();
            if(pres.left==null){
                prev.right=null;
                return;
            }
            else if(pres.right==null){
                pres.left=null;
                return;
            }
            else{
                Q.add(pres.left);
                Q.add(pres.right);
            }
        }
    }
    public void DeleteNode(String value){
        Queue<BinaryNode> Q=new LinkedList<>();
        Q.add(root);
        while(!Q.isEmpty()){
            BinaryNode Present=Q.remove();
            if (Present.value==value){
                Present.value= getDeepest().value;
                DeleteDeepest();
                System.out.println("Node deleted");
                return;
            }
            else{
                Q.add(Present.left);
                Q.add(Present.right);
            }
        }
    }
    void deleteBinaryTree(){
        root=null;
        System.out.println("DELETED BINARY TREE  ");
    }

}
