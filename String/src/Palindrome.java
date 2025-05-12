public class Palindrome {
    public static void main(String[] args) {
        String name = "abccba" ;
        int start = 0 ;
        int end = name.length()-1 ;
        boolean ans = true ;
        while(start<=end){
            if( name.charAt(start)== name.charAt(end) ){
                start +=1 ;
                end -= 1 ;
            }
            else{
                ans = false ;
                break;
            }
        }
        if(ans){
            System.out.println("Yes given String is a Palindrome");
        }
        else System.out.println("Given String is not a Palindrome");
    }
}
