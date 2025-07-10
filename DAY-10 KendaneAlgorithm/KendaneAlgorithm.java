class Solution {
    int maxSubarraySum(int[] arr) {
        int max=arr[0],totalmax=arr[0],i;
        for(i=1;i<arr.length;i++)
        {
            max=Math.max(max+arr[i],arr[i]);
            totalmax=Math.max(max,totalmax);
        }
        return totalmax;
        
    }
}