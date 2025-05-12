package test;

public class MultiplicationTable {
    public static void main(String[] args) {
        multiTable(5);
    }
    public static void multiTable(int n){
        for (int i = 1; i <=10 ; i++) {
            System.out.printf("%d * %d = %d",n,i,n*i);
            System.out.println();
        }
    }
}
