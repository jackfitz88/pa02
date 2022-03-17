package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class AlbumTest {
    
    @Test
    public void testConstructor() {
        
    }

    @Test
    public void testToString() {
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

        a1.toString();
        a2.toString();
        a3.toString();

        assertEquals("45: 9 -- [ [] ]", a1.toString());
        assertEquals("17: 15 -- [ [] ]", a2.toString());
        assertEquals("88: 21 -- [ [] ]", a3.toString());

    }

    @Test
    public void testCompareTo() {
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

        a1.compareTo(a2);
        a2.compareTo(a3);
        a3.compareTo(a1);

        assertEquals(-1, a1.compareTo(a2));
        assertEquals(-1, a2.compareTo(a3));
        assertEquals(1, a3.compareTo(a1));
    }


}
