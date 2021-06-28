package com.mrsyafapri.algorithm.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] data = { 100, 20, 17, 15, 30, 5, 1, 75, 40, 85 };
        System.out.print("Before Sort\t: ");
        printArray(data);

        bubble(data);
        System.out.print("After Sort\t: ");
        printArray(data);
    }

    public static int[] bubble(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                boolean isTheOrderCorrect = data[j] < data[j + 1];
                if (!isTheOrderCorrect) {
                    // Swap data[j + 1] and data[j]
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
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
