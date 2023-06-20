package com.codekul.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class Binary_Search_Tree {
    BinaryNode root;

    public Binary_Search_Tree() {
        this.root=null;
    }

    private BinaryNode Insert(BinaryNode curr,int val){
        if(curr==null){
            BinaryNode node=new BinaryNode();
            node.value=val;
            System.out.println("Node created successfully");
           return node;

        } else if (val<= curr.value) {
            curr.left=Insert(curr.left,val);
          return curr;

        }
        else{
            curr.right=Insert(curr.right,val);
           return curr;
        }
      // return curr;
    }
    void insert(int value) {
       root=Insert(root, value);

    }
    public void PreOrder(BinaryNode node){
        //BinaryNode node=new BinaryNode();
        if(node==null){
            return;
        }
        System.out.print(node.value+" -> ");
        PreOrder(node.left);
        PreOrder(node.right);


    }

    public void Inorder(BinaryNode node){
        System.out.println();
        if(node==null){
            return;
        }
        Inorder(node.left);
        System.out.print(node.value+" -> ");
        Inorder(node.right);
    }
    public void PostOrder(BinaryNode node){
        if(node==null){
            return;
        }
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.println(node.value+" -> ");
    }
    public void levelOrder(){
        Queue<BinaryNode> Q=new LinkedList<>();
            Q.add(root);
        while(!Q.isEmpty()){
            BinaryNode present =Q.remove();
            System.out.print(present.value+"-> ");
            if(present.left!=null){
                Q.add(present.left);
            }
            if(present.right!=null){
                Q.add(present.right);
            }
        }

    }
    public void Search(int val){
        System.out.println();
        Queue<BinaryNode> Q=new LinkedList<>();
        Q.add(root);
        while(!Q.isEmpty()){
            BinaryNode Pres=Q.remove();
            if(Pres.value==val){
                System.out.println("VALUE EXISTS IN THE TREE"+ val);
                return;
            }
            else{
                Q.add(Pres.left);
                Q.add(Pres.right);
            }
        }
    }

     BinaryNode fastSearch(BinaryNode node, int val){
        if(node==null){
            System.out.println("");
            return null;
        }
        else if(node.value==val) {
            System.out.println("ELEMENT FOUND"+val);
            return node;
        }
        else if(val< node.value){
            return fastSearch(node.left,val);
        }
         else {

            return fastSearch(node.left, val);
        }
    }

    public BinaryNode minimumVal(BinaryNode node){
        if(node.left==null){
            return node;
        }
        return minimumVal(node.left);
    }

    public BinaryNode Delete(BinaryNode root,int value){
        if(root==null){
            System.out.println("element not found");
            return null;
        }
        if(value< root.value){
            root.left=Delete(root.left,value);
        }
        else if(value> root.value){
            root.right=Delete(root.right,value);

        }
        else{
            if(root.left!=null&&root.right!=null){
                BinaryNode temp=root;
                BinaryNode minRight=minimumVal(temp.right);
                root.value= minRight.value;
                root.right=Delete(root.right, minRight.value);

            } else if (root.left!=null) {
                root=root.left;
            } else if (root.right!=null) {
                root=root.right;
            }
            else {
                root=null;
            }

        }
        return root;
    }


}
