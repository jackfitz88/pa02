package com.example;

import java.util.ArrayList;

public class App1 {
    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();
        

        ArrayList<String> artistNames1 = new ArrayList<>();
        artistNames1.add("Travis Scott");
        Album a1 = new Album(45, 9, "Astroworld", artistNames1);
        

        ArrayList<String> artistNames2 = new ArrayList<>();
        artistNames2.add("J. Cole");
        Album a2 = new Album(17, 15, "KOD", artistNames2);
        

        ArrayList<String> artistNames3 = new ArrayList<>();
        artistNames3.add("Jack Fitz");
        artistNames3.add("RI RI 101");
        Album a3 = new Album(88, 21, "Dalcony", artistNames3);
        

        dll.append(a1);
        dll.append(a2);
        dll.append(a3);
        
        dll.toString();
    }
}
