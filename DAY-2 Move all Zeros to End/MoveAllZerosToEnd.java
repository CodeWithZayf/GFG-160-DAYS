/*You are given an array arr[] of non-negative integers. 
You have to move all the zeros in the array to the right 
end while maintaining the relative order of the non-zero 
elements. The operation must be performed in place, 
meaning you should not use extra space for another array. */

class Solution {
    void pushZerosToEnd(int[] arr) {
        int i,length=arr.length,point=0;
        for(i=0;i<length;i++)
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