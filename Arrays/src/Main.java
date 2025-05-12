import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


// Arrays contains reference variables which are pointing to actual objects
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers that has to be stored ");
        int[] arr = new int[5] ;
        for (int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        for( int num : arr){            // Enhanced For Loop
            System.out.print(num + " ");
        }

        System.out.println("\n" + Arrays.toString(arr));    // toString Method to Print Array

    }
}