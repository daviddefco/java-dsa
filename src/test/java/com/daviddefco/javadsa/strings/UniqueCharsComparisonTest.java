package com.daviddefco.javadsa.strings;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by ddfrancisco on 31/07/2017.
 *
 * Check if a string has unique chars
 */
public class UniqueCharsComparisonTest {
   UniqueCharsChecker checker = new UniqueCharsChecker();

   @Test
   public void aNullStringHasNoUniqueChars() {
      assertFalse(checker.checkUniqueChars(null));
   }

   @Test
   public void emptyStringHasNoUniqueChars() {
      assertFalse(checker.checkUniqueChars(""));
   }

   @Test
   public void stringsWithDifferentCharsHaveUniqueChars() {
      assertTrue(checker.checkUniqueChars("abcdfe"));
   }

   @Test
   public void stringsWithRepeatedCharsHaveNotUniqueChars() {
      assertFalse(checker.checkUniqueChars("abccdef"));
   }

   @Test
   public void spacesDoNotCountAsChars() {
      assertTrue(checker.checkUniqueChars("  abscdef   "));
   }

   @Test
   public void onlySpacesOrNonCharsDoNotQualify() {
      assertFalse(checker.checkUniqueChars("   ^**::   "));
   }
}
