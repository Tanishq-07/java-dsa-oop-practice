package inheirtance2;

public class Base {
    int x ;

    public Base() {
        System.out.println("Base Class Constructor Called");
    }

    public Base(int x) {
        this.x = x;
    }
}

class Derived extends Base {

    int y ;

    public Derived(int x, int y) {
        super(x);
        //The super keyword in Java is used to refer to the super-class's members (methods, variables, constructors).
        this.y = y;
    }

    void Display(){
        System.out.println("x = " + x + ", y = " + y);
    }

    public Derived() {
        System.out.println("Derived Class Constructor Called");
    }
}

class GFG {
    public static void main(String[] args) {

        // Creating an object of sub class
        //Derived d = new Derived();

        // Note: Here first super class constructor will be
        // called there after derived(sub class) constructor
        // will be called

        Derived a = new Derived(10,20) ;
        a.Display();
    }
}

//Here first superclass constructor will be called thereafter derived(sub-class) constructor will be called
//because the constructor call is from top to bottom. And yes if there was any class that our Parent class is extending
//then the body of that class will be executed thereafter landing up to derived classes.