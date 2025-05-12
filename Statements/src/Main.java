import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String fruit ;
        System.out.println("Enter the name of fruit");
        Scanner in = new Scanner(System.in) ;
        fruit = in.nextLine() ;

        switch (fruit) {
            case "Mango" :
                System.out.println("The king of fruit");
                break ;
            case "Orange" :
                System.out.println("Tangy Flavour");
                break;
            default:
                System.out.println("Enter the valid Input");

        }

    }
}