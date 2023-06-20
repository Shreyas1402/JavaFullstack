package com.codekul.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        Binary_Search_Tree B=new Binary_Search_Tree();
        B.insert(70);
        B.insert(50);
        B.insert(30);
        B.insert(60);
        B.insert(90);
        B.insert(80);
        B.insert(20);
        B.insert(40);
        B.insert(100);
        B.PreOrder(B.root);
        System.out.println();
        B.Delete(B.root,90);
        B.PreOrder(B.root);
        System.out.println();
        System.out.println( B.minimumVal(B.root).value);

        //B.Inorder(B.root);
        //   B.PostOrder(B.root);
        //B.levelOrder();
       // B.Search(90);
          //  B.fastSearch(B.root,90);
    }

}
