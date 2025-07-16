class Solution {
    public static boolean areAnagrams(String s1, String s2) { // Function to check if two strings are anagrams of each other
        if (s1.length() != s2.length()) // If lengths are not equal, they cannot be anagrams
            return false;
        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) // Count the frequency of each character in both strings
        {
            count[s1.charAt(i) - 'a']++; // Increment count for character in s1
            count[s2.charAt(i) - 'a']--; // Decrement count for character in s2 
        }
        for (int val : count) { // Check if all counts are zero
            if (val != 0) return false; // If any count is not zero, they are not anagrams
        }
        return true; // If all counts are zero, the strings are anagrams
    }
}