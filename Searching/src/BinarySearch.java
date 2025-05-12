public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,5,7,16,19,25,29,54,98};
        int target = 10 ;
        int index = binarySearch(arr,target);
        System.out.println(index);
    }

    static int binarySearch(int[] arr, int target){
        int start, middle,end ;
        start = 0 ;
        end = arr.length-1 ;
        if (arr[0]<arr[arr.length-1]) {
        while (start <= end) {
            middle = start + (end - start) / 2;
            if (arr[middle] < target) {
                start = middle + 1;
            } else if (arr[middle] > target) {
                end = middle - 1;
            } else {
                //ans found
                return middle;
            }
        }
        }
        else{
            while (start <= end) {
                middle = start + (end - start) / 2;
                if (arr[middle] < target) {
                    end = middle - 1;
                } else if (arr[middle] > target) {
                    start = middle + 1;
                } else {
                    //ans found
                    return middle;
                }
            }
        }


        return arr[start];  // Ceiling -> Smallest Number in an Array which is greater or equal to target.
      //return arr[end] ->Floor -> greatest Number in an Array which is smaller or equal to target.
    }
}
//Order-Agnostic Binary Search : When a given Array is sorted, but you are not sure about it order
// Whether ascending or descending.