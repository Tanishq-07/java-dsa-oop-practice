package inheirtance;

public class Main {
    public static void main(String[] args) {
        Box one = new Box();
//        System.out.println(one.h);

        BoxWeight two = new BoxWeight(5,8,4,0);

//        System.out.println(two.h);
//        System.out.println(two.l);

        Box three = new BoxWeight(2,3,4,5);
//        System.out.println(three.weight); It will give an error
//        as we can't access the weight because the type of reference variable determines what we can access and what we can't.
//        And we can access those data which are public in parent class from child class.


        //BoxWeight four = new Box(4,5,7);
        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error

        BoxPrice e = new BoxPrice();
        System.out.println(e.price+" Bucks      (chool lagne ke liye)");
    }
}
