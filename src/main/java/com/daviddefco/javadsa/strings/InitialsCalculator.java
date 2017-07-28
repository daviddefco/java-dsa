package com.daviddefco.javadsa.strings;

/**
 * Created by ddfrancisco on 28/07/2017.
 */
public class InitialsCalculator {

   public String calculateInitials (String string) {
      return  isNonEmptyString(string)?
         getInitialsFromNonEmptyString(string)
         : null;
   }

   private boolean isNonEmptyString(String string) {
      return string != null && string.length() > 0;
   }

   private String getInitialsFromNonEmptyString(String nonEmptyString) {
      StringBuilder auxInitials = new StringBuilder();
      for(String word: nonEmptyString.split(" ")) {
         auxInitials.append(getInitialFromWord(word));
      }
      return auxInitials.toString();
   }

   private String getInitialFromWord(String word) {
      String formattedString = word.replaceAll("\\W", "");
      return String.valueOf(formattedString.toUpperCase().charAt(0));
   }
}
