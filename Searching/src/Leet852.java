public class Leet852 {
    public static void main(String[] args) {
        int[] arr = {3,5,3,2,0} ;
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr){
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
        return start ;
    }
}
