class Solution {
    int maxProduct(int[] arr) {
        int n=arr.length;
        if (n == 0) return 0;
        int maxnow = arr[0];
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            int temp = max;
            if (arr[i] < 0) {
                max = min;
                min = temp;
            }
            max = Math.max(arr[i], max * arr[i]);
            min = Math.min(arr[i], min * arr[i]);

            maxnow = Math.max(maxnow , max);
        }

        return maxnow;
    }
}