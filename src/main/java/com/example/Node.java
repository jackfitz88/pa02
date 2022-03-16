package com.example;

public class Node {
    Album data;
    Node prev;
    Node next;

    public Node(Album data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    @Override
    public String toString() {
        return data.toString();
    }
    
}
