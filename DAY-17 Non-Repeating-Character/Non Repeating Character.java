class Solution {
    static char nonRepeatingChar(String s) {
        int n=s.length(); // Get the length of the string
        char c;
        int[] freq = new int[26]; // Frequency array for characters 'a' to 'z'
        for (int i=0;i<n;i++) // Iterate through the string to count character frequencies
        {
            c=s.charAt(i); // Get the character at index i
            freq[c - 'a']++; // Increment the frequency of the character
        }
        for (int i=0;i<n;i++) { // Iterate again to find the first non-repeating character
            c=s.charAt(i);
            if (freq[c - 'a'] == 1) { // If the frequency of the character is 1, it is non-repeating
                return c;
            }
        }
        return '$'; // If no non-repeating character is found, return '$'
    }
}
