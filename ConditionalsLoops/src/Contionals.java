import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Contionals {
    public static void main(String[] args) {
        int salary ;
        System.out.println("Enter your Salary ");
        Scanner in = new Scanner(System.in) ;
        salary = in.nextInt() ;

        if(salary > 10000) {
            salary += 2000 ;
        }
        else if (salary > 20000) {
            salary += 4000 ;
        }
        else {
            salary += 1000 ;
        }
        System.out.println("Your Salary " + salary);
    }
}
