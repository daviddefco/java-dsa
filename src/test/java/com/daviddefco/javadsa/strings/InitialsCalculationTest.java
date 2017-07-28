package com.daviddefco.javadsa.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by ddfrancisco on 28/07/2017.
 *
 * STRING INITIAL CALCULATION
 *
 * Initials of a string are calculated following these rules:
 *  - It will return null if no string or an empty string is provided
 *  - It will return the first capitalized char of the string if only one word is provided:
 *       "cat" -> "C", "Cat" -> "C", "...*cat" -> "C"
 *  - It will return the first capitalized char of each word of the string. Each word is
 *    separated by ' ':
 *       "The cat in the Hat" -> "TCITH"
 */
public class InitialsCalculationTest {

   InitialsCalculator calculator = new InitialsCalculator();

   @Test
   public void noInitialsOnNoString () {
      assertNull(
              "Null string should not have initials",
              calculator.calculateInitials(null)
      );
   }

   @Test
   public void noInitialsOnEmptyString () {
      assertNull(
              "Empty string should not have initials",
              calculator.calculateInitials("")
      );
   }

   @Test
   public void firstLetterOnAnyCapitalizedWord () {
      assertEquals(
              "Initial of a capitalized word is its first char",
              "D",
              calculator.calculateInitials("David")
      );
   }

   @Test
   public void capitalizedFirstCharOnLowercaseWord() {
      assertEquals(
              "Capitalized first character on a lowercase word",
              "D",
              calculator.calculateInitials("david")
      );
   }

   @Test
   public void nonCharsAreSkipped() {
      assertEquals(
              "Non chars are skipped",
              "D",
              calculator.calculateInitials(".David")
      );
   }

   @Test
   public void eachSubwordGeneratesAnInitial() {
      assertEquals(
              "Each word contributes with an initial",
              "DDFM",
              calculator.calculateInitials("David de Francisco Marcos")
      );
   }
}
