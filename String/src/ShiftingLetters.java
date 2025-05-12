public class ShiftingLetters {
    public static void main(String[] args) {
        String s = "ruu" ;
        int[] shifts = {26,9,17};
        System.out.println(shift("",s,shifts));
    }
    static int count =0;
    public static String shift(String p, String up, int[] shifts){
        if(up.isEmpty()){
            return p ;
        }
        char ch = up.charAt(0);
        int sft = 0 ;
        for (int i = count; i <shifts.length; i++) {
            sft += shifts[i] ;
        }
        ch = (char) (ch+((sft)-(((int)(sft/26))*26))) ;
        count++;
        return shift(p+ch,up.substring(1),shifts) ;
    }
}
