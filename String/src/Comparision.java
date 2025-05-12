public class Comparision {
    public static void main(String[] args) {
        String a = " Modi ji";
        String b = " Modi ji";
        System.out.println(a==b);
        // True -> It means both strings are pointing to same objects ;
        // a --> Modi ji <-- b
        // ' == ' Checks if reference variable are pointing to the same object.

        String c = new String("Dictator") ;
        String d = new String("Dictator") ;

        // Here we create two different object outside the pool but in the heap
        // value is same but objects are different and hence == will give false here.
        System.out.println(c==d);

        // When we need to compare the values we use Method equal()

        System.out.println(c.equals(d));
    }
}
