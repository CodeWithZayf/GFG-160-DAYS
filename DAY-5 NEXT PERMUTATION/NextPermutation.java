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
