package com.daviddefco.javadsa.strings;

/**
 * Created by ddfrancisco on 01/08/2017.
 */
public class DuplicateCharRemover {
   public String removeDuplicateChars (String string) {
      if(string == null) {
         return null;
      } else {
         for (int i=0; i < string.length()-1; i++) {
            char charToRemoveDuplicates = string.charAt(i);
            string = string.substring(0, i+1).concat(
              string.substring(i+1).replaceAll(String.valueOf(charToRemoveDuplicates), "")
            );
         }
      }
      return string;
   }
}
