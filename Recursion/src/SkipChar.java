public class SkipChar {
    public static void main(String[] args) {
        String s = "jvndsjvn" ;
        skip("",s);
    }
    public static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0) ;
        if(ch == 'j'){
            skip(p,up.substring(1));
        }
        else {
            skip(p+ch, up.substring(1));
        }
    }
}
