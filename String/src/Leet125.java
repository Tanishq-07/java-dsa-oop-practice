import java.util.Arrays;

public class Leet125 {
    public static void main(String[] args) {
        String s = "0P" ;
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i=0;
        StringBuilder sb = new StringBuilder();
        while(i<s.length()){
            if(s.charAt(i)>=97 && s.charAt(i)<=122){
                sb.append(s.charAt(i));
            }
            i++ ;
        }
        s = sb.toString();
        System.out.println(s);
        int a = 0 ;
        int b = s.length()-1;
        while(a<=b){
            if(s.charAt(a) != s.charAt(b)){
                return false ;
            }
            a++;
            b-- ;
        }
        return true ;
    }
}