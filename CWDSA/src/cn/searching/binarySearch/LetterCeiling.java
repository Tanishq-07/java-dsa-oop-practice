package cn.searching.binarySearch;

public class LetterCeiling {
    public static void main(String[] args) {
        char[] letters = {'c','f','g','j'};
        char target = 'g';
        System.out.println(search(letters,target));
    }

    public static char search(char[] letters, char target) {
        int start = 0 ;
        int end = letters.length-1 ;
        while (start <=end) {
            int middle = start + (end - start) / 2;
            if (letters[middle] > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return letters[start % letters.length] ;
    }
}
