package main.array;

//Write a program to find the second-largest element in an array. Write a program to find the intersection of two arrays.
//https://leetcode.com/problems/intersection-of-two-arrays/description/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Day12 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the count of elements: ");
        int count1 = Integer.parseInt(br.readLine());

        System.out.print("Enter the count of elements: ");
        int count2 = Integer.parseInt(br.readLine());

        int[] nums1 = ArrayBuilder.createNumberArray(count1);
        int[] nums2 = ArrayBuilder.createNumberArray(count2);

        System.out.println("Array1 -> ");
        ArrayBuilder.display(nums1);
        System.out.println("Array2 -> ");
        ArrayBuilder.display(nums2);

        System.out.println("The second largest number in the array is: " + secondLargestNumber(nums1));
        System.out.println("The second largest number in the array is: " + secondLargestNumber(nums2));

        System.out.println("The intersection of two arrays: ");
        ArrayBuilder.display(intersection(nums1, nums2));
    }

    private static int secondLargestNumber(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length - 2];
        int max1 = nums[0];
        int max2 = nums[0];

        for (int index=1; index<nums.length; index++) {
            int curr = nums[index];
            if (curr > max1) {
                max2 = max1;
                max1 = curr;
            } else if (curr > max2){
                max2 = curr;
            }
        }
        return max2;
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                res.add(num);
            }
        }

        int[] result = new int[res.size()];
        int index = 0;

        for (int num : res) {
            result[index++] = num;
        }
        return result;
    }

}
