import java.util.Scanner;

public class Sqrtx {
    public static void main(String[] args) {
        int x ;
        System.out.println("Enter the number \n");
        Scanner in = new Scanner(System.in) ;
        x = in.nextInt() ;
        int ans  = mySqrt(x) ;
        System.out.println(ans);
    }
    public static int mySqrt(int x) {
        long start = 0;
        long end = x;

        while (start + 1 < end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == x) {
                return (int)mid;
            } else if (mid * mid < x) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (end * end == x) {
            return (int)end;
        }
        return (int)start;
    }

}
