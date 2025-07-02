class Solution {
    public void reverseArray(int arr[]) {
        int i;
        for(i=0;i<arr.length/2;i++){ // Reverse the array in place
            int temp=arr[i];// Swap elements
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
}