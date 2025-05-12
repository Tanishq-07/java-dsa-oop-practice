import java.util.ArrayList;

public class Leet1835 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3} ;
        int[] arr2 = {6,5};
        System.out.println(getXORSum(arr1,arr2));

    }
    public static int getXORSum(int[] arr1, int[] arr2) {
        ArrayList<Integer> list= new ArrayList<>(arr1.length*arr2.length);
        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j < arr2.length; j++) {
                list.add(arr1[i]&arr2[j]) ;
            }
        }
        int ans = 0 ;
        for (int i = 0; i < list.size(); i++) {
            ans ^= list.get(i);
        }
        return ans ;
    }
}
