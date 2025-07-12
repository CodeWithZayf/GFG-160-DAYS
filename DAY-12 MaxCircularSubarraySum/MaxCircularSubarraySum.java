class Solution {
    public int circularSubarraySum(int arr[]) {
        int total = 0;

        int maxSum = arr[0];
        int curMax = arr[0];

        int minSum = arr[0];
        int curMin = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];
            curMax = Math.max(num, curMax + num);
            maxSum = Math.max(maxSum, curMax);

            curMin = Math.min(num, curMin + num);
            minSum = Math.min(minSum, curMin);

            total += num;
        }

        total += arr[0];

        if (maxSum < 0) {
            return maxSum;
        } else {
            return Math.max(maxSum, total - minSum);
        }
    }
}
        