import java.util.ArrayList;

public class CombPhoneNo {
    public static void main(String[] args) {
        String digits = "9";
        System.out.println(comb("",digits));
    }

    public static ArrayList<String> comb(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - 49 ; // digit = actual digit - 1 ;
        ArrayList<String> ans = new ArrayList<>();
        if(digit>=1 && digit<=5){
            for (int i = (digit-1)*3; i < digit*3; i++) {
                char ch = (char) ('a' + i) ;
                ans.addAll(comb(p+ch, up.substring(1)));
            }
        } else if (digit==6) {
            for (int i = 15; i <19; i++) {
                char ch = (char) ('a' + i) ;
                ans.addAll(comb(p+ch, up.substring(1)));
            }
        } else if (digit==7) {
            for (int i = 19; i <22; i++) {
                char ch = (char) ('a' + i) ;
                ans.addAll(comb(p+ch, up.substring(1)));
            }
        } else if (digit==8) {
            for (int i = 22; i <26; i++) {
                char ch = (char) ('a' + i) ;
                ans.addAll(comb(p+ch, up.substring(1)));
            }
        }

        return ans ;
    }
}
