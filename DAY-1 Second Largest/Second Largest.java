class Solution {
    public int getSecondLargest(int[] arr) {
        if(arr.length==0 || arr.length==1)
        return -1; //Return -1 if array is empty or has only one element
        int i,max=arr[0],smax=-1;
        for(i=1;i<arr.length;i++)
            {
            if(arr[i]>max) // If current element is greater than max
                {
                smax=max; // Update second max to old max
                max=arr[i]; // Update max to current element
                }
            else if(arr[i]>smax && arr[i]<max)
                {
                smax=arr[i]; // Update second max to current element    
                }
        }
        return smax; // Return second largest element
    }
}