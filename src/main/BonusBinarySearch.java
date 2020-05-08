package main;

public class BonusBinarySearch {

    /**
     * A binary search implementation for integer arrays.
     *
     * Info about binary search: https://www.geeksforgeeks.org/binary-search/
     *
     * @param sortedNumbers - must be sorted from least to greatest
     * @param n - number to search for
     * @return index of search item if it's found, -1 if not found
     */
    public static int binarySearch(int[] sortedNumbers, int n) {
       //check for empty array
        if(sortedNumbers.length == 0) {
            return -1;
        }
        //check for one-value array
        if(sortedNumbers.length == 1 && sortedNumbers[0] == n) {return 0;}
        int right = sortedNumbers.length - 1;
        //System.out.println(right);
        int left = 0;
        while (right > left + 1 ) {
            int mid = left + ((right - left) / 2);
            //System.out.println(((right - left) / 2));
            //System.out.println(mid);
            if (sortedNumbers[mid] > n) {
                right = mid;
            } else if (sortedNumbers[mid] < n) {
                left = mid;
            } else if (sortedNumbers[mid] == n){
                return mid;
            } else { return -1; }
        }
        return -1;
    }

}
