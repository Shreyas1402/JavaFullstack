package com.codekul.Linked_list_problems;

import java.util.Arrays;
import java.util.HashSet;

public class Linked_list {
    public Node head;
    public Node tail;
    public int size=1;
    public void create(int value){
        Node node =new Node();
        node.value=value;
        node.next=null;
        head=node;
        tail=node;
    }
    public void Insert(int value){
        Node node=new Node();
        node.value=value;
        node.next=null;
        tail.next=node;
        tail=node;
        size++;

    }
    public void delete(int x){
        Node node=new Node();
        Node temp=head;
        for(int i=0;i<x-1;i++){
            temp=temp.next;

        }
        temp.next=temp.next.next;
    }
    public void Traversal(){
        Node node=new Node();
        Node temp;
        temp=head;
        for(int i=0;i<size;i++){
            System.out.print(temp.value);
            System.out.print("->");
            temp=temp.next;
        }


    }
    public Node deletedups(Node nod){
        Node node=new Node();
        Node curr=head;
        Node prev=null;

        HashSet<Integer>hs=new HashSet<>();
        while(curr.next!=null){
            int curval= curr.value;
            if(hs.contains(curval)){
                prev.next=curr.next;
                size--;
                curr=curr.next;
            }
            else{
                hs.add(curval);
                prev=curr;
                curr=curr.next;

            }



        }
        return prev;



    }
    public void partition(int x){
        Node node =new Node();
        Node temp=head;
         tail=head;

       while(temp!=null){
           Node cur=temp.next;
            if(temp.value<x){
               temp.next=head;
               head=temp;

            }
            else{
                tail.next=temp;
                tail=temp;
            }
             cur=temp.next;
        }
       tail.next=null;
    }
}
