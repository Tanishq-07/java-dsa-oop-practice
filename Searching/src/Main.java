import java.util.Scanner;
// Linear Search Code ;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {5,7,45,63,1};
        int n ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the target");
        n = in.nextInt();
        int get =linearSearch(arr,n);

        if(get == n){
            System.out.println("Yes!");
        }
        else{
            System.out.println("No");
        }
    }
    static int linearSearch(int[] array, int a){
        for (int i = 0; i< array.length; i++){
            if(array[i] == a ){
                return a ;
            }
        }
        return -1 ;
    }
}