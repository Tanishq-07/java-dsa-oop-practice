public class Leet50 {
    static double ans = 1;
    public static void main(String[] args) {
        int count =0;
        double x = 0.00001;
        int n = 2147483647 ;
        System.out.println(pow(count,x,n));
        Math.pow(x,n);
    }
    public static double pow(int count, double x, int n){
        if(count==n){
            return ans ;
        }
        if(n>0){
            count++ ;
            ans *=x ;
        }
        else if(n<0){
            count -- ;
            ans /= x ;
        }
        pow(count,x,n);
        return ans ;
    }
}
