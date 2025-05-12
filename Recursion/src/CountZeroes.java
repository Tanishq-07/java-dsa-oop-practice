public class CountZeroes {
    static int count = 0 ;
    public static void main(String[] args) {
        int n = 30000201;
        count(n);
        System.out.println(count);
    }
    public static void count(int n){
        if(n==0){
            return ;
        }
        if(n%10==0){
            count++;
        }
        count(n/10);
    }

}
