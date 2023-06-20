package com.codekul.Trees;



import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class SumofAllnodes {

    static int sum1=0;
    public static int lefty(Node root){
        if(root==null){
            return 0;
        }
        sum1+=root.data;
        lefty(root.left);
        lefty(root.right);
        return sum1;
    }
    static int sum2=0;
    public static int righty(Node root){
        if(root==null){
            return 0;
        }
        sum2+=root.data;
        righty(root.left);
        righty(root.right);
        return sum2;
    }
    public static int maxDifferenceBST(Node root,int target)
    {
        Queue<Node>Q=new LinkedList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        Q.add(root);
        map.put(root.data,-1);
        Node ans=null;

        if(root.data==target){
            ans=root;
        }
        int  mini=Integer.MIN_VALUE;
        while(!Q.isEmpty()){
            Node curr=Q.remove();
            if(curr.left!=null){
                map.put(curr.left.data,curr.data);
                if(curr.left.data==target){
                    ans=curr.left;
                    break;
                }
                Q.add(curr.left);
            }
            if(curr.right!=null){
                map.put(curr.right.data,curr.data);
                if(curr.right.data==target){
                    ans=curr.right;
                    break;
                }
                Q.add(curr.right);
            }
        }
        int sum=0;
        if(ans==null){
            return -1;}
        else{
            int key=ans.data;
            while(key!=-1){
                int val=map.get(key);
                sum+=val;
                key=val;
            }

            if(ans.left==null&&ans.right==null){
                return sum+1;
            }

            int l=lefty(ans.left);
            int r=righty(ans.right);
            System.out.println(l);
            System.out.println(r);
            int x=Math.min(l,r);



            return sum-x+1;
        }

    }


    public static void main(String[] args) {
        Node node=new Node(25);
        node.left=new Node(20);
        node.right=new Node(35);
        node.left.left=new Node(15);
        node.left.right=new Node(22);
        node.right.left=new Node(30);
        node.right.right=new Node(45);
        node.right.left.right=new Node(32);

        int c=maxDifferenceBST(node,35);
        System.out.println(c);


    }
}
