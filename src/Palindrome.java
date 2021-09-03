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
 * This class has 4 methods that create 2 different palindromes in 2 different ways. The first two
 * create palindromes that go toward A and the second two create palindromes that go toward Z. The
 * second method of each type is an overloaded method of the first that allows the palindromes to
 * have a "step size".
 * 
 * @author Zach C
 *
 */
public class Palindrome {

  /**
   * -Recursively create a simple alphabet pattern, starting at the provided character, moving
   * backward to the beginning of the alphabet, and then forward again to the provided letter,
   * separating each letter with a space. -If start is 'E', the method should return the string "E D
   * C B A B C D E" ○ This method is only valid for capital letter input; if anything other than a
   * capital letter is provided as an argument, throw an IllegalArgumentException with a descriptive
   * error message.
   * 
   * @param start - char that is passed in and will decrement/increment through recursion
   * @return palindrome - String that is returned and will record each char through recursion
   * @throws IllegalArgumentException - when input is invalid for the method (includes recursion)
   */
  public static String mirrorA(char start) throws IllegalArgumentException {
    if ((start > 'Z') || (start < 'A')) {
      throw new IllegalArgumentException("must be an uppercase letter!");
    }
    String palindrome = "";
    // System.out.println(start);
    if (start == 'A') {
      return "A";
    }
    palindrome = start + " " + mirrorA((char) (start - 1)) + " " + start;
    // System.out.println(palindrome);
    return palindrome;

  }


  /**
   * -Recursively create an alphabet pattern, starting at the provided character, and moving back
   * and forth to the beginning of the alphabet by steps of size step. -If start is 'E' and step is
   * 1, the method should return the same string as mirrorA(start). -If start is 'E' and step is 2,
   * the method should return "E C A C E" -If start is 'E' and step is 3, the method should return
   * "E B B E" -and so on. -As before, the method is only valid for capital letter input and
   * strictly positive (not zero or negative) step sizes. For invalid input, throw an
   * IllegalArgumentException with a descriptive error message.
   * 
   * @param start - char that is passed in and will decrement/increment through recursion
   * @param step  - int that is passed in to determine "step size"
   * @return palindrome - String that is returned and will record each char through recursion
   * @throws IllegalArgumentException - when input is invalid for the method (includes recursion)
   */
  public static String mirrorA(char start, int step) throws IllegalArgumentException {
    if ((start > 'Z') || (start < 'A')) {
      throw new IllegalArgumentException("must be an uppercase letter!");
    }
    if (step <= 0) {
      throw new IllegalArgumentException("must be a non-negative step size!");
    }
    String palindrome = "";
    // System.out.println(start);
    if (start == 'A') {
      return "A";
    }
    if (start - step < 'A') {
      return start + " " + palindrome + start;
    }
    palindrome = start + " " + mirrorA((char) (start - step), step) + " " + start;
    // System.out.println(palindrome);
    return palindrome;

  }


  /**
   * -Recursively create a simple alphabet pattern, starting the provided character, and moving
   * forward to the end of the alphabet, and then backward again to the provided letter, separating
   * each letter with a space. -If start is 'V', the method should return the string "V W X Y Z Y X
   * W V" -This method is only valid for capital letter input; if anything other than a capital
   * letter is provided as an argument, throw an IllegalArgumentException with a descriptive error
   * message.
   * 
   * @param start - char that is passed in and will decrement/increment through recursion
   * @return palindrome - String that is returned and will record each char through recursion
   * @throws IllegalArgumentException - when input is invalid for the method (includes recursion)
   */
  public static String mirrorZ(char start) throws IllegalArgumentException {
    if ((start > 'Z') || (start < 'A')) {
      throw new IllegalArgumentException("must be an uppercase letter!");
    }
    String palindrome = "";
    // System.out.println(start);
    if (start == 'Z') {
      return "Z";
    }
    palindrome = start + " " + mirrorZ((char) (start + 1)) + " " + start;
    // System.out.println(palindrome);
    return palindrome;

  }


  /**
   * -Recursively create an alphabet pattern, starting at the provided character, and moving forward
   * and back to the end of the alphabet by steps of size step. -If start is 'V' and step is 1, the
   * method should return the same string as mirrorB(end). -If start is 'V' and step is 2, the
   * method should return "V X Z X V" -If start is 'V' and step is 3, the method should return "V Y
   * Y V" -And so on. -As before, the method is only valid for capital letter input and strictly
   * positive (not zero or negative) step sizes. For invalid input, throw an
   * IllegalArgumentException with a descriptive error message.
   * 
   * @param start - char that is passed in and will decrement/increment through recursion
   * @param step  - int that is passed in to determine "step size"
   * @return palindrome - String that is returned and will record each char through recursion
   * @throws IllegalArgumentException - when input is invalid for the method (includes recursion)
   */
  public static String mirrorZ(char start, int step) throws IllegalArgumentException {
    if ((start > 'Z') || (start < 'A')) {
      throw new IllegalArgumentException("must be an uppercase letter!");
    }
    if (step <= 0) {
      throw new IllegalArgumentException("must be a non-negative step size!");
    }
    String palindrome = "";
    // System.out.println(start);
    if (start == 'Z') {
      return "Z";
    }
    if (start + step > 'Z') {
      return start + " " + palindrome + start;
    }
    palindrome = start + " " + mirrorZ((char) (start + step), step) + " " + start;
    // System.out.println(palindrome);
    return palindrome;

  }
}
