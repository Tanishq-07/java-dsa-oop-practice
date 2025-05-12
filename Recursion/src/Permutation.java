public class Permutation {
    public static void main(String[] args) {
            String str = "eve";
            permutation("",str);
    }

    private static void permutation(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            permutation(first+ch+second,up.substring(1));
        }
    }
}
