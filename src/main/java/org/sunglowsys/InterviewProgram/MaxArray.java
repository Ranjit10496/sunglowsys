package org.sunglowsys.InterviewProgram;

public class MaxArray {
    public static void main(String[] args) {
        MaxArray array = new MaxArray();
        System.out.println(array.maxArray(new int[]{34, 56, 95, 90, 45}));
        System.out.println(array.minArray(new int[]{34, 56, 95, 90, 45}));

    }

    public int maxArray(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public int minArray(int a[]) {
        int min = a[0];
        for (int i = 1; i<a.length; i++) {
            if (a[i]<min) {
                min = a[i];
            }
        }
        return min;
    }


}
