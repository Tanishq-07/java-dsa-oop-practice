public class Leet1528 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};

        System.out.println(restoreString(s, indices));
    }

    public static String restoreString(String s, int[] indices) {
        char[] arr = new char[s.length()] ;
        StringBuilder sb = new StringBuilder() ;
        for (int i = 0; i < s.length(); i++) {
            arr[indices[i]] = s.charAt(i) ;
        }
        for(int j =0; j<arr.length; j++){
            sb.append(arr[j]) ;
        }
        return sb.toString() ;
    }
}



//    public static String swap(String str, int j, int i)
//    {
//        StringBuilder sb = new StringBuilder(str);
//        sb.setCharAt(i, str.charAt(j));
//        sb.setCharAt(j, str.charAt(i));
//        return sb.toString();
//    }

