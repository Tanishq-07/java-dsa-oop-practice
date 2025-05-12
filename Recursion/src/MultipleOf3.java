import java.util.ArrayList;

public class MultipleOf3 {
    public static void main(String[] args) {
        int n = 45 ;
        System.out.println(check(n));
    }
    public static boolean check(int n){
        int rem = 0 ;
        int sum =0;
        ArrayList<Integer> list = new ArrayList<>() ;
        if(n<=0){
            return false ;
        }
        if(n==1){
            return true ;
        }
        while(n>0){
            rem = n%10;
            list.add(rem);
            n /=10 ;
        }
        for (int i = 0; i <=list.lastIndexOf(rem); i++) {
            sum += list.get(i);
        }
        return sum == 9;
    }
}
