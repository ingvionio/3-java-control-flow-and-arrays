package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {

        int[] arr = null;
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr!= null && arr.length != 0) {


            int min = Integer.MAX_VALUE;
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= min) {
                    min = arr[i];
                    index = i;
                }
            }

            int first = arr[0];
            arr[0] = min;
            arr[index] = first;

        }
    }

}