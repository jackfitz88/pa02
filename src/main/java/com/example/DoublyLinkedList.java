package com.example;

import java.util.ArrayList;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int size;

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public Node append(Album data){
        Node toAppend = new Node(data);

        if (this.head == null) {
            this.head = toAppend;
            this.tail = toAppend;
            this.head.prev = null;
            this.tail.next = null;
        }
        else{
            this.tail.next = toAppend;
            toAppend.prev = this.tail;
            this.tail = toAppend;
            this.tail.next = null;
        }
        return toAppend;

    }

    public Node insert(int location, Album data){
        Node toInsert = new Node(data);


        if(location == 0){
            this.head = toInsert;
            toInsert.prev = this.head;
            this.head.next = this.tail;
        }

        return toInsert;
    }

    public Node delete(Album data){

        Node toDelete = null;

        if(this.head.data.compareTo(data) == 0){
            toDelete = this.head;
            this.head = this.head.next;

            return toDelete;
        }

        Node current = this.head;

        while(current.next != null){
            if(current.next.data.compareTo(data) == 0){
                toDelete = current.next;
                
                current.next = toDelete.next;
                current.prev.next = current.next;
                toDelete.next = null;
                return toDelete;
            }

        }

        return toDelete;
    }
    
    public int getIndex(Album data){
        Node current = this.head;
        int count = 0;

        while(current.next != null){
            if(current.data.compareTo(data) == 0){
                return count;
            }
            else if(current.next.data.compareTo(data) == 0){
                count++;
            }
            else{
                return -1;
            }
            break;
        }

        return count;
    }

    public String toString(){
        Node toPrint = this.head;

        StringBuilder stringBuilder = new StringBuilder();
        
        while(toPrint != null){
            stringBuilder.append(toPrint.data);
            stringBuilder.append(" -> ");
            toPrint = toPrint.next;
        }

        stringBuilder.append("Null");

        return stringBuilder.toString();
    }

    // public ArrayList<Integer> shuffle(){
        
    // }

    public DoublyLinkedList partition(Album data){
        Node current = this.head;
        DoublyLinkedList dll = new DoublyLinkedList();

        while(current.next != null){
            if(current.data.compareTo(data) > 1){
                dll.append(current.data);
            }
            current = current.next;
        }

        return dll;
    }


}
