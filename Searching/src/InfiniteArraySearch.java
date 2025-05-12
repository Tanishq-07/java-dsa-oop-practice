public class InfiniteArraySearch {
    public static void main(String[] args) {
        int[] arr = {4,7,10,15,20,24,29,35,37,39,40,41,43,47,48,55,59,61,67,70,101,112,151,186} ;
        int target = 112 ;
        int get = findingRange(arr, target) ;
        if (get == target){
            System.out.println("Element founded");
        }
        else
            System.out.println("Not Found");
    }
    public static int findingRange(int[] arr, int target) {
        int start = 0 ;
        int end = 1 ;
        while(target > arr[end]){
            int temp = end +1 ;
            end = end + (end - start + 1)*2 ;
            start = temp ;
        }
        return Search(arr, target, start, end) ;
    }
    public static int Search(int[] arr, int target, int start, int end){
        while(start<= end){
            int middle =  start + (end - start)/2 ;
            if(arr[middle] < target){
                start = middle + 1 ;
            } else if (arr[middle] > target) {
                end = middle - 1 ;
            }
            else return arr[middle] ;
        }
        return -1 ;
    }
}
