package org.sunglowsys.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorIn {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ranjit");
        list.add("Shiva");
        list.add("Amit");
        list.add("Aditya");

        System.out.println("forward direction");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }


        System.out.println("Backward direction---------------------------------------------");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

    }
}
