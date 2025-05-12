import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {

        int num = 4;
//        roll("",num);
        System.out.println(rolldice("",num));

    }
    public static void roll(String ans, int num){
        if(num==0){
            System.out.println(ans);
            return;
        }

        for (int i = 1; i <=6 && i<=num ; i++) {
            roll(ans + i,num-i);
        }
    }
    public static ArrayList<String> rolldice(String p, int num){
        if(num==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p) ;
            return list ;
        }
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 1; i <=6 && i<=num ; i++) {
            ans.addAll(rolldice(p + i,num-i));
        }
        return ans ;
    }
}
