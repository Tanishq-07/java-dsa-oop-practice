public class NoOfSetBits {
    public static void main(String[] args) {
        int n = 6  ;
        int count = 0 ;
        for (int i = 0; i <=((Math.log(n))/Math.log(2)); i++) {
            if(((n>>i)&1)==1){
                count++ ;
            }
        }
        System.out.println(count);
    }
}
