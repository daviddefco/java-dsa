package com.daviddefco.javadsa.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by ddfrancisco on 01/08/2017.
 *
 * Substitution of white spaces for '%20' to handle URLs
 */
public class UrlSpacesReplacementTest {
   UrlSpaceReplacer replacer = new UrlSpaceReplacer();

   @Test
   public void nullStringsReturnNull() {
      assertNull(replacer.replaceWhiteSpaces(null));
   }

   @Test
   public void emptyStringIsReturnedAsIs() {
      assertEquals("", replacer.replaceWhiteSpaces(""));
   }

   @Test
   public void leadingSpacesAreReplaced() {
      assertEquals("%20", replacer.replaceWhiteSpaces(" "));
   }

   @Test
   public void trailingSpacesAreReplaced() {
      assertEquals("a%20", replacer.replaceWhiteSpaces("a "));
   }

   @Test
   public void multipleWhiteSpacesAreReplacedMultipleTimes() {
      assertEquals("%20%20a%20%20", replacer.replaceWhiteSpaces("  a  "));
   }

   @Test
   public void spacesInBetweenAreReplaced() {
      assertEquals(
        "http://nba.com/new%20players",
        replacer.replaceWhiteSpaces("http://nba.com/new players")
      );
   }
}
