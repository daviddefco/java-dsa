package com.daviddefco.javadsa.strings;

/**
 * Created by ddfrancisco on 31/07/2017.
 */
public class UniqueCharsChecker {
   public boolean checkUniqueChars (String string) {
      boolean hasUniqueChars =  true;
      String stringWithCharsOnly = string == null ? null : string.replaceAll("\\W", "");

      if(stringWithCharsOnly == null || stringWithCharsOnly.length() == 0) {
         hasUniqueChars = false;
      } else {
         for(int i=0; i<stringWithCharsOnly.length() - 1; i++) {
            if(stringWithCharsOnly.indexOf(stringWithCharsOnly.charAt(i), i+1) != -1) {
               hasUniqueChars = false;
               break;
            }
         }
      }

      return hasUniqueChars;
   }
}
