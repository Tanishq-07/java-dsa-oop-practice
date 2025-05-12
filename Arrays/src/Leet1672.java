import java.util.Arrays;

public class Leet1672 {
    public static int[][] account = {{1,5}, {7,3}, {3,5}};

    public static void main(String[] args) {       int wealth = 0;
       for(int i = 0; i<account.length; i++){
            int maxWealth =0;
            for(int j=0; j<account[i].length; j++){
                maxWealth += account[i][j];
            }
            if(wealth < maxWealth){
                wealth = maxWealth;
            }   
        }
        System.out.println(wealth) ;
   }
}
