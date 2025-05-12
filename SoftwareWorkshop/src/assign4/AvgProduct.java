package assign4;

import java.util.Scanner;

public class AvgProduct {
    public static void main(String[] args) {
        double a, b, c, d ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter four values");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        d = in.nextDouble();

        double average = (a+b+c+d)/4 ;
        double product = a*b*c*d ;

        System.out.println("Average and Product of entered four values is "+average +" and "+ product+ " respectively.");
    }
}
