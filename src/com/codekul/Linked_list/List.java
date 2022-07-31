package com.codekul.Linked_list;

import org.w3c.dom.Node;

public class List {
    public NODE2 head;
    public NODE2 tail;
    public int size;

    public NODE2 list(int value){

        head=new NODE2();
        NODE2 node=new NODE2();
            node.a=null;
            node.value=value;
            head=node;
            tail=node;
            size=1;
            return head;

    }
    public void Insert(int val,int loc){
        NODE2 node=new NODE2();
        if(head==null){
            list(val);

            return;

        }
        else if(loc==0){
            node.a=head;
            head=node;


        } else if(loc>=size){
            node.a=null;
            tail.a=node;
            tail= node;
        }
           size++;
            }

    public void delete(){
      NODE2 node= new NODE2();
      int index=0;
      if(index<size) {
          head.a = null;
          tail.a = null;

          return;
      }

    }
}
