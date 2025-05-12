import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        int[][] arr = {
                {4,51,84},
                {36,42,1},
                {96,87,53}
        } ;
        //System.out.println(Arrays.toString(arr));
        // Output : [[I@8efb846, [I@2a84aee7, [I@a09ee92]
        System.out.println(arr[2][1]);
        System.out.println(arr.length); // Will give number of rows. Here 3
        //Adding the number of rows is mandatory

        Scanner in = new Scanner(System.in);

        int[][] arr2D = new int[3][3];
        for(int i=0; i< arr2D.length; i++){
            for(int j=0; j<arr2D[i].length; j++){
                arr2D[i][j] = in.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(arr2D));
    }
}
