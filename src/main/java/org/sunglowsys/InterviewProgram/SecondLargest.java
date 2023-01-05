package org.sunglowsys.InterviewProgram;

public class SecondLargest {
    public static void main(String[] args) {
        SecondLargest largest = new SecondLargest();
        System.out.println(largest.secondLarg(new int[]{45, 23, 13, 46, 76}));
        System.out.println(largest.secondLow(new int[]{45, 23, 13, 46, 76}));
    }

    public int secondLarg(int arr[]) {
        int max, size;
        size = arr.length;

        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    max = arr[i];
                    arr[i] = arr[j];
                    arr[j] = max;
                }
            }
        }
        return arr[size - 1];
    }

    public int secondLow(int arr[]) {
        int max, size;
        size = arr.length;

        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {
                if (arr[i] < arr[j]) {
                    max = arr[i];
                    arr[i] = arr[j];
                    arr[j] = max;
                }
            }

        }
        return arr[size - 2];
    }
}
