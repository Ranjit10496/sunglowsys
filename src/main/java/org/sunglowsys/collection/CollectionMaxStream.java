package org.sunglowsys.collection;

import java.util.Arrays;
import java.util.List;

public class CollectionMaxStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,34,5,4,65,67);
        int max = list.stream().max(Integer::compare).get();
        System.out.println(max);


        int min = list.stream().min(Integer::compare).get();
        System.out.println(min);
    }
}
