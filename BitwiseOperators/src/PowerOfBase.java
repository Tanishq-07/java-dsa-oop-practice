public class PowerOfBase {
    public static void main(String[] args) {
        int base = 6;
        int power = 3 ;
        int ans = 1;
        for (int i = 0; i <((Math.log(power))/Math.log(2)); i++) {
            if(((power>>i)&1)==1){
                ans = ans*base ;
                base *= base ;
            }
            else base *= base ;
        }
        System.out.println(ans);
    }
}
