import java.util.Arrays;
class Solution {
    int getMinDiff(int[] arr, int k) {
        Arrays.sort(arr);
        int n=arr.length;
        int ans = arr[n-1] - arr[0];
        int smallest = arr[0] + k;
        int largest = arr[n-1] - k;
        
        for (int i = 1; i < n; i++) {
            if (arr[i] - k < 0) continue;
            
            int minElem = Math.min(smallest, arr[i] - k);
            int maxElem = Math.max(largest, arr[i-1] + k);
            
            ans = Math.min(ans, maxElem - minElem);
        }
        
        return ans;
    }
}