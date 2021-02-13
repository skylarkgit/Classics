// https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1#
public class MergeSortedArray {

    public static void merge(int arr1[], int arr2[], int n, int m) 
    {
        int lastIndex = m - 1;
        
        // Do it until lastIndex >= 0
        while (lastIndex >= 0) {
            // take the largest (x) from arr2 (lastIndex)
            int x = arr2[lastIndex];
            int largest = arr1[n-1];
        
            // put that in arr1 using insertion sort
            int place = 0;
            while (place < n && arr1[place] < x) {
                place++;
            }
            int i = n - 1;
            while (i > place) {
                arr1[i] = arr1[i - 1];
                i--;
            }
            
            // arr1 will have to get away from one of the elements(largest)
            // put that element in the lastIndex in arr2
            if (place < n) {
                arr2[lastIndex] = largest;
                arr1[place] = x;
            }
            
            lastIndex --;
        }
    }

    public static void main(String[] args) {

    }
}