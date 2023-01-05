package org.sunglowsys.InterviewProgram;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.calculateFactorial(5));

    }

    public int calculateFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
    return fact;

    }
}
