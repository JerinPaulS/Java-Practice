package test.string;

import main.string.Day4_1;

import java.util.ArrayList;
import java.util.List;

public class Day4_1Test {

    public static void main(String[] args) {
        int totalTests = 150;
        int passedTests = 0;

        List<TestCase> testCases = generateTestCases();

        for (TestCase testCase : testCases) {
            int result = Day4_1.findFirstOccurrence(testCase.str, testCase.subStr);

            if (result == testCase.expectedResult) {
                passedTests++;
            } else {
                System.out.println("Test failed for input: (" + testCase.str + ", " + testCase.subStr + ")");
                System.out.println("Expected: " + testCase.expectedResult);
                System.out.println("Got: " + result);
            }
        }

        System.out.println("Total Tests: " + totalTests);
        System.out.println("Passed: " + passedTests);
        System.out.println("Failed: " + (totalTests - passedTests));
    }

    private static List<TestCase> generateTestCases() {
        List<TestCase> testCases = new ArrayList<>();

        // Add basic cases
        testCases.add(new TestCase("hello", "lo", 3));
        testCases.add(new TestCase("hello", "he", 0));
        testCases.add(new TestCase("hello", "o", 4));
        testCases.add(new TestCase("hello", "hello", 0));
        testCases.add(new TestCase("hello", "world", -1));
        testCases.add(new TestCase("hello", "", 0));
        testCases.add(new TestCase("", "hello", -1));
        testCases.add(new TestCase("", "", 0));

        // Add cases with repeated substrings
        testCases.add(new TestCase("banana", "na", 2));
        testCases.add(new TestCase("banana", "ba", 0));
        testCases.add(new TestCase("banana", "an", 1));

        // Add cases with special characters
        testCases.add(new TestCase("abc$def", "$", 3));
        testCases.add(new TestCase("abc$def$", "$", 3));
        testCases.add(new TestCase("abc$def$", "f$", 6));

        // Add longer strings
        testCases.add(new TestCase("this is a test string", "test", 10));
        testCases.add(new TestCase("this is a test string", "is", 2));
        testCases.add(new TestCase("this is a test string", "is a", 5));
        testCases.add(new TestCase("this is a test string", "string", 15));

        // Add cases with overlapping substrings
        testCases.add(new TestCase("aaaaaa", "aa", 0));
        testCases.add(new TestCase("abababab", "abab", 0));
        testCases.add(new TestCase("abababab", "bab", 1));

        // Add edge cases with null
        testCases.add(new TestCase(null, "test", -1));
        testCases.add(new TestCase("test", null, -1));
        testCases.add(new TestCase(null, null, -1));

        // Dynamically generated cases
        for (int i = 0; i < 123; i++) {
            String str = generateString("test", i);
            String subStr = generateSubstring("test", i);
            int expected = str.indexOf(subStr);
            testCases.add(new TestCase(str, subStr, expected));
        }

        return testCases;
    }

    private static String generateString(String base, int multiplier) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < multiplier + 1; i++) {
            sb.append(base);
        }
        return sb.toString();
    }

    private static String generateSubstring(String base, int multiplier) {
        return base.substring(0, Math.max(1, (multiplier % base.length()) + 1));
    }

    static class TestCase {
        String str;
        String subStr;
        int expectedResult;

        TestCase(String str, String subStr, int expectedResult) {
            this.str = str;
            this.subStr = subStr;
            this.expectedResult = expectedResult;
        }
    }

}
