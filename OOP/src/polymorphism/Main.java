package polymorphism;

// Polymorphism :- Many ways to do same work.
//In simple words, we can define Java Polymorphism as the ability of a message to be displayed in more than one form.

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Shapes square = new Square(); // ref. variable(of type parent) and obj(of type child).

        circle.area();  // What variable it can access depends on the type of reference variable.
                        // But which method will be called depends on the object type.(Upcasting)

        square.area();

        Shapes obj = new Circle();

        obj.greeting(); // Here Parent class method will be called as static method can't be overridden.
                        // Although static method can be inherited. Method of parent class will be called.
                        // Here what happens is method hiding.(Child method call is expected.)

    }
}

/*
    Types of Polymorphism

    1. Compile Time / Static polymorphism :
            Achieved by a method overloading.(When a class have multiple method of same name but types, argument,
            return type and ordering can be different.)
            e.g. :- Multiple Constructors.

    2. Runtime / Dynamic Polymorphism : It is a method in which function call to overridden method is resolved
       at runtime.

       @Override : When a method in a subclass has the same name, the same parameters or signature, and
       the same return type(or sub-type) as a method in its super-class, then the method in the subclass
       is said to override the method in the super-class.

       Note :- To prevent overriding we use "final" keyword as it won't allow us to override final class.
       Somehow they provide performance enhancement.

       Refer, https://www.geeksforgeeks.org/dynamic-method-dispatch-runtime-polymorphism-java/

       private, final and static methods and variables uses static binding and bonded by compiler
       while overridden methods are bonded during runtime based upon type of runtime object.

       Static methods in Java can be inherited, which means that classes derived from a parent class can access
       and use the static methods of the parent class. However, unlike non-static methods, static methods cannot be
       overridden. Instead, if a subclass declares a static method with the same signature as a static method
       in its superclass, it hides the superclass method.
 */