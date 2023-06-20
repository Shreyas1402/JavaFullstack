package com.codekul.Trees;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class TreeNode {
    String data;
    ArrayList<TreeNode>child;

    public TreeNode(String data){
        this.data=data;
        this.child=new ArrayList<>();

    }

    public void addchild(TreeNode node){
        this.child.add(node);
    }
    public String print(int level){
        String ret;
        ret="-> ".repeat(level)+data+"\n";
        for(TreeNode node:this.child){
          ret =ret+node.print(level+1);
        }
        return ret;
    }


}
