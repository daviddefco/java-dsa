package com.daviddefco.javadsa.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by ddfrancisco on 01/08/2017.
 *
 * Remove the duplicate characters in a string without using any additional buffer.
 * NOTE: One or two additional variables are fine. An extra copy of the array is not.
 */

public class DuplicateCharsRemovalTest {
   private DuplicateCharRemover remover = new DuplicateCharRemover();

   @Test
   public void nullStringsReturnNull() {
      assertNull(remover.removeDuplicateChars(null));
   }

   @Test
   public void emptyStringReturnsEmptyString() {
      assertEquals("", remover.removeDuplicateChars(""));
   }

   @Test
   public void anyStringWithDifferentCharsIsReturnedAsIs() {
      assertEquals("abcde", remover.removeDuplicateChars("abcde"));
   }

   @Test
   public void stringWithDuplicatedCharsAreRemoved() {
      assertEquals("abcdefghi", remover.removeDuplicateChars("aabcddefghhi"));
   }

   @Test
   public void duplicatedCharsAtBeginningOrEndBEhavesAsExpected() {
      assertEquals("ab", remover.removeDuplicateChars("aab"));
      assertEquals("ab", remover.removeDuplicateChars("abb"));
   }
}
