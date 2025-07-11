class Solution {
    void pushZerosToEnd(int[] arr) {
        int i,n=arr.length,point=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]!=0) // If the current element is not zero
            {
                int temp=arr[i]; // Store the current element
                arr[i]=arr[point]; // Move the non-zero element to the 'point' position
                arr[point]=temp; // Move the zero element to the current position       
                point++; // Increment the 'point' to the next position
            }
        }
    }
}