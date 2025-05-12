public class Leet1095 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,10,7,4,2,1} ;
        int target = 4 ;
        System.out.println(findInMountainArray(arr, target));
    }
    public static int findInMountainArray(int[] arr, int target){
        int start = 0 ;
        int end = arr.length -1 ;
        while(start<end){
            int middle = start + (end - start)/2 ;
            if(arr[middle]< arr[middle+1]){
                start = middle+1 ;
            }
            else {
                end = middle  ;
            }

        }
        return search(arr, target, end) ;
    }

    public static int search(int[] arr, int target, int end){
        int start = 0 ;
        while(start<=end){
            int middle = start + (end-start)/2 ;
            if(arr[middle]<target){
                start = middle +1 ;
            } else if (arr[middle]>target) {
                end = end - 1 ;
            }
            else
                return middle ;
        }
        return -1 ;
    }
}
