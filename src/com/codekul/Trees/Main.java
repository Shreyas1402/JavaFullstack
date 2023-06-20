package com.codekul.Trees;

public class Main {
    public static void main(String[] args) {
        TreeNode Drinks=new TreeNode("Drinks");
        TreeNode Hot=new TreeNode("Hot");
        TreeNode Cold=new TreeNode("cold");
        Drinks.addchild(Hot);
        Drinks.addchild(Cold);
        System.out.println(Drinks.print(2));





    }
}
