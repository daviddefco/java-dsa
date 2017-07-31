package com.daviddefco.javadsa.strings.utils;

/**
 * Created by ddfrancisco on 31/07/2017.
 */
public class MutableInt {
      int value = 1; // note that we start at 1 since we're counting
      public void increment () { ++value; }
      public void decrement () { --value; }
      public int  get ()       { return value; }
}
