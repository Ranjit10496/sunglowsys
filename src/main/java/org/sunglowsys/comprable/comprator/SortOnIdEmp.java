package org.sunglowsys.comprable.comprator;

import java.util.Comparator;

public class SortOnIdEmp implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
