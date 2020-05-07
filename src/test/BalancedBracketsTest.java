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
    // test the example strings
    // balanced - "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
    //
    // unbalanced - "[LaunchCode", "Launch]Code[", "[", "]["

    //jpg test 5 - example 1
    @Test
    public void example1True() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    //jpg test 6 - example 2
    @Test
    public void example2True() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    //jpg test 7 - example 3
    @Test
    public void example3True() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    //jpg test 8 - example 4
    @Test
    public void example4False() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    //jpg test 9 - example 5
    @Test
    public void example5False() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    //jpg test 10 - bad middle brackets = false []][[]
    @Test
    public void badMiddleBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]][[]"));
    }
    //jpg test 11 - nicely nested = true [[][]]
    @Test
    public void nicelyNested() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][]]"));
    }
    //jpg test 12 - bad pattern = false [[]][]][
    @Test
    public void badPattern() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]][]]["));
    }
}
