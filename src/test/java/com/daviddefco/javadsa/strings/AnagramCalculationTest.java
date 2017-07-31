package com.daviddefco.javadsa.strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by ddfrancisco on 31/07/2017.
 *
 * ANAGRAM CALCULATION
 *
 * An anagram  is a word or a phrase made by transposing the letters of another word or phrase; for example,
 * "parliament" is an anagram of "partial men," and "software" is an anagram of "swear oft."
 *
 * Given two strings the anagram calculator should return:
 *    - true if tey are anagram
 *    - false if not
 */
public class AnagramCalculationTest {
   private AnagramCalculator calculator = new AnagramCalculator();

   @Test
   public void stringIsAnagramOfItself() {
      assertTrue(calculator.isAnagram("string", "string"));
   }

   @Test
   public void stringsWithDifferentLEngthAreNoAnagrams() {
      assertFalse(calculator.isAnagram("string", "aString"));
   }

   @Test
   public void sameLettersInDifferentOrderIsAnagram() {
      assertTrue(calculator.isAnagram("saw", "was"));
   }

   @Test
   public void sameLengthBusDifferentLettersIsNotAnagram() {
      assertFalse(calculator.isAnagram("loop", "root"));
   }

   @Test
   public void spacesAreRemovedInCalculationOfAnagram() {
      assertTrue(calculator.isAnagram("partial men", "parliament"));
   }
}
