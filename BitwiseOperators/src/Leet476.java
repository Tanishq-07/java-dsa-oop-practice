public class Leet476 {
    public static void main(String[] args) {
        int num = 1 ;
        System.out.println(findComplement(num));
    }
    public static int findComplement(int num) {
        for(int i=0;i<=((Math.log(num))/Math.log(2));i++){
            num = ((1<<i)^num) ;
        }
        return num ;
    }
}
