package test.string;

import main.string.Day5_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day5_1Test {

    public static void main(String[] args) {
        int totalTests = 150;
        int passedTests = 0;

        List<TestCase> testCases = generateTestCases();

        for (TestCase testCase : testCases) {
            int[] result = Day5_1.countVowelsAndConsonants(testCase.input);

            if (Arrays.equals(result, testCase.expectedResult)) {
                passedTests++;
            } else {
                System.out.println("Test failed for input: " + testCase.input);
                System.out.println("Expected: " + Arrays.toString(testCase.expectedResult));
                System.out.println("Got: " + Arrays.toString(result));
            }
        }

        System.out.println("Total Tests: " + totalTests);
        System.out.println("Passed: " + passedTests);
        System.out.println("Failed: " + (totalTests - passedTests));
    }

    private static List<TestCase> generateTestCases() {
        List<TestCase> testCases = new ArrayList<>();

        // Add basic test cases
        testCases.add(new TestCase("hello", new int[]{2, 3}));
        testCases.add(new TestCase("aeiou", new int[]{5, 0}));
        testCases.add(new TestCase("bcdfgh", new int[]{0, 6}));
        testCases.add(new TestCase("", new int[]{0, 0}));
        testCases.add(new TestCase("HELLO", new int[]{2, 3}));
        testCases.add(new TestCase("aAeEiIoOuU", new int[]{10, 0}));

        // Add cases with special characters and numbers
        testCases.add(new TestCase("h3ll0 wOrld!", new int[]{1, 7}));
        testCases.add(new TestCase("!@#$%^&*()", new int[]{0, 0}));
        testCases.add(new TestCase("Java123", new int[]{2, 2}));

        // Add cases with spaces and mixed cases
        testCases.add(new TestCase("Hello World", new int[]{3, 7}));
        testCases.add(new TestCase("Quick Brown Fox", new int[]{4, 9}));

        // Add cases with non-ASCII characters
        testCases.add(new TestCase("こんにちは", new int[]{0, 0}));
        testCases.add(new TestCase("cafe", new int[]{2, 2}));

        // Add dynamically generated cases
        for (int i = 0; i < 137; i++) {
            String str = generateString("test", i);
            int[] expectedResult = calculateExpectedVowelsAndConsonants(str);
            testCases.add(new TestCase(str, expectedResult));
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

    private static int[] calculateExpectedVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[]{vowels, consonants};
    }

    static class TestCase {
        String input;
        int[] expectedResult;

        TestCase(String input, int[] expectedResult) {
            this.input = input;
            this.expectedResult = expectedResult;
        }
    }

}
