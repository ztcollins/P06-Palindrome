//////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title: P06: Palindrome
// Course: CS 300 Spring 2021
//
// Author: Zachary Collins
// Email: ztcollins@wisc.edu
// Lecturer: Mouna Kacem
//
///////////////////////// ALWAYS CREDIT OUTSIDE HELP //////////////////////////
//
// Persons: -
// Online Sources: -
//
///////////////////////////////////////////////////////////////////////////////
/**
 * The Tester class for Palindrome.java. There are four methods and run all tests method that is
 * called in the main method. The four methods correspond to each method in Palindrome.java.
 * 
 * @author Zach C
 *
 */
public class PalindromeTester {

  // These methods should test valid AND invalid input against expected results,
  // and must NOT throw exceptions.

  /**
   * Checks if the method in Palindrome.java follows example output.
   * 
   * @return true / false
   */
  public static boolean testMirrorA() {
    if (Palindrome.mirrorA('E').equals("E D C B A B C D E")) {
      System.out.println("testMirrorA() passed.");
      return true;
    } else {
      System.out.println("ERROR: testMirrorA(char) did not return expected value!");
      return false;
    }
  }


  /**
   * Checks if the method in Palindrome.java follows example output.
   * 
   * @return true / false
   */
  public static boolean testMirrorAStep() {
    if (Palindrome.mirrorA('E', 3).equals("E B B E")) {
      System.out.println("testMirrorAStep() passed.");
      return true;
    } else {
      System.out.println("ERROR: testMirrorA(char, int) did not return expected value!");
      return false;
    }
  }


  /**
   * Checks if the method in Palindrome.java follows example output.
   * 
   * @return true / false
   */
  public static boolean testMirrorZ() {
    if (Palindrome.mirrorZ('V').equals("V W X Y Z Y X W V")) {
      System.out.println("testMirrorZ() passed.");
      return true;
    } else {
      System.out.println("ERROR: testMirrorZ(char) did not return expected value!");
      return false;
    }
  }


  /**
   * Checks if the method in Palindrome.java follows example output.
   * 
   * @return true / false
   */
  public static boolean testMirrorZStep() {
    if (Palindrome.mirrorZ('V', 3).equals("V Y Y V")) {
      System.out.println("testMirrorZStep() passed.");
      return true;
    } else {
      System.out.println("ERROR: testMirrorZ(char, int) did not return expected value!");
      return false;
    }
  }


  /**
   * This method must call ALL of your test methods and return true if and only if all methods
   * return true. If you add additional methods besides the four listed above, be sure to call them
   * here.
   * 
   * @return true - if all tests pass and false otherwise.
   */
  public static boolean runAllTests() {
    if (testMirrorA() == true && testMirrorAStep() == true && testMirrorZ() == true
        && testMirrorZStep() == true) {
      return true;
    }
    return false;
  }


  /**
   * The only line in this method should be a call to the runAllTests method.
   * 
   * @param args
   */
  public static void main(String[] args) {
    runAllTests();

  }

}
