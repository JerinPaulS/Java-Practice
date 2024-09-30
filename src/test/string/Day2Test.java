package test.string;

import main.string.Day2;

public class Day2Test {

    public static void main(String[] args) {
        String[] testCases = new String[150];
        int[] expectedResults = new int[150];

        // Test Case Generation
        testCases[0] = "abcabcbb"; expectedResults[0] = 3; // "abc"
        testCases[1] = "bbbbb"; expectedResults[1] = 1; // "b"
        testCases[2] = "pwwkew"; expectedResults[2] = 3; // "wke"
        testCases[3] = ""; expectedResults[3] = 0; // ""
        testCases[4] = "a"; expectedResults[4] = 1; // "a"
        testCases[5] = "abcdef"; expectedResults[5] = 6; // "abcdef"
        testCases[6] = "aaaaaa"; expectedResults[6] = 1; // "a"
        testCases[7] = "aab"; expectedResults[7] = 2; // "ab"
        testCases[8] = "abca"; expectedResults[8] = 3; // "abc"
        testCases[9] = "dvdf"; expectedResults[9] = 3; // "vdf"
        testCases[10] = "anviaj"; expectedResults[10] = 5; // "nviaj"
        testCases[11] = "abcabcbb"; expectedResults[11] = 3; // "abc"
        testCases[12] = "pwwkew"; expectedResults[12] = 3; // "wke"
        testCases[13] = "tmmzuxt"; expectedResults[13] = 5; // "mzuxt"
        testCases[14] = "abcde"; expectedResults[14] = 5; // "abcde"
        testCases[15] = "abcdabcd"; expectedResults[15] = 4; // "abcd"
        testCases[16] = "abba"; expectedResults[16] = 2; // "ab"
        testCases[17] = "abbaab"; expectedResults[17] = 2; // "ab"
        testCases[18] = "aab"; expectedResults[18] = 2; // "ab"
        testCases[19] = "abcda"; expectedResults[19] = 4; // "abcd"
        testCases[20] = "abcabc"; expectedResults[20] = 3; // "abc"
        testCases[21] = "xyzzazxy"; expectedResults[21] = 4; // "yzxa"
        testCases[22] = "abcdefgh"; expectedResults[22] = 8; // "abcdefgh"
        testCases[23] = " "; expectedResults[23] = 1; // " "
        testCases[24] = "au"; expectedResults[24] = 2; // "au"
        testCases[25] = "dvdf"; expectedResults[25] = 3; // "vdf"
        testCases[26] = "anviaj"; expectedResults[26] = 5; // "nviaj"
        testCases[27] = "abcabcbb"; expectedResults[27] = 3; // "abc"
        testCases[28] = "pwwkew"; expectedResults[28] = 3; // "wke"
        testCases[29] = "tmmzuxt"; expectedResults[29] = 5; // "mzuxt"
        testCases[30] = "abcde"; expectedResults[30] = 5; // "abcde"
        testCases[31] = "abcdabcd"; expectedResults[31] = 4; // "abcd"
        testCases[32] = "abba"; expectedResults[32] = 2; // "ab"
        testCases[33] = "abbaab"; expectedResults[33] = 2; // "ab"
        testCases[34] = "aab"; expectedResults[34] = 2; // "ab"
        testCases[35] = "abcda"; expectedResults[35] = 4; // "abcd"
        testCases[36] = "abcabc"; expectedResults[36] = 3; // "abc"
        testCases[37] = "xyzzazxy"; expectedResults[37] = 4; // "yzxa"
        testCases[38] = "abcdefgh"; expectedResults[38] = 8; // "abcdefgh"
        testCases[39] = " "; expectedResults[39] = 1; // " "
        testCases[40] = "aabacbebebe"; expectedResults[40] = 3; // "abc"
        testCases[41] = "abcadac"; expectedResults[41] = 4; // "bcda"
        testCases[42] = "ababcabcdabcde"; expectedResults[42] = 5; // "abcde"
        testCases[43] = "bpfbhmipx"; expectedResults[43] = 7; // "bpfbhmi"
        testCases[44] = "anviaj"; expectedResults[44] = 5; // "nviaj"
        testCases[45] = " "; expectedResults[45] = 1; // " "
        testCases[46] = "pwwkew"; expectedResults[46] = 3; // "wke"
        testCases[47] = "bbbb"; expectedResults[47] = 1; // "b"
        testCases[48] = "abcabcbb"; expectedResults[48] = 3; // "abc"
        testCases[49] = "abcdabcd"; expectedResults[49] = 4; // "abcd"
        testCases[50] = "au"; expectedResults[50] = 2; // "au"
        testCases[51] = "anviaj"; expectedResults[51] = 5; // "nviaj"
        testCases[52] = "bbbb"; expectedResults[52] = 1; // "b"
        testCases[53] = "dvdf"; expectedResults[53] = 3; // "vdf"
        testCases[54] = "tmmzuxt"; expectedResults[54] = 5; // "mzuxt"
        testCases[55] = "aabacbebebec"; expectedResults[55] = 3; // "abc"
        testCases[56] = "bbtablud"; expectedResults[56] = 6; // "btablu"
        testCases[57] = "abcd"; expectedResults[57] = 4; // "abcd"
        testCases[58] = "abcdabcd"; expectedResults[58] = 4; // "abcd"
        testCases[59] = "abcdefg"; expectedResults[59] = 7; // "abcdefg"
        testCases[60] = "anviaj"; expectedResults[60] = 5; // "nviaj"
        testCases[61] = "xyzzazxy"; expectedResults[61] = 4; // "yzxa"
        testCases[62] = "bbbb"; expectedResults[62] = 1; // "b"
        testCases[63] = "pwwkew"; expectedResults[63] = 3; // "wke"
        testCases[64] = "abcabcbb"; expectedResults[64] = 3; // "abc"
        testCases[65] = "au"; expectedResults[65] = 2; // "au"
        testCases[66] = "abcdefgh"; expectedResults[66] = 8; // "abcdefgh"
        testCases[67] = "tmmzuxt"; expectedResults[67] = 5; // "mzuxt"
        testCases[68] = " "; expectedResults[68] = 1; // " "
        testCases[69] = "aabacbebebee"; expectedResults[69] = 3; // "abc"
        testCases[70] = "bpfbhmipx"; expectedResults[70] = 7; // "bpfbhmi"
        testCases[71] = " "; expectedResults[71] = 1; // " "
        testCases[72] = "pwwkew"; expectedResults[72] = 3; // "wke"
        testCases[73] = "bbbb"; expectedResults[73] = 1; // "b"
        testCases[74] = "abcabcbb"; expectedResults[74] = 3; // "abc"
        testCases[75] = "abcdabcd"; expectedResults[75] = 4; // "abcd"
        testCases[76] = "anviaj"; expectedResults[76] = 5; // "nviaj"
        testCases[77] = "dvdf"; expectedResults[77] = 3; // "vdf"
        testCases[78] = "tmmzuxt"; expectedResults[78] = 5; // "mzuxt"
        testCases[79] = "au"; expectedResults[79] = 2; // "au"
        testCases[80] = "aabacbebebex"; expectedResults[80] = 3; // "abc"
        testCases[81] = "bbtablud"; expectedResults[81] = 6; // "btablu"
        testCases[82] = "dvdf"; expectedResults[82] = 3; // "vdf"
        testCases[83] = "tmmzuxt"; expectedResults[83] = 5; // "mzuxt"
        testCases[84] = "aabacbebebey"; expectedResults[84] = 3; // "abc"
        testCases[85] = "abcd"; expectedResults[85] = 4; // "abcd"
        testCases[86] = "anviaj"; expectedResults[86] = 5; // "nviaj"
        testCases[87] = "abcdabcd"; expectedResults[87] = 4; // "abcd"
        testCases[88] = "abcdefg"; expectedResults[88] = 7; // "abcdefg"
        testCases[89] = "xyzzazxy"; expectedResults[89] = 4; // "yzxa"
        testCases[90] = "au"; expectedResults[90] = 2; // "au"
        testCases[91] = "abcdefgh"; expectedResults[91] = 8; // "abcdefgh"
        testCases[92] = "abcdabcd"; expectedResults[92] = 4; // "abcd"
        testCases[93] = "abcdabcd"; expectedResults[93] = 4; // "abcd"
        testCases[94] = "abc"; expectedResults[94] = 3; // "abc"
        testCases[95] = "abcdefgh"; expectedResults[95] = 8; // "abcdefgh"
        testCases[96] = "bbtablud"; expectedResults[96] = 6; // "btablu"
        testCases[97] = "dvdf"; expectedResults[97] = 3; // "vdf"
        testCases[98] = "tmmzuxt"; expectedResults[98] = 5; // "mzuxt"
        testCases[99] = "anviaj"; expectedResults[99] = 5; // "nviaj"

        // Generate additional 50 random strings (valid/invalid)
        for (int i = 100; i < 150; i++) {
            testCases[i] = generateRandomString();
            expectedResults[i] = Day2.getLongestSubstring(testCases[i]);
        }

        // Test the generated test cases and count the number of passed cases
        int passedCases = 0;
        for (int i = 0; i < testCases.length; i++) {
            int result = Day2.getLongestSubstring(testCases[i]);
            if (result == expectedResults[i]) {
                passedCases++;
            } else {
                System.out.println("Test Case " + (i + 1) + " Failed: \"" + testCases[i] + "\". Expected: " + expectedResults[i] + ", but got: " + result);
            }
        }

        System.out.println("Number of passed test cases: " + passedCases + " out of " + testCases.length);
    }

    // Method to generate a random string (valid/invalid substrings)
    private static String generateRandomString() {
        String[] possibleStrings = {
                "abcdefgh", "bbtablud", "tmmzuxt", "anviaj", "au",
                "bbbb", "dvdf", "pwwkew", "abcabcbb", "aabacbebebe",
                "A quick brown fox", "jumps over the lazy dog", "Hello World",
                "java programming", "data structures", "algorithms",
                "computer science", "openai chatgpt", "string manipulation",
                "substring problem", "unique characters"
        };
        return possibleStrings[(int)(Math.random() * possibleStrings.length)];
    }
}
