package edu.grinnell.csc207.util;

public class BoundedCounter extends BasicCounter {
  /**
   * Boundary of the counter.
   */
  int bound;
    
  /**
   * Construct a new bounded counter. 
   * @param startVal the starting value of the counter
   * @param boundVal the boundary of the counter
   */
  public BoundedCounter(int startVal, int boundVal) {
    super(startVal);
    this.bound = boundVal;
  } // BoundedCounter(int, int)

  @Override
  public void increment() throws Exception {
    if (super.count + 1 == this.bound) {
      throw new Exception("Count exceeds bounds.");
    } else {
      super.increment();
    } // if
  } // increment()
}
