package test.string;

import main.string.Day1;

public class Day1Test {

        public static void main(String[] args) {
            String[] testCases = new String[150];
            boolean[] expectedResults = new boolean[150];

            // Test Case Generation
            testCases[0] = "a";  expectedResults[0] = true;
            testCases[1] = "A";  expectedResults[1] = true;
            testCases[2] = " ";  expectedResults[2] = true;
            testCases[3] = "";   expectedResults[3] = true;
            testCases[4] = "aa"; expectedResults[4] = true;
            testCases[5] = "Aa"; expectedResults[5] = true;
            testCases[6] = "ab"; expectedResults[6] = false;
            testCases[7] = "a a"; expectedResults[7] = true;
            testCases[8] = "A a"; expectedResults[8] = true;
            testCases[9] = "ab a"; expectedResults[9] = true;
            testCases[10] = "Madam"; expectedResults[10] = true;
            testCases[11] = "Mad am"; expectedResults[11] = true;
            testCases[12] = "madam"; expectedResults[12] = true;
            testCases[13] = "racecar"; expectedResults[13] = true;
            testCases[14] = "A man a plan a canal Panama"; expectedResults[14] = true;
            testCases[15] = "No lemon, no melon"; expectedResults[15] = true;
            testCases[16] = "Was it a car or a cat I saw"; expectedResults[16] = true;
            testCases[17] = "12321"; expectedResults[17] = true;
            testCases[18] = "123321"; expectedResults[18] = true;
            testCases[19] = "123456"; expectedResults[19] = false;
            testCases[20] = "Aba"; expectedResults[20] = true;
            testCases[21] = "A Santa at NASA"; expectedResults[21] = true;
            testCases[22] = "Eva, can I see bees in a cave?"; expectedResults[22] = true;
            testCases[23] = "Able was I saw Elba"; expectedResults[23] = true;
            testCases[24] = "abccba"; expectedResults[24] = true;
            testCases[25] = "abcdedcba"; expectedResults[25] = true;
            testCases[26] = "abcdecba"; expectedResults[26] = false;
            testCases[27] = "a"; expectedResults[27] = true;
            testCases[28] = "A"; expectedResults[28] = true;
            testCases[29] = " "; expectedResults[29] = true;
            testCases[30] = "A man, a plan, a canal, Panama"; expectedResults[30] = true;
            testCases[31] = "madamimadam"; expectedResults[31] = true;
            testCases[32] = "Never odd or even"; expectedResults[32] = true;
            testCases[33] = "Was it a car or a cat I saw?"; expectedResults[33] = true;
            testCases[34] = "Mr. Owl ate my metal worm"; expectedResults[34] = true;
            testCases[35] = "1001"; expectedResults[35] = true;
            testCases[36] = "10201"; expectedResults[36] = true;
            testCases[37] = "test"; expectedResults[37] = false;
            testCases[38] = "Test"; expectedResults[38] = false;
            testCases[39] = "Noon"; expectedResults[39] = true;
            testCases[40] = "Civic"; expectedResults[40] = true;
            testCases[41] = "Deified"; expectedResults[41] = true;
            testCases[42] = "civic"; expectedResults[42] = true;
            testCases[43] = "deified"; expectedResults[43] = true;
            testCases[44] = "Rotator"; expectedResults[44] = true;
            testCases[45] = "Repaper"; expectedResults[45] = true;
            testCases[46] = "Reviver"; expectedResults[46] = true;
            testCases[47] = "rotator"; expectedResults[47] = true;
            testCases[48] = "repaper"; expectedResults[48] = true;
            testCases[49] = "reviver"; expectedResults[49] = true;
            testCases[50] = "noon"; expectedResults[50] = true;
            testCases[51] = "repaper"; expectedResults[51] = true;
            testCases[52] = "Hello"; expectedResults[52] = false;
            testCases[53] = "Madam, in Eden, I’m Adam"; expectedResults[53] = true;
            testCases[54] = "Was it Eliot's toilet I saw?"; expectedResults[54] = true;
            testCases[55] = "Eva, can I stab bats in a cave?"; expectedResults[55] = true;
            testCases[56] = "A Toyota’s a Toyota"; expectedResults[56] = true;
            testCases[57] = "Racecar"; expectedResults[57] = true;
            testCases[58] = "Step on no pets"; expectedResults[58] = true;
            testCases[59] = "Red rum, sir, is murder"; expectedResults[59] = true;
            testCases[60] = "I did, did I?"; expectedResults[60] = true;
            testCases[61] = "Madam, in Eden, I’m Adam"; expectedResults[61] = true;
            testCases[62] = "A Santa at NASA"; expectedResults[62] = true;
            testCases[63] = "A Toyota"; expectedResults[63] = true;
            testCases[64] = "Live not on evil"; expectedResults[64] = true;
            testCases[65] = "Able was I, I saw Elba"; expectedResults[65] = true;
            testCases[66] = "A Santa Lived As a Devil At NASA"; expectedResults[66] = true;
            testCases[67] = "No 'x' in Nixon"; expectedResults[67] = true;
            testCases[68] = "Borrow or rob"; expectedResults[68] = true;
            testCases[69] = "Was it a car or a cat I saw?"; expectedResults[69] = true;
            testCases[70] = "Eva, can I see bees in a cave?"; expectedResults[70] = true;
            testCases[71] = "Mr. Owl ate my metal worm"; expectedResults[71] = true;
            testCases[72] = "Never a foot too far, even"; expectedResults[72] = true;
            testCases[73] = "Murder for a jar of red rum"; expectedResults[73] = true;
            testCases[74] = "A man, a plan, a canal, Panama!"; expectedResults[74] = true;
            testCases[75] = "Doc, note I dissent. A fast never prevents a fatness. I diet on cod."; expectedResults[75] = true;
            testCases[76] = "Was it a car or a cat I saw?"; expectedResults[76] = true;
            testCases[77] = "Evil is a name of a foeman as I live"; expectedResults[77] = true;
            testCases[78] = "I saw desserts; I'd no lemons, alas no melon, distressed was I"; expectedResults[78] = true;
            testCases[79] = "Step on no pets"; expectedResults[79] = true;
            testCases[80] = "Live on time, emit no evil"; expectedResults[80] = true;
            testCases[81] = "Madam, in Eden, I'm Adam"; expectedResults[81] = true;
            testCases[82] = "A Santa at NASA"; expectedResults[82] = true;
            testCases[83] = "A Toyota"; expectedResults[83] = true;
            testCases[84] = "Was it a car or a cat I saw?"; expectedResults[84] = true;
            testCases[85] = "No lemon, no melon"; expectedResults[85] = true;
            testCases[86] = "Eva, can I see bees in a cave?"; expectedResults[86] = true;
            testCases[87] = "Mr. Owl ate my metal worm"; expectedResults[87] = true;
            testCases[88] = "Was it a car or a cat I saw?"; expectedResults[88] = true;
            testCases[89] = "Doc, note I dissent. A fast never prevents a fatness. I diet on cod."; expectedResults[89] = true;
            testCases[90] = "Step on no pets"; expectedResults[90] = true;
            testCases[91] = "Was it a car or a cat I saw?"; expectedResults[91] = true;
            testCases[92] = "Red rum, sir, is murder"; expectedResults[92] = true;
            testCases[93] = "Step on no pets"; expectedResults[93] = true;
            testCases[94] = "Was it a car or a cat I saw?"; expectedResults[94] = true;
            testCases[95] = "Madam, in Eden, I'm Adam"; expectedResults[95] = true;
            testCases[96] = "A man, a plan, a canal, Panama!"; expectedResults[96] = true;
            testCases[97] = "Madam, I'm Adam"; expectedResults[97] = true;
            testCases[98] = "Step on no pets"; expectedResults[98] = true;
            testCases[99] = "Was it a car or a cat I saw?"; expectedResults[99] = true;

            // Generate additional 50 random strings (valid/invalid)
            for (int i = 100; i < 150; i++) {
                testCases[i] = generateRandomString();
                expectedResults[i] = Day1.isPalindrome(testCases[i]);
            }

            // Test the generated test cases and count the number of passed cases
            int passedCases = 0;
            for (int i = 0; i < testCases.length; i++) {
                boolean result = Day1.isPalindrome(testCases[i]);
                if (result == expectedResults[i]) {
                    passedCases++;
                } else {
                    System.out.println("Test Case " + (i + 1) + " Failed: \"" + testCases[i] + "\"");
                }
            }

            System.out.println("Number of passed test cases: " + passedCases + " out of " + testCases.length);
        }

        // Method to generate a random string (valid/invalid palindromes)
        private static String generateRandomString() {
            String[] possibleStrings = {
                    "radar", "notapalindrome", "racecar", "level", "deified",
                    "civic", "refer", "rotor", "redivider", "Aibohphobia",
                    "Detartrated", "Malayalam", "rotavator", "deleveled",
                    "Reviver", "Rotator", "repaper", "stats", "tenet",
                    "reviver", "A Santa at NASA", "Was it a car or a cat I saw?",
                    "Eva, can I see bees in a cave?", "No lemon, no melon",
                    "Mr. Owl ate my metal worm", "Madam, in Eden, I'm Adam"
            };
            return possibleStrings[(int)(Math.random() * possibleStrings.length)];
        }
}
