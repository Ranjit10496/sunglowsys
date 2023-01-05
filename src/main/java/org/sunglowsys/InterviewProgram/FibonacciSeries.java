package org.sunglowsys.InterviewProgram;

public class FibonacciSeries {
    public static void main(String[] args) {
        FibonacciSeries series = new FibonacciSeries();
        series.getFibonacci(10);
    }

    public int getFibonacci(int num) {
        int a = 0, b = 1, c;
        for (int i = 2; i <= num; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
        return num;
    }
}
