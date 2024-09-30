package main.array;

//How do you sort an array in Java? Write a program to sort an array using Arrays.sort(). Write a program to merge two sorted arrays into a single sorted array.
//https://leetcode.com/problems/merge-sorted-array/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Day11 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number of elements: ");
        int count = Integer.parseInt(br.readLine());

        int[] nums = ArrayBuilder.createNumberArray(count);
        naturalSort(nums);
        mergeArrays(nums, 0, nums, 0);

    }

    private static void naturalSort(int[] nums) {
        System.out.println("Array before sorting");
        ArrayBuilder.display(nums);

        Arrays.sort(nums);
        System.out.println("Array after sorting");
        ArrayBuilder.display(nums);
    }

    public static void mergeArrays(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        int index2 = n - 1;

        int curr = nums1.length - 1;

        while (index2 >= 0) {
            if (index1 >=0 && nums1[index1] > nums2[index2]) {
                nums1[curr] = nums1[index1];
                index1--;
            } else {
                nums1[curr] = nums2[index2];
                index2--;
            }
            curr--;
        }

    }

}
