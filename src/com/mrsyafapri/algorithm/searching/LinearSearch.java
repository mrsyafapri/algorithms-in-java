package com.mrsyafapri.algorithm.searching;

import java.util.Scanner;

public class LinearSearch {
    public static int linear(int[] data, int query) {
        for (int i = 0; i < data.length; i++) {
            if (query == data[i])
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] data = { 2, 4, 5, 10, 17, 23, 40, 50, 60, 70 };

        System.out.print("Enter query: ");
        int query = input.nextInt();

        input.close();

        int result = linear(data, query);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.printf("Element is present at index %d", result);
    }
}
