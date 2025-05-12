import java.util.Arrays;

public class Leet49 {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        for (int i = 0; i < str.length; i++) {
            str[i] = mergesort(str[i]) ;
            i++ ;
        }
        System.out.println(Arrays.toString(str));
    }
    public static String mergesort(String s){
        if(s.length()==1){
            return s;
        }
        int mid = s.length()/2;
        String left = mergesort(s.substring(0,mid));
        String right = mergesort(s.substring(mid));

        return merge(left,right) ;
    }

    private static String merge(String first, String second) {
        StringBuilder mix = new StringBuilder() ;
        int i=0;
        int j=0;

        while (i<first.length() && j<second.length()){
            if(first.charAt(i)<second.charAt(j)){
                mix.append(first.charAt(i)) ;
                i++;
            }
            else {
                mix.append(mix.charAt(j)) ;
                j++ ;
            }
        }
        while (i<first.length()){
            mix.append(mix.charAt(i));
            i++;
        }
        while (j<second.length()){
            mix.append(mix.charAt(j)) ;
            j++;
        }
        return mix.toString() ;
    }
}
