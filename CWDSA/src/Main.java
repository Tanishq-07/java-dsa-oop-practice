import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];  // Create an array of size 5
        Scanner in = new Scanner(System.in);

        // Use a regular for loop to modify the elements in the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();  // Assign user input to the array element
        }

        // Print the array after input
        System.out.println(Arrays.toString(arr));
    }
}
