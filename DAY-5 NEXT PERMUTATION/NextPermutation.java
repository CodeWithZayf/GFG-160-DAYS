/*
Given an array of integers arr[] representing a permutation, implement the next permutation that rearranges the numbers 
into the lexicographically next greater permutation. If no such permutation exists, rearrange the numbers into the lowest 
possible order (i.e., sorted in ascending order). 
Note:  A permutation of an array of integers refers to a specific arrangement of its elements in a sequence or linear order.
 */
class Solution {
    void nextPermutation(int[] arr) {
        int n = arr.length;
        int pivot = -1;

        // Step 1: Find pivot
        for (int i = n - 1; i >= 1; i--) {
            if (arr[i] > arr[i - 1]) {
                pivot = i - 1;
                break;
            }
        }
        if (pivot == -1) {
            reverse(arr, 0, n - 1);
            return;
        }
        // Step 2: Find next greater element to swap with pivot
        for (int i = n - 1; i > pivot; i--) {
            if (arr[i] > arr[pivot]) {
                swap(arr, i, pivot);
                break;
            }
        }
        // Step 3: Reverse suffix
        reverse(arr, pivot + 1, n - 1);
    }
    // Helper to reverse a portion of the array
    void reverse(int[] arr, int left, int right) {
        while (left < right) {
            swap(arr, left++, right--);
        }
    }
    // Helper to swap two elements
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
