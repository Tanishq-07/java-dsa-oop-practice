package polymorphism;

public class Circle extends Shapes{
    @Override
    void area(){
        System.out.println("Area is pie * r * r");
    }

    static void greeting(){
        System.out.println("Hey I am in Sub-Class");
    }
}
