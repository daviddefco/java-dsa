package com.daviddefco.javadsa.strings;

/**
 * Created by ddfrancisco on 01/08/2017.
 */
public class CStringReverter {
      public String revertCString (String string) {
         if(string == null || string.charAt(string.length() -1) != '\u0000') {
            throw new IllegalArgumentException();
         } else {
            StringBuilder builder = new StringBuilder(string.substring(0, string.length() - 1));
            return builder.reverse().toString() + '\u0000';
         }
      }
}
