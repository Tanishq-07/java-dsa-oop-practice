import org.w3c.dom.ls.LSOutput;

public class Overloading {
    // Two functions with same name may exist if they have different parameters.
    public static void main(String[] args) {
        int a = fun(21);
        String Name = fun("Krish");
        System.out.println("Name = "+Name+"\nRoll No. = "+a);

    }

    static int fun(int a){
    return a ;
    }

    static String fun(String name){
        return name ;
    }
}
