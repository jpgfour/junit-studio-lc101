package test;

import main.BalancedBrackets;
import org.junit.Test;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    //freebie test
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    //jpg test 1
    @Test
    public void oneLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    //jpg test 2
    @Test
    public void oneRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    //jpg test 3
    @Test
    public void firstBracketNotRightBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    //jpg test 4
    @Test
    public void lastBracketNotLeftBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }

}
