import java.util.Scanner;

public class FindBit {
    public static void main(String[] args) {
        int n,i ;
        int ans = 0 ;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        i = in.nextInt();
        if((n&(1<<i-1))!=0){
            ans = 1 ;
        }
        System.out.println(ans);
        System.out.println(set(n,i));
        System.out.println(reset(n,i));

    }

    private static int set(int n, int i) {
        return (n|(1<<i-1));
    }
    private static int reset(int n, int i) {
        return (n&(~(1<<i-1)));
    }

}
