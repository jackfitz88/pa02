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

    public Node Delete(int location) throws IllegalArgumentException, IllegalAccessException{
        if(this.head == null){
            throw new IllegalAccessException("out of bounds");
        }

        if(location == 0){
            Node toDelete = this.head;
            this.head = this.head.next;
            if(this.head == null){
                this.tail = null;
            }
            return toDelete;
        }

        int counter = 0;
        Node toDelete = this.head.next;
        while(toDelete != null){
            if(counter == location){
                Node next = toDelete.next;
                Node prev = toDelete.prev;

                prev.next = toDelete.next;

                if(next == null){
                    this.tail = prev;
                    return toDelete;
                }
                else{
                    next.prev = prev;
                    return toDelete;
                }
            }

            toDelete = toDelete.next;
            counter++;
        }

        throw new IllegalArgumentException();
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
            else{
                current = current.next;
                return count++;
            }
        }

        return -1;
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
        //counter % 2
    // }

    public DoublyLinkedList partition(Album data){
        //new arraly list return a array list
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
