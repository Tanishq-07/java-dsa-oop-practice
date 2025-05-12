
public class Leet67 {
    public static void main(String[] args) {
        String a = "1101"; //13
        String b = "1011"; //11
        System.out.println(addBinary(a,b));

    }
    public static double addBinary(String a, String b) {
        double first = 0;
        double  second = 0 ;
        for (int i = 0; i < a.length(); i++) {
            first += Math.pow(2,i)*(a.charAt(a.length()-1-i)-48) ;
        }
        for (int i = 0; i < b.length(); i++) {
            second += Math.pow(2,i)*(b.charAt(b.length()-1-i)-48) ;
        }
        double ans = first+second ;
        return ans ;
    }
}
