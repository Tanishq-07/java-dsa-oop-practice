package cn.searching.binarySearch;

//Ceiling -> Smallest number in an array that is greater than or equal to the target number.
public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(search(arr, 0)); // Test case
    }

    public static int search(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        // Edge case: If target is greater than the largest element, return -1
        if (target > arr[e]) {
            return -1;
        }

        while (s <= e) {
            int m = s + (e - s) / 2; // Avoids potential overflow

            if (arr[m] == target) {
                return arr[m]; // Exact match found
            } else if (arr[m] < target) {
                s = m + 1; // Search in the right half
            } else {
                e = m - 1; // Search in the left half
            }
        }

        // At this point, s is the index of the smallest element >= target
        return arr[s];
    }
}