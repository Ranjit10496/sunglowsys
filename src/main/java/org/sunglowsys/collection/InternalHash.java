package org.sunglowsys.collection;

import java.util.HashMap;
import java.util.Map;

public class InternalHash {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Ranjit", 111);
        map.put("Ranjit", 222);
        map.put("Amit", 333);
        System.out.println(map);
    }
}
