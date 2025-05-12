public class Leet1732 {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2} ;
        System.out.println(largestAltitude(gain));

    }
    public static int largestAltitude(int[] gain) {
        int initial = 0 ;
        int[] altitudes = new int[gain.length+1] ;
        altitudes[0] = 0 ;
        for(int i=1; i<gain.length+1; i++){
            altitudes[i] = initial+gain[i-1];
            initial = altitudes[i];
        }
        int max = altitudes[0] ;
        for(int j=0; j<altitudes.length; j++){
            if(altitudes[j]>max){
                max = altitudes[j] ;
            }
        }
        return max ;
    }
}
