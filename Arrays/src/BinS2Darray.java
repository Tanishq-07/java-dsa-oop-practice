public class BinS2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target = 13 ;
        int get = binsearch(arr,target) ;
        System.out.println(get);
    }
    public static int binsearch(int[][] arr, int target){
        int start = arr[0][0] ;
        int i = 0 ;
        int j = arr.length -1 ;

        while(i< arr.length && j > 0){
            if(arr[i][j]>target){
                j = j-1 ;
            } else if (arr[i][j]<target) {
                i = i+1 ;
            }
            else return arr[i][j] ;
        }
    return -1 ;
    }
}
