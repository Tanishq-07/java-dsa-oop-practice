package com.dictacor;

import java.util.Scanner;

import static com.dictacor.Greeting.message;

public class Pkg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        System.out.println("Hello, what is your name ?");
        name = in.nextLine();
        message();
        System.out.print(name);
    }
}
