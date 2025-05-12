public class SquareRoot {
    public static void main(String[] args) {
        int n = 37 ;
        System.out.println(sqroot(n));
    }
    public static int sqroot(int n){
        int start = 0;
        int end = n ;
        while (start<=end){
            int middle = start+(end-start)/2;
            if(middle*middle==n){
                return middle;
            } else if (middle*middle<n) {
                start= middle+1;
            }
            else if(middle*middle>n){
                end=middle-1;
            }
        }
        return -1 ;
    }
}
