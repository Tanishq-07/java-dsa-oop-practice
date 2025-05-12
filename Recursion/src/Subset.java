import java.util.ArrayList;
import java.util.Arrays;

public class Subset {
    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> list = new ArrayList() ;
        set("",s,list);
        System.out.println(list);

    }
    public static void set(String p, String up, ArrayList list){
        if(up.isEmpty()){
            list.add(p) ;
            return ;
        }
        char ch = up.charAt(0);
          set(p+ch, up.substring(1),list);
          set(p, up.substring(1),list);
    }
}
