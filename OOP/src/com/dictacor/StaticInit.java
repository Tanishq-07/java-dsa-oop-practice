package com.dictacor;

public class StaticInit {
    static int a = 5;
    static int b ;

    static {
        System.out.println("I'm in a static folder");
        b = a*4;
    }

    public static void main(String[] args) {
        System.out.println(a+" "+b);
        b += 5 ;
        System.out.println(a+" "+b);
    }
}
