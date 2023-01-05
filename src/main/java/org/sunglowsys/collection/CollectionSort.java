package org.sunglowsys.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Ranjit");
        al.add("Amit");
        al.add("Shivam");
        al.add("Aditya");
        //ascending order
        Collections.sort(al);

        System.out.println(al);
        //Descending order
        Collections.sort(al, Collections.reverseOrder());

        System.out.println(al);

    }
}
