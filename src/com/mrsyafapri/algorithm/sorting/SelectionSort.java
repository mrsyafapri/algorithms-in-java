package com.mrsyafapri.algorithm.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] data = { 100, 20, 17, 15, 30, 5, 1, 75, 40, 85 };
        System.out.print("Before Sort\t: ");
        printArray(data);

        selection(data);
        System.out.print("After Sort\t: ");
        printArray(data);
    }

    public static int[] selection(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            // Temukan elemen minimum dalam array yang belum disortir
            int min_idx = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[min_idx])
                    min_idx = j;
            }
            // Swap elemen minimum yang ditemukan dengan elemen pertama
            int temp = data[min_idx];
            data[min_idx] = data[i];
            data[i] = temp;
            // Print process
            System.out.printf("Iteration %d\t: ", (i + 1));
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
