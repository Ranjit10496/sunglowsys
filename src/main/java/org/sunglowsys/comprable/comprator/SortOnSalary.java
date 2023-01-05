package org.sunglowsys.comprable.comprator;

import java.util.Comparator;

public class SortOnSalary implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) ((int) o1.getSalary()-o2.getSalary());
//        if (o1.getSalary() == o2.getSalary()) {
//            return 0;
//        } else if (o1.getSalary() > o2.getSalary()) {
//            return 1;
//        }else {
//            return -1;
//        }
    }
}
