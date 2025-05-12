public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= {2,7,11,12,15,23,25};
        int target = 23;
        System.out.println(search(arr,target,0));
    }
    public static int search(int[] arr, int target, int start){
        if(start==arr.length){
            return -1;
        }
        if(arr[start]==target){
            return start;
        }
        return search(arr,target,start+1);
    }
}
