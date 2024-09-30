package main.array;

// Write a program to rotate an array by k positions to the right.
//https://leetcode.com/problems/rotate-array/description/
// Write a program to find the first repeating element in an array. The element should appear more than once and its index of the first occurrence should be the smallest.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Day14 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the count of elements: ");
        int count = Integer.parseInt(br.readLine());
        System.out.print("Enter the positions of rotation: ");
        int k = Integer.parseInt(br.readLine());
        int[] nums = ArrayBuilder.createNumberArray(count);

        System.out.println("Array before rotation");
        ArrayBuilder.display(nums);

        System.out.println("Array after rotation");
        rotate(nums, k);
        ArrayBuilder.display(nums);
    }

    public static int repeatingElement(int[] arr) {
        HashMap<Integer, List<Integer>> numberMapping = new HashMap<>();

        for (int index=0; index<arr.length; index++) {
            int num = arr[index];
            if (numberMapping.containsKey(num)) {
                List<Integer> values = numberMapping.get(num);
                values.add(index);
                numberMapping.put(num, values);
            } else {
                List<Integer> values = new ArrayList<>();
                values.add(index);
                numberMapping.put(num, values);
            }
        }

        for (int num : arr) {
            if (numberMapping.get(num).size() > 1) {
                return num;
            }
        }
        return -1;
    }

    private static void rotate(int[] nums, int k) {
        int size = nums.length;
        k = k % size;
        if (size <= 1) {
            return;
        }
        swap(nums, 0, size - 1);
        swap(nums, 0, k - 1);
        swap(nums, k, size - 1);
    }

    private static void swap(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
