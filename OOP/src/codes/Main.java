package codes;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name = new String();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name!");
        name = in.nextLine();
        //Class is a named group of property and functions
        Student[]  students = new Student[5];
        Student sahil = new Student();
//        System.out.println(sahil.marks);
        Student shubham = new Student(68,"Shubham",93.54) ;
        if(name.equals("Shubham")){
            System.out.println(shubham.name+" ji aapke marks hai "+shubham.marks);
        }
        else System.out.println("codes.Data Not Found!");

    }
}

class Student{
    int rno ;
    String name ;
    double marks ;
    Student(){
        rno = 58 ;
        name = "Sahil Jain";
        marks = 92.7 ;
    }
    Student(int roll, String naam, double number){
        this.rno = roll ;
        this.name = naam ;
        this.marks = number;
    }
}