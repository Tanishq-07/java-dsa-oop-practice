import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(45,3,48,2,0,145,845,23);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
