package codes;// https://www.geeksforgeeks.org/inner-class-java/?ref=lbp


// Outer classes can't be Static.
public class InnerClasses {
    static class Test{
        String name ;
        public Test(String name) {
            this.name = name;
        }
    }

    static class second {
        static String naam ;

        public second(String naam) {
            this.naam = naam;
        }
    }

    public static void main(String[] args) {
//      Test a =  new Test("Dictator") ; // giving an error as the class is inside a class hence it is dependent on the outer class. Therefore, it must be static.
        Test a = new Test("Dictator");
        Test b = new Test("Modi") ;

        System.out.println(a.name);
        System.out.println(b.name);
        // If we made name static then it won't depend on object.

        second c = new second("Kya dekhta hai ");
        second d = new second("Idhar dekh na");
        System.out.println(second.naam);
    }
}
