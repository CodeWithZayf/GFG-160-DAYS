class Solution {
    public void reverseArray(int arr[]) {
        int i;
        for(i=0;i<arr.length/2;i++) // Loop through the first half of the array
        { 
            int temp=arr[i];// Swap elements
            arr[i]=arr[arr.length-1-i]; // Swap the first and last elements, then the second and second last, etc.
            arr[arr.length-1-i]=temp;
        }
    }
}