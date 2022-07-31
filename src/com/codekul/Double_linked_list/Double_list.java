package com.codekul.Double_linked_list;



import java.net.PortUnreachableException;

public class Double_list {
    Double_Node node = new Double_Node();
    public Double_Node head;
    public Double_Node tail;
    int size;

    public Double_Node Create(int value) {
        Double_Node node = new Double_Node();
        head = new Double_Node();
        node.value = value;
        node.next = null;
        node.prev = null;
        head = node;
        tail = node;
        size = 1;
        return head;

    }

    public void Insertion(int value, int location) {
        Double_Node node = new Double_Node();
        node.value = value;
        int index = 0;
        if (head == null) {
            Create(value);
            return;

        } else if (location == 0) {
            node.next = head;
            node.prev = null;
            head.prev = node;
            head = node;


        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            node.prev = tail;
            tail = node;

        } else {
            Double_Node temp = head;
            while (index < location - 1) {
                temp = temp.next;
                index++;
            }
            node.next = temp.next;
            node.prev = temp;
            temp.next = node;
            node.next.prev = node;
        }
        size++;
    }

    public void Traversal() {
        Double_Node node = new Double_Node();
        Double_Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value);
            temp = temp.next;
            System.out.print ("<->");
        }




    }
    public void Reverse(){
        Double_Node node =new Double_Node();
        Double_Node temp=tail;
        System.out.println("");
        for(int i=size;i>=0;i--){

            System.out.print(temp.value);
            temp=temp.prev;
            System.out.print("<->");
        }
    }
    public boolean Search(int value){
        System.out.println(" ");
        Double_Node node =new Double_Node();
        Double_Node temp=head;
        node.value=value;
        if(head!=null){
            for(int i=0;i<=size;i++){
                if(temp.value==value){
                    System.out.println("INDEX IS "+i);
                    return true;
                }
                temp=temp.next;
            }
        }
        else{
            System.out.println("ELEMENT DOESNT EXIST");

        }
        return false;
    }
    public void Delete(int location){
        Double_Node node=new Double_Node();
        if(head==null){
            System.out.println("DNE");
        }
        else if(location==0){
            if(size==1) {
                head.next = null;
                tail.next = null;
                return;
            }
            else{
                head=head.next;
                head.prev=null;
                size--;
            }


        }else if(location>=size){
            Double_Node temp=tail.prev;
          if(size==1){
              head=null;
              tail=null;
              size--;
              return;

          }
          temp.next=null;
          tail=temp;
          size--;


        }else {
            int index = 0;
            Double_Node temp = head;
            while (index < location - 1) {
                temp = temp.next;
                index++;
            }
            temp.next.next = temp.next;
            temp.next.prev = temp;
            size--;
        }
    }
}



