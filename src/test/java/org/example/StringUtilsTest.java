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

    // Problème trouvé : quand la premier caractère de l'entrée est une voyelle,
    // celle-ci ne ressort pas.


    @Test(expected = IllegalArgumentException.class)
    public void testException() {

        StringUtils.vowels("");
    }
}
