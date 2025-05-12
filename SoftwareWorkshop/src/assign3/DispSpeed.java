package assign3;

import java.util.Scanner;

public class DispSpeed {
    public static void main(String[] args) {
        float distance, time ;
        System.out.println("Enter the distance in meters and time in seconds");
        Scanner in = new Scanner(System.in);
        distance = in.nextInt();
        time = in.nextInt();

        float speed = distance/time ;


        System.out.println("Speed is "+ speed +"m/s");
    }
}
