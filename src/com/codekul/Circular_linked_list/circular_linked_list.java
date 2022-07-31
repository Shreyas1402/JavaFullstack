package com.codekul.Circular_linked_list;

public class circular_linked_list {
    public Node Head;
    public Node Tail;
    public int size;

    public Node create(int value) {
        Head = new Node();
        Node node = new Node();// creating a blank node.
        node.value = value;
        node.next = node;
        Head = node;
        Tail = node;
        size = 1;
        return Head;

    }

    public void Insertion(int value, int location) {
        Node node = new Node();
        node.value = value;
        if (Head == null) {
            create(value);
            return;
        } else if (location == 0) {
            node.next = Head;
            Head = node;
            Tail.next = node;
        } else if (location >= size) {
            ;
            Tail.next = node;
            Tail = node;
            Tail.next = Head;
        } else {

            Node temp = Head;
            int index = 0;
            while (index < location - 1) {
                temp = temp.next;
                index++;
            }
            node.next = temp.next;
            temp.next = node;
        }
        size++;
    }

    public void Traversal() {
        if (Head != null) {
            Node node = new Node();
            Node temp = Head;
            for (int i = 0; i < size; i++) {
                System.out.print(temp.value);
                System.out.print("->");

                temp = temp.next;
            }
        }
    }

    public void Search(int value) {
        Node node = new Node();
        Node temp = Head;
        int i;
        if (Head != null) {
            for (i = 0; i < size; i++) {


                if (temp.value == value) {
                    System.out.println("Index is " + i);
                }

                 else{
                    System.out.println("dne");
                    temp = temp.next;


            }

        }

        }

    }
    public void Delete(int location){
        Node node =new Node();
        Node temp=Head;
        int index=0;
        if(Head==null){
            System.out.println("DNE");
            return;}
        else if (location==0) {
            Head.next=Head;
            Tail.next=Head;
            size--;

        } else if(location-size<1){
            Head=null;
            Tail=null;
            node.next=null;
        }
        else if (location>=size) {

             for(int i=0;i<location-1;i++){
                 temp=temp.next;
             }
             temp.next=Head;
             Tail=temp;
             size--;
             if(temp==Head){
                 Head.next=null;
                 Tail=Head=null;
             }


        }
        while(index<=location-1){
            temp=temp.next;
            index++;
        }
        temp.next=temp.next.next;
        size--;

    }
}


