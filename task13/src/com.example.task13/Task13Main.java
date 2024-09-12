package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {

        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);

    }

    static int[] removeMoreThen1000(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr != null && arr.length != 0) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 1000) {
                    count += 1;
                }
            }

            int[] newArr = new int[arr.length - count];
            int j = 0;
            for (int k = 0; k < arr.length; k++) {
                if (arr[k] <= 1000) {
                    newArr[j] = arr[k];
                    j++;
                }
            }
            return newArr;
        }
        else {
            return arr;
        }
    }

}