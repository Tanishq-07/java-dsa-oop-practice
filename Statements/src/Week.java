import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        int n ;
        System.out.println("Enter the Number b/w 1 to 7 ");
        Scanner in = new Scanner(System.in) ;
        n = in.nextInt() ;
        switch (n){
            case 1,2,3,4,5 -> System.out.println("weekdays");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Enter the valid Input");
        }
    }
}
