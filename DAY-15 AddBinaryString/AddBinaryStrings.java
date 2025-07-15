// User function Template for Java

class Solution {
    public String addBinary(String s1, String s2) { // Function to add two binary strings and return the result as a binary string
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder(); // Using StringBuilder for efficient string concatenation

        while (i >= 0 || j >= 0 || carry != 0) { // Loop until both strings are processed and no carry remains
            int bit1 = 0;
            if (i >= 0) {
                bit1 = s1.charAt(i) - '0';
            }

            int bit2 = 0;
            if (j >= 0) {
                bit2 = s2.charAt(j) - '0';
            }

            int sum = bit1 + bit2 + carry; // Calculate the sum of the bits and carry

            if (sum == 0) { // If the sum is 0, append '0' and reset carry
                result.append('0');
                carry = 0;
            } else if (sum == 1) { // If the sum is 1, append '1' and reset carry
                result.append('1');
                carry = 0;
            } else if (sum == 2) { // If the sum is 2, append '0' and set carry to 1
                result.append('0');
                carry = 1;
            } else if (sum == 3) { // If the sum is 3, append '1' and set carry to 1
                result.append('1');
                carry = 1;
            }

            i--;
            j--;
        }
        result.reverse();      // Reverse the result to get the correct order of bits
        int index = 0;
        while (index < result.length() && result.charAt(index) == '0') {
            index++;
        }

        String finalResult = result.substring(index);

        if (finalResult.length() == 0) {
            return "0";
        } else {
            return finalResult;
        }
    }
}