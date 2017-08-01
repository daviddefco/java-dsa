package com.daviddefco.javadsa.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ddfrancisco on 01/08/2017.
 *
 * Reverse a C-String. C-String means that “abcd” is represented as five characters, including the null character.
 */
public class ReverseCStringTest {
   CStringReverter reverter = new CStringReverter();

   @Test(expected = IllegalArgumentException.class)
   public void stringsWithoutNullAreDiscarded() {
      String revertedString = reverter.revertCString("javaString");
   }

   @Test
   public void cStringsAreReverted() {
      String cString = "cstring" + '\u0000';
      assertEquals("gnirtsc" + '\u0000', reverter.revertCString(cString));
   }

   @Test
   public void onlyNullCharacterRemainsTheSame() {
      String cString = String.valueOf('\u0000');
      assertEquals(cString, reverter.revertCString(cString));
   }

   @Test(expected = IllegalArgumentException.class)
   public void nullStringTriggersError() {
      String revertedString = reverter.revertCString(null);
   }

}
