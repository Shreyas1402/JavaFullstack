package com.codekul.Linked_list;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;


    public Node Create(int val) {
        head = new Node();// INTILIZED HEAD AS NEW NODE;
        Node node = new Node();
        node.next = null;
        node.value = val;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            Create(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    // traversal
    public void traversal() {
        Node node=new Node();
        Node tempnode = head;
        if (tempnode == null) {
            System.out.println("empty");
        }

        for (int i = 0; i <= size; i++) {
            System.out.println(tempnode.value);


            tempnode = tempnode.next;
        }
    }


    boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i=0; i<size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.print("Found the node at location: " +i+"\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("Node not found! ");
        return false;
    }
      public void deletion(int location){
        if(head==null){
            System.out.println("dne");
            return;
        } else if (location==0) {
            head=head.next;
            size--;
            if (size==0){
                tail=null;
            } else if (location>=size) {
                Node temp=head;
                for(int i=0;i<size-1;i++){
                    temp=temp.next;

                }
                if(temp==head){
                    tail=head=null;
                    size--;
                    return;
                }
                temp.next=null;
                tail=temp;
                size--;


            }


        }
      }
      public void ReverseDelete(int location){
        Node node =new Node();
        Node temp=head;
          for(int i=0;i<size-location-1;i++){



          }


          return;


      }

}


