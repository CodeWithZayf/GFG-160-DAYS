/*Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps,
where d is a positive integer. Do the mentioned change in the array in place.
Note: Consider the array as circular. */
class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int i,length=arr.length;
        d=d%length;
        if (d==0)
        return;
        reverse(arr,0,d-1); // Reverse the first 'd' elements
        reverse(arr,d,length-1); // Reverse the remaining 'length-d' elements
        reverse(arr,0,length-1); // Reverse the entire array to get the final rotated array
    }
    static void reverse(int arr[], int x, int y) // Function to reverse a portion of the array
    {
        int i,j;
        for(i=x,j=y;i<j;i++,j--)
        {
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}