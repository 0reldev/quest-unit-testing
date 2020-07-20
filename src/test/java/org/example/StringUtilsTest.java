package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringUtilsTest {

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testAllVowels() {
        assertEquals("aeiouyAEIOUY", StringUtils.vowels("aeiouyAEIOUY"));
    }

    @Test
     public void testZazou() {
        assertEquals("aou", StringUtils.vowels("zazou"));
    }

    @Test
    public void testOrange() {
        assertEquals("Oae", StringUtils.vowels("Orange"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testException() {

        StringUtils.vowels("");
    }

    @Test
    public void testAAA() {

        assertEquals("A", StringUtils.uniqueVowels("AAA"));
    }

    @Test
    public void testAbracadabra() {

        assertEquals("a", StringUtils.uniqueVowels("abracadabra"));
    }

    @Test
    public void testHmmm() {

        assertEquals("", StringUtils.uniqueVowels("hmmm"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testException2() {

        StringUtils.uniqueVowels("");
    }
}
