package test;

import org.junit.Test;
import main.BalancedBrackets;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public void testEmptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void testStringWithOnlyBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testStringWithNonBracketCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void testStringWithNestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Code]]"));
    }

    @Test
    public void testStringWithUnbalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void testStringWithMisorderedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void testStringWithSingleOpeningBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void testStringWithSingleClosingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void testStringWithOnlyOpeningBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void testStringWithOnlyClosingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }

    @Test
    public void testStringWithMultipleOpeningBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch[Code]"));
    }

    @Test
    public void testStringWithMultipleClosingBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch]Code]"));
    }
}





