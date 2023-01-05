package org.sunglowsys.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionSortStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 34, 5, 4, 65, 67);
        List<Integer> list1 = list.stream().sorted().collect(Collectors.toList());
        System.out.println(list1);


        List<Integer> list2 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(list2);

    }
}
