package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;

class DoublyLinkedListTest {
    
    
    @Test
    public void testConstructor() {
        
    }

    @Test
    public void testAppend() {
        DoublyLinkedList dll = new DoublyLinkedList();
        assertNull(dll.head);

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
        assertEquals("45: 9 -- [ [] ]", dll.head.data);

        dll.append(a2);
        assertEquals("17: 15 -- [ [] ]", dll.head.next.data);

        dll.append(a3);
        assertEquals("88: 21 -- [ [] ]", dll.head.next.next.data);
    }
}
