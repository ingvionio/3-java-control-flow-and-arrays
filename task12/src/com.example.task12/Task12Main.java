package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void selectionSort(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr != null && arr.length != 0) {
            for (int k = 0; k < arr.length - 1; k++) {


                int min = Integer.MAX_VALUE;
                int index = k;
                for (int i = k; i < arr.length; i++) {
                    if (arr[i] <= min) {
                        min = arr[i];
                        index = i;
                    }
                }

                int first = arr[k];
                arr[k] = min;
                arr[index] = first;

            }
        }
    }

}