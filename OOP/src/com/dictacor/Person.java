package com.dictacor;

import static com.dictacor.Greeting.message;

public class Person {
    String name;
    int age;
    long salary ;
    boolean married ;
    static long population ;

    public static void main(String[] args) {
        Person pr = new Person();
        pr.print();
    }

    public Person(String name, int age, long salary, boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
        Person.population +=1 ;
    }

    public Person() {
    }

    public void print(){
        message();
    }
}
