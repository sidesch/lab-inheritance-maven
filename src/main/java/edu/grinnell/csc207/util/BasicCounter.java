package edu.grinnell.csc207.util;

public class BasicCounter implements Counter {
  
  /**
   * The current value of the counter.
   */
  int count;

  /**
   * The starting value.
   */
  int start;

  /**
   * Constructs a new BasicCounter.
   * @param startVal
   */
  public BasicCounter(int startVal) {
    this.start = startVal;
    this.count = startVal;
  } // BasicCounter(int)

  /**
   * Adds one to the count.
   */
  public void increment() throws Exception {
    this.count += 1;
    return;
  } // increment()

  /**
   * Reset the count to the starting value.
   */
  public void reset() {
    this.count = this.start;
    return;
  } // reset()

  /**
   * Converts this object to a String.
   * @return the object as a String.
   */
  public String toString() {
    return "[count: " + this.count + "]";
  } // toString()

  /**
   * Gets the current value of the counter.
   * @return the current count.
   */
  public int get() {
    return this.count;
  } // get()
} // class BasicCounter
