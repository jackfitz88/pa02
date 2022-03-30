package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        assertEquals("45: 9 -- [  ]", dll.head.data.toString());

        dll.append(a2);
        assertEquals("17: 15 -- [  ]", dll.head.next.data.toString());

        dll.append(a3);
        assertEquals("88: 21 -- [  ]", dll.head.next.next.data.toString());
    }

    @Test
    public void testDelete() throws IllegalArgumentException, IllegalAccessException {
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

        ArrayList<String> artistNames4 = new ArrayList<>();
        Album a4 = new Album(94, 6, "The Sopranos", artistNames4);
        

        dll.append(a1);
        dll.append(a2);
        dll.append(a3);

        assertEquals(null, dll.delete(a4));
        assertEquals("1 -> 2 -> 3 -> 4 -> Null", dll.toString());

        assertEquals(1, dll.delete(a1).data);
        assertEquals("2 -> 3 -> 4 -> Null", dll.toString());

        assertEquals(3, dll.delete(a3).data);
        assertEquals("2 -> 4 -> Null", dll.toString());
    }

    @Test
    public void testInsert() {
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

        ArrayList<String> artistNames4 = new ArrayList<>();
        artistNames4.add("");
        Album a4 = new Album(94, 6, "The Sopranos", artistNames4);
        
        dll.append(a1);
        dll.append(a2);
        dll.append(a3);
        dll.insert(0, a4);

        assertEquals("94: 6 -- [  ]", dll.head.data.toString());

    }

    @Test
    public void testGetIndex() {
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

        ArrayList<String> artistNames4 = new ArrayList<>();
        artistNames4.add("");
        Album a4 = new Album(94, 6, "The Sopranos", artistNames4);

        dll.append(a1);
        dll.append(a2);
        dll.append(a3);
        
        assertEquals(0, dll.getIndex(a1));
        assertEquals(1, dll.getIndex(a2));
        assertEquals(2, dll.getIndex(a3));
        assertEquals(-1, dll.getIndex(a4));
    }

    @Test
    public void testShuffle() {
        DoublyLinkedList dll = new DoublyLinkedList();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        assertEquals("[2, 1, 4, 3, 6, 5]", dll.shuffle(numbers).toString());
        
    }

    @Test
    public void testPartition() {
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

        // boolean isSame = ("[17: 15 -- [  ] -> Null]").equals(dll.partition(a1));
        // assertTrue(isSame);
        assertEquals("17: 15 -- [  ] -> Null", dll.partition(a1).toString());
        assertEquals("Null", dll.partition(a2).toString());
        assertEquals("Null", dll.partition(a3).toString());
    }
}
