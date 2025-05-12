public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {4,5,45,1,12};
        System.out.println(max(arr));
    }

    public static int max(int[] arr){
        int maxx = arr[0];
        for(int i=1; i<arr.length; i++){
            if(maxx<arr[i]){
                maxx = arr[i] ;
            }
        }

        return maxx;
    }
}
