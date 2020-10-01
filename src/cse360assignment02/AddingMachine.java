package cse360assignment02;

/**  
* AddingMachine.java - code implemented
* @author Yinghua Li
* @version 1.1
* @see CSE360
*/ 

public class AddingMachine {
  private static int total;
  private static String toostring = "0";
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public static int getTotal () {
    return total;
  }
  
  public static void add (int value) {
	  total += value;
	  toostring = toostring + " + " + value;
  }

  public static void subtract (int value) {
	  total -= value;
	  toostring = toostring + " - " + value;
  }

  public static String towString () {
    return toostring;
  }

  public void clear() {
	  total = 0;
	  toostring = "0";
  }
  
  
  public static void main(String[] args)
  {
	   add(4);
	   add(5);
	   subtract(2);
	   add(1);
	   System.out.println(getTotal());
	   System.out.println(towString());
	   
	   
  }
}

