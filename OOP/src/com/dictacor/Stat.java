package com.dictacor;

public class Stat {
    public static void main(String[] args) {
        Person boss = new Person("Boss",23,1000000,false) ;
        Person dictator = new Person("Dictator",71,100000000,false);
        System.out.println(Person.population);
        System.out.println(dictator.salary);

//        print(); Non static, Hence can't be called without creating an object ;

        Stat obj = new Stat();
        obj.print(); // Now it will run as we created an obj of class Stat.
    }
    void print(){
        System.out.println("Main Narendra DamodarDas Modi");
        test();
    }
    static void test(){
        System.out.println("Static Method is called.");
    }
}
// NOTE:- We can call a Static method from a Non-Static.