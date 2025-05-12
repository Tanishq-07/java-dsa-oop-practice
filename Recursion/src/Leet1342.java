public class Leet1342 {
    public static void main(String[] args) {
        int num = 14 ;
        int count = 0 ;
        System.out.println(numberOfSteps(count,num));
    }
    public static int numberOfSteps(int count, int num) {
        if(num == 0){
            return count ;
        }
        if(num%2==0 && num>0){
            count +=1 ;
            return numberOfSteps(count,num/2);
        }
        else if(num%2!=0&& num>0){
            count +=1 ;
            return numberOfSteps(count,num-1) ;
        }
        return count ;
    }
}
