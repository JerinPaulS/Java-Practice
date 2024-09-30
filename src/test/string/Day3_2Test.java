package test.string;

import main.string.Day3_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day3_2Test {

    public static void main(String[] args) {
        int totalTests = 150;
        int passedTests = 0;

        List<TestCase> testCases = generateTestCases();

        for (TestCase testCase : testCases) {
            List<String> result = Day3_2.getPermutations(testCase.input);
            Collections.sort(result);
            Collections.sort(testCase.expectedOutput);

            if (result.equals(testCase.expectedOutput)) {
                passedTests++;
            } else {
                System.out.println("Test failed for input: " + testCase.input);
                System.out.println("Expected: " + testCase.expectedOutput);
                System.out.println("Got: " + result);
            }
        }

        System.out.println("Total Tests: " + totalTests);
        System.out.println("Passed: " + passedTests);
        System.out.println("Failed: " + (totalTests - passedTests));
    }

    private static List<TestCase> generateTestCases() {
        List<TestCase> testCases = new ArrayList<>();

        // Add test cases
        testCases.add(new TestCase("", Arrays.asList("")));
        testCases.add(new TestCase("a", Arrays.asList("a")));
        testCases.add(new TestCase("ab", Arrays.asList("ab", "ba")));
        testCases.add(new TestCase("abc", Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba")));
        testCases.add(new TestCase("aaa", Arrays.asList("aaa")));
        testCases.add(new TestCase("aab", Arrays.asList("aab", "aba", "baa")));
        testCases.add(new TestCase("abcde", Arrays.asList(
                "abcde", "abced", "abdce", "abdec", "abecd", "abedc", "acbde", "acbed", "acdbe",
                "acdeb", "acebd", "acedb", "adbce", "adbec", "adcbe", "adceb", "adebc", "adecb",
                "aebcd", "aebdc", "aecbd", "aecdb", "aedbc", "aedcb", "bacde", "baced", "badce",
                "badec", "baecd", "baedc", "bcade", "bcaed", "bcdae", "bcdea", "bcead", "bceda",
                "bdace", "bdaec", "bdcae", "bdcea", "bdeac", "bdeca", "beacd", "beadc", "becad",
                "becda", "bedac", "bedca", "cabde", "cabed", "cadbe", "cadeb", "caebd", "caedb",
                "cbade", "cbaed", "cbdae", "cbdea", "cbead", "cbeda", "cdabe", "cdaeb", "cdbae",
                "cdbea", "cdeab", "cdeba", "ceabd", "ceadb", "cebad", "cebda", "cedab", "cedba",
                "dabce", "dabec", "dacbe", "daceb", "daebc", "daecb", "dbace", "dbaec", "dbcae",
                "dbcea", "dbeac", "dbeca", "dcabe", "dcaeb", "dcbae", "dcbea", "dceab", "dceba",
                "deabc", "deacb", "debac", "debca", "decab", "decba", "eabcd", "eabdc", "eacbd",
                "eacdb", "eadbc", "eadcb", "ebacd", "ebadc", "ebcad", "ebcda", "ebdac", "ebdca",
                "ecabd", "ecadb", "ecbad", "ecbda", "ecdab", "ecdba", "edabc", "edacb", "edbac",
                "edbca", "edcab", "edcba")));

        // Add more cases with larger strings and various combinations
        for (int i = 0; i < 143; i++) {
            String input = "test" + i;
            List<String> expectedOutput = generatePermutations(input);
            testCases.add(new TestCase(input, expectedOutput));
        }

        return testCases;
    }

    private static List<String> generatePermutations(String str) {
        List<String> permutations = PermutationGenerator.getPermutations(str);
        Collections.sort(permutations);
        return permutations;
    }

    static class TestCase {
        String input;
        List<String> expectedOutput;

        TestCase(String input, List<String> expectedOutput) {
            this.input = input;
            this.expectedOutput = expectedOutput;
        }
    }

    class PermutationGenerator {

        public static List<String> getPermutations(String str) {
            List<String> permutations = new ArrayList<>();
            if (str == null || str.length() == 0) {
                permutations.add("");
                return permutations;
            }
            char firstChar = str.charAt(0);
            String remainingString = str.substring(1);
            List<String> words = getPermutations(remainingString);
            for (String word : words) {
                for (int i = 0; i <= word.length(); i++) {
                    permutations.add(insertCharAt(word, firstChar, i));
                }
            }
            return permutations;
        }

        private static String insertCharAt(String word, char ch, int i) {
            return word.substring(0, i) + ch + word.substring(i);
        }
    }

}
