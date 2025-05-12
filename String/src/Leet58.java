public class Leet58 {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  " ;
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        int count = 0 ;
        String ans = s.strip() ;
        for(int i= ans.length()-1;i>=0;i--){
            if(ans.charAt(i)==' '){
                break ;
            }
            else count++ ;
        }
        return count ;
    }
}
