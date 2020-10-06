package cse360assignment02;

/**  
* AddingMachine.java - A simple adding machine with implementations
* @author Yinghua Li
* @version 1.1 
* @see CSE360 
*/ 

public class AddingMachine {
  private int total;
  private String toostring = "0";
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total += value;
	  toostring = toostring + " + " + value;
  }

  public void subtract (int value) {
	  total -= value;
	  toostring = toostring + " - " + value;
  }

  public String toString () {
    return toostring;
  }

  public void clear() {
	  total = 0;
	  toostring = "0";
  }
  
  
}

