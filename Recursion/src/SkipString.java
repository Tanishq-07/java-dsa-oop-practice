public class SkipString {
    public static void main(String[] args) {
        String s = "nvdnapplnjb";
        System.out.println(skipString(s));

    }
    public static String skipString(String up){
        if(up.isEmpty()){
            return "" ;
        }
        if(up.startsWith("app") && !up.startsWith("apple") ){
            return skipString(up.substring(3));
        }
        else {
            return up.charAt(0) + skipString(up.substring(1));
        }
    }
}
