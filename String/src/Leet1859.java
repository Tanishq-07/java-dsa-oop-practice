import java.util.Arrays;

public class Leet1859 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ") ;
        int index = 0 ;
        while(index< arr.length){
            int correct = arr[index].charAt(arr[index].length()-1) - 48 -1  ;
            if(arr[index].charAt(arr[index].length()-1)-48 != arr[correct].charAt(arr[correct].length()-1)-48){
                swap(arr,correct,index);
            }
            else {
                index +=1 ;
            }
        }

        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            sb.append(arr[j]+" ");
        }
        for (int i = 0; i <sb.length() ; i++) {
            if(sb.charAt(i)==' '){
                sb.deleteCharAt(i-1);
            }
        }
        System.out.println((sb.toString()).strip());
    }

    public static void swap(String[]arr,int correct, int index){
        String temp = arr[correct];
        arr[correct] = arr[index];
        arr[index] = temp ;
    }
}
