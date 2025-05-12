package assign1;

import java.util.Scanner;

public class IncchestoCm {
    public static void main(String[] args) {
        int n ;
        System.out.println("Enter the value in inches");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        Convert one = new Convert(n);
    }
}

