public class MultiplyString {
    public static void main(String[] args) {
        System.out.println(multiply("123","456"));
    }
    public static String multiply(String num1, String num2){
        int n1 = 0;
        for (int i = num1.length()-1; i>=0 ; i--) {
            n1 += (num1.charAt(i)-'0')*Math.pow(10,num1.length()-1-i) ;
        }
        int n2 = 0;
        for (int j = num2.length()-1; j>=0 ; j--) {
            n2 += (num2.charAt(j)-'0')*Math.pow(10,num2.length()-1-j) ;
        }
        System.out.println(n1);
        System.out.println(n2);
        StringBuilder sb = new StringBuilder() ;
        sb.append(n1*n2);
        return sb.toString();
    }
}
