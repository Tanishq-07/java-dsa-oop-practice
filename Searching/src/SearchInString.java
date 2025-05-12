public class SearchInString {
    public static void main(String[] args) {
        String name = "boss";
        char var = 'o';
        boolean get = search(name,var);
        if(get){
            System.out.println("Yes!");
        }
        else{
            System.out.println("No");
        }
    }
    static boolean search(String str, char target){
        if(str.length()== 0){
            return false ;
        }
        for(int i=0;i<str.length(); i++ ){
            if(str.charAt(i) == target){
                return true ;
            }
        }
        return false ;
    }
}
