public class Operetors {
    public static void main(String[] args) {
        System.out.println('a'+'b'); // Addition of Char's ASCII value
        System.out.println("a"+"b"); // ab
        System.out.println((char)('a'+3)); // 'a'+3 = 100 -> (char) = 'd'
        System.out.println("Dictator"+1);
        // integer is converted to Integer and that will call toString()
        //that means after few steps this is what happening : "Dictator"+"1" --> Dictator1
        
    }
}
