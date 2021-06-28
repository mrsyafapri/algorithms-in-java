package com.mrsyafapri.algorithm.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] data = { 100, 20, 17, 15, 30, 5, 1, 75, 40, 85 };
        System.out.print("Before Sort\t: ");
        printArray(data);

        insertion(data);
        System.out.print("After Sort\t: ");
        printArray(data);
    }

    public static int[] insertion(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int key = data[i];
            int j = i - 1;
            // Jika kita mendapatkan nilai yang lebih kecil dari key,
            // maka kita berhenti di indeks itu
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }
            // Kita akan menempatkan key pada indeks itu
            data[j + 1] = key;
            // Print process
            System.out.printf("Iteration %d\t: ", i);
            printArray(data);
        }
        return data;
    }

    public static void printArray(int[] data) {
        for (int arr : data) {
            System.out.print(arr + " ");
        }
        System.out.println();
    }
}
