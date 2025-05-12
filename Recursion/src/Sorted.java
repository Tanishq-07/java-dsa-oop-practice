public class Sorted {
    public static void main(String[] args) {
        int[] arr= {2,7,11,12,15,25,25};
        System.out.println(check(0,arr));
    }
    public static Boolean check(int start,int[] arr){
        if(start>=arr.length-1){
            return true ;
        }
        else if(arr[start]>arr[start+1]){
            return false;
        }
        return check(start+1,arr) ;
    }
}
