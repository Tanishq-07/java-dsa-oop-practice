/* Q). You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

       Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters. */

public class Leet744 {
    public static void main(String[] args) {
        char[] letters = {'c','f','f'};
        char target = 'g' ;
        char ans = nextGreatestLetter(letters, target) ;
        System.out.println(ans);
    }
    public static char nextGreatestLetter(char[] letters, char target){
        int start = 0 ;
        int end = letters.length-1 ;
        while (start<= end){
            int middle = start + (end - start)/2 ;
            if (letters[middle]>target) {
                end = middle-1 ;
            }
            else if (letters[middle]<target){
                start = middle+1 ;
            }
            else
                return letters[middle+1];
        }
        return letters[start % letters.length] ;
    }
}
