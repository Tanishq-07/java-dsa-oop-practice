public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 4 ;
        if((n&(n-1))==0){
            System.out.println("YES!");
        }
        else System.out.println("No");
    }
}
