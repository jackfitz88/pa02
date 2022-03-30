package com.example;

import java.util.ArrayList;

public class App1 {
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {

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

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        dll.shuffle(numbers).toString();
        

        // dll.append(a1);
        // dll.append(a2);
        // dll.append(a3);

        // dll.getIndex(a1);
        // dll.getIndex(a2);
        // dll.getIndex(a3);

        // a1.getArtistNames(artistNames1);

        //dll.Delete(0);
        
        //dll.toString();
    }
}
