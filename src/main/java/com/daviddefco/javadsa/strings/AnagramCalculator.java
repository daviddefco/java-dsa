package com.daviddefco.javadsa.strings;

import com.daviddefco.javadsa.strings.utils.MutableInt;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ddfrancisco on 31/07/2017.
 */
public class AnagramCalculator {

   public boolean isAnagram (String candidate, String anagramCandidate) {
      boolean isAnagram = false;

      String cleanedCandidate = cleanString(candidate);
      String cleanedAnagramCandidate = cleanString(anagramCandidate);

      if (cleanedCandidate.length() == cleanedAnagramCandidate.length()) {
         try {
            CharCounter counter = new CharCounter();
            counter.countCharsOfString(cleanedCandidate);
            counter.discountCharsOfString(cleanedAnagramCandidate);
            isAnagram = counter.isEmptyCounter();
         } catch(IllegalStateException ise) {}
      }

      return isAnagram;
   }

   private String cleanString(String string) {
      return string.replaceAll("\\W", "");
   }

   class CharCounter {
      private Map<String, MutableInt> charCounter = new HashMap<String, MutableInt>();

      public void countCharsOfString(String stringToCount) {
         for(String letter: cleanString(stringToCount).split("")) {
            MutableInt letterCount = charCounter.get(letter);
            if(letterCount == null) {
               charCounter.put(letter, new MutableInt());
            } else {
               letterCount.increment();
            }
         }
      }

      public void discountCharsOfString(String stringToDiscount) {
         for(String letter: cleanString(stringToDiscount).split("")) {
            MutableInt letterCount = charCounter.get(letter);
            if(letterCount == null) {
               // No letter was there to discount
               throw new IllegalStateException();
            } else {
               letterCount.decrement();
            }
         }
      }

      public boolean isEmptyCounter() {
         for(MutableInt letterCounter: charCounter.values()) {
            if (letterCounter.get() != 0) return false;
         }
         return true;
      }
   }
}