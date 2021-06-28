package com.mrsyafapri.algorithm.searching;

import java.util.Scanner;

public class BinarySearch {
    public static int binary(int[] data, int query, int left, int right) {
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            // Element is present in the middle itself
            if (data[mid] == query)
                return mid;
            // Element is smaller than mid,
            // then it can only be present in left subarray
            else if (data[mid] > query)
                right = mid - 1;
            // Element can only be present in right subarray
            else
                left = mid + 1;
        }
        // Element is not present in array
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] data = { 2, 4, 5, 10, 17, 23, 40, 50, 60, 70 };

        System.out.print("Enter query: ");
        int query = input.nextInt();

        input.close();

        int result = binary(data, query, 0, data.length - 1);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.printf("Element is present at index %d", result);
    }
}
