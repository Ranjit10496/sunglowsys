package org.sunglowsys.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionThreadSafe {
    public static void main(String[] args) {
        List<String> al = Collections.synchronizedList(new ArrayList<>());
        al.add("Ranjit");
        al.add("Shivam");
        al.add("Amit");

        synchronized (al) {
            Iterator<String> itr = al.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("Madhu");
        copyOnWriteArrayList.add("Aditya");
        copyOnWriteArrayList.add("Yasvir");

        Iterator<String> itr = copyOnWriteArrayList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }


}
