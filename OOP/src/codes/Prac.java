package codes;

import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {
        int rollno = 0 ;
        String name ;
        double marks ;
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter your roll number ");
//        rollno = in.nextInt();
        System.out.println("Enter your Name ");
        name = in.nextLine();
        System.out.println("Enter your Marks ");
        marks = in.nextDouble();

        Data student1 = new Data(rollno,name,marks);
        System.out.println(student1.marks);
    }
}
class Data{
    int rno ;
    String name ;
    double marks ;
    Data(int rno,String name, double marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks ;
    }
    
}
