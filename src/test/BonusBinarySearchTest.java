package test;
import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BonusBinarySearchTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void minusOneIfEmpty() {
        int[] testArray = new int[]{};
        assertEquals(BonusBinarySearch.binarySearch(testArray, 1),-1);
    }
    @Test
    public void minusOneIfMissingFromOne() {
        int[] testArray = new int[]{0};
        assertEquals(BonusBinarySearch.binarySearch(testArray, 1),-1);
    }
    @Test
    public void minusOneIfMissingFromTwo() {
        int [] testArray = new int[]{0,2,};
        assertEquals(BonusBinarySearch.binarySearch(testArray, 1),-1);
    }
    @Test
    public void minusOneIfMissingFromSeveral() {
        int [] testArray = new int[]{0,2,3};
        assertEquals(BonusBinarySearch.binarySearch(testArray, 1),-1);
    }
    @Test
    public void findOneFromOne() {
        int[] testArray = new int[]{1};
        assertEquals(BonusBinarySearch.binarySearch(testArray, 1),0);
    }
    @Test
    public void findOneFromTwo() {
        int[] testArray = new int[]{0,1};
        assertEquals(BonusBinarySearch.binarySearch(testArray, 1),1);
    }
    @Test
    public void findOneFromThree() {
        int[] testArray = new int[]{0,1,2};
        assertEquals(BonusBinarySearch.binarySearch(testArray, 1),1);
    }
    @Test
    public void findOneFromFour() {
        int[] testArray = new int[]{0,1,2,3};
        assertEquals(BonusBinarySearch.binarySearch(testArray, 1),1);
    }

}
