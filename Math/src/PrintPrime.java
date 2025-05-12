public class PrintPrime {
    public static void main(String[] args) {
        int n = 40;
        for (int i = 2; i < n; i++) {
            if(prime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean prime(int n){
        int i = 2;
        while (i*i<n){
            if(n%i==0){
                return false ;
            }
            else {
                i++ ;
            }
        }
        return true ;
    }
}
