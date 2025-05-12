public class Palindrome {
    public static int sum = 0;
    public static int Reverse(int n) {
        if(n==0){
            return 0;
        }
        int rem = n%10 ;
        sum = sum*10 + rem ;
        return Reverse(n/10);
    }
    public static void main(String[] args) {
        int n = 1234321;
        System.out.println(Check(n));
        Reverse(n) ;
        if(sum==n){
            System.out.println("True");
        }
        else System.out.println("False");
    }
    public static Boolean Check(int n){
        String  s = Integer.toString(n) ;
        int start = 0 ;
        int end = s.length()-1;
        while(start<=end){
            if (s.charAt(start)==s.charAt(end)){
                start++;
                end-- ;
            }
            else return false ;
        }
        return true ;
    }
}
// Follow up (Number as a String)
//public static Boolean Check(int n){
//    String  s = Integer.toString(n) ;
//    int start = 0 ;
//    int end = s.length();
//    while(start<=end){
//        if (s.charAt(start)==s.charAt(end)){
//            start++;
//            end-- ;
//        }
//        else return false ;
//    }
//    return true ;
//}
