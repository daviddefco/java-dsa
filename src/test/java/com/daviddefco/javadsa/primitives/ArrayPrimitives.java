package com.daviddefco.javadsa.primitives;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;;

/**
 * Created by ddfrancisco on 31/07/2017.
 *
 * Tests made to understand array primitives
 */
public class ArrayPrimitives {

   int[] fibonnaci = { 3, 2, 5, 13, 7 };

   @Test
   public void arrayLength() {
      assertEquals(5, fibonnaci.length);
   }

   @Test
   public void firstElementIsZero() {
      assertEquals(3, fibonnaci[0]);
   }

   @Test(expected = ArrayIndexOutOfBoundsException.class)
   public void lastElementISLessThanLenght() {
      System.out.print(fibonnaci[fibonnaci.length]);
   }

   @Test
   public void copiedArraysAreEqual() {
      int[] copiedArray = Arrays.copyOfRange(fibonnaci, 0, fibonnaci.length);
      assertTrue(Arrays.equals(fibonnaci, copiedArray));
   }

   @Test
   public void fillFillsWithSameValue() {
      int[] threeArray = new int[3];
      Arrays.fill(threeArray, 3);
      for (int value: threeArray) {
         assertEquals(3, value);
      }
   }

   @Test
   public void binarySearchFindingElementReturnsPosition() {
      Arrays.sort(fibonnaci);
      assertEquals(1, Arrays.binarySearch(fibonnaci, 3));
   }

   // Binary search returns -(insertion point) if not found
   // Hence, if it returns >= 0 the key has been found in the array
   @Test
   public void binarySearchReturnsMinusInsertionPointIfNotFound() {
      assertEquals(-4, Arrays.binarySearch(fibonnaci, 11));
   }
}
