public class Leet1502 {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        System.out.println(canMakeArithmeticProgression(arr));

    }
    public static boolean canMakeArithmeticProgression(int[] arr) {

        int i=0;
        while(i<arr.length-2){
            if((arr[i+1]-arr[i])==(arr[i+2]-arr[i+1])){
                i++ ;
            }
            else {
                return false ;
            }
        }
        return true ;
    }
}
