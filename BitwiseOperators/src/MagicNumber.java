public class MagicNumber {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(nm(n));
    }
    public static int nm(int n){
        double ans =0 ;
        int b = (int)((Math.log(n)/(Math.log(2)))+1);
        for (int i = 0; i<b; i++) {
           ans +=  Math.pow(5,i+1)*(((n>>i)&1)) ;
        }
        return (int) ans ;
    }
}
