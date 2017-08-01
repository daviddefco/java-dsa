package com.daviddefco.javadsa.strings;

/**
 * Created by ddfrancisco on 01/08/2017.
 */
public class UrlSpaceReplacer {
   public String replaceWhiteSpaces (String string) {
      if(string == null) {
         return null;
      } else {
         return string.replaceAll("\\s", "%20");
      }
   }
}
