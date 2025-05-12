public class Leet33 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,1,2} ;
        int target = 2 ;
        System.out.println(rotatedArray(arr,target));
    }

    public static int rotatedArray(int[] arr, int target){
        int start = 0 ;
        int end = arr.length -1 ;
        while(start<end){
            int middle = start + (end - start)/2 ;
            if ( middle<end && arr[middle]>arr[middle+1]){
                return binsearch(arr, target, middle) ;
            } else if ( middle > start && arr[middle]<arr[middle-1]) {
                return binsearch(arr, target, middle-1) ;
            } else if(arr[middle]< arr[start]){
                end = middle-1  ;
            }
            else {
                start = middle+1 ;
            }
        }
        return binsearch(arr, target, end) ;
    }
    public static int binsearch(int[] arr, int target, int index){
        if(target<=arr[arr.length-1]){
            int start = index  ;
            int end = arr.length -1 ;
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
        }
        else {
            int start = 0 ;
            int end = index ;
            while(start<=end){
                int middle = start + (end-start)/2 ;
                if(arr[middle]<target){
                    start = start + 1 ;
                } else if (arr[middle]>target) {
                    end = end -1 ;
                }
                else
                    return middle ;
            }
        }
        return -1 ;
    }
}
