// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int i,n=arr.length;
         d=d%arr.length;
        if (d==0)
        return;
        
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    static void reverse(int arr[], int x, int y)
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