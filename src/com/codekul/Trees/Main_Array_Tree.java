package com.codekul.Trees;

public class Main_Array_Tree {
    public static void main(String[] args) {
        Binary_T_Array B=new Binary_T_Array(9);
        B.Insert("N1");
        B.Insert("N2");
        B.Insert("N3");
        B.Insert("N4");
        B.Insert("N5");
         B.Insert("N6");
         B.Insert("N7");
        B.Insert("N8");
        B.Insert("N9");
      //  B.PreOrder(1);
       // B.Inorder(1);
      //  B.PostOrder(1);
       //B.LevelOrder();
       // B.Search("N7");
        B.Delete("N3");
        B.LevelOrder();

    }
}
