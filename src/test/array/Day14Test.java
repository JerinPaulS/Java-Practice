package test.array;

import main.array.Day14;

public class Day14Test {

    public static void main(String[] args) {
        // Array to hold test cases (150 test cases)
        int[][] testCases = {
                {1, 2, 3, 4, 5},                  // No repeating element
                {1, 2, 3, 1},                     // First repeating element is 1
                {3, 5, 4, 3, 2, 1},               // First repeating element is 3
                {5, 5, 5, 5, 5},                  // All elements are the same
                {6, 7, 8, 9, 6, 7, 8},            // First repeating element is 6
                {1},                              // No repeating element
                {100},                            // No repeating element
                {-1, -2, -3, -1},                 // First repeating element is -1
                {-5, -5, -1, -1},                 // First repeating element is -5
                {-2, -2, -3, -4},                 // First repeating element is -2
                {0, 1, 2, 3, 0},                  // First repeating element is 0
                {0, 0, 0},                        // All zeros repeating
                {1, 0, 1},                        // First repeating element is 1
                {1000000, 2000000, 1000000},       // First repeating element is 1000000
                {999999, 999999},                  // First repeating element is 999999
                {},                               // No repeating element
                {10, 20, 10, 30, 20, 40},         // First repeating element is 10
                {50, 60, 70, 80, 90, 60, 70},     // First repeating element is 60
                {100, 200, 300, 100, 200, 300},   // First repeating element is 100
                {1, 2, 3, 4, 5, 6, 7},            // No repeating element
                {10, 20, 30, 40, 50},             // No repeating element
                {1, 2, 1, 3, 2, 4},               // First repeating element is 1
                {5, 6, 7, 5, 8, 9, 6},            // First repeating element is 5
                {10, 11, 12, 13, 10, 14, 12},     // First repeating element is 10
                {1, 1, 2, 2, 3, 3},               // First repeating element is 1
                {5, 5, 6, 6, 7, 7},               // First repeating element is 5
                {100, 100, 200, 200, 300, 300},   // First repeating element is 100
                {1, 1},                           // First repeating element is 1
                {2, 2},                           // First repeating element is 2
                {3, 3},                           // First repeating element is 3
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},  // No repeating element
                {11, 12, 13, 14, 15, 16, 17},     // No repeating element
                {21, 22, 23, 24, 25, 26},         // No repeating element
                {100, 101, 102, 100},             // First repeating element is 100
                {1000, 2000, 3000, 1000},         // First repeating element is 1000
                {2000, 3000, 4000, 5000, 2000},   // First repeating element is 2000
                {1, 1, 1, 1, 1},                  // First repeating element is 1
                {100, 100, 100},                  // First repeating element is 100
                {1000, 1000, 1000, 1000},         // First repeating element is 1000
        };

        // Expected results for each test case
        int[] expectedResults = {
                -1, 1, 3, 5, 6,
                -1, -1, -1, -5, -2,
                0, 0, 1, 1000000, 999999,
                -1, 10, 60, 100, -1,
                -1, 1, 5, 10, 1,
                5, 100, 1, 2, 3,
                -1, -1, -1, 100, 1000,
                2000, 1, 100, 1000
        };

        int passed = 0;
        int failed = 0;

        // Iterate through test cases and compare the results with the expected output
        for (int i = 0; i < testCases.length; i++) {
            int result = Day14.repeatingElement(testCases[i]);
            if (result == expectedResults[i]) {
                passed++;
            } else {
                failed++;
                System.out.println("Test case " + (i + 1) + " failed. Expected: "
                        + expectedResults[i] + " Got: " + result);
            }
        }

        // Print the results
        System.out.println("Total test cases passed: " + passed);
        System.out.println("Total test cases failed: " + failed);
    }

}
