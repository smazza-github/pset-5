/**
 * Problem Set 5.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * built-in methods, most notable of the String class. It is also your first
 * introduction to methods that accept parameters and return values. The main
 * method is declared, but it is up to you to implement. Write your code for each
 * exercise in the corresponding method. Make sure you test your code thoroughly.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Your code must meet the
 * requirements set forth in this section, and must support all possible values
 * that might be passed into your methods.
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet5 {

    public static void main(String[] args) {
        ProblemSet5 ps = new ProblemSet5();

        // Exercise 1
          // System.out.println(ps.surroundMe("cde", "abfg"));
          // System.out.println(ps.surroundMe(null, "####"));
          // System.out.println(ps.surroundMe("abc", null));
          // System.out.println(ps.surroundMe("abc", "123"));

        // Exercise 2
          // System.out.println(ps.endsMeet("abcdefg", 2));
          // System.out.println(ps.endsMeet(null, 2));
          // System.out.println(ps.endsMeet("", 2));
          // System.out.println(ps.endsMeet("abc", -1));

        // Exercise 3
          // System.out.println(ps.middleMan("abcdefg"));
          // System.out.println(ps.middleMan(null));
          // System.out.println(ps.middleMan("12"));
          // System.out.println(ps.middleMan("a"));

        // Exercise 4
          // System.out.println(ps.isCentered("abcdefg", "cde"));
          // System.out.println(ps.isCentered("abcdefg", "abc"));
          // System.out.println(ps.isCentered(null, "abc"));
          // System.out.println(ps.isCentered("abcd", "abc"));
          // System.out.println(ps.isCentered("abc", null));
          // System.out.println(ps.isCentered("abcdefg", "cd"));

        // Exercise 5
          // System.out.println(ps.countMe("I am an example sentence", 'e'));
          // System.out.println(ps.countMe(null, 'a'));
          // System.out.println(ps.countMe("abc$ def$", '$'));

        // Exerise 6
          // System.out.println(ps.triplets("aaabbbccc"));
          // System.out.println(ps.triplets("aaaa"));
          // System.out.println(ps.triplets("abc"));
          // System.out.println(ps.triplets(null));

        
    }

    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */

    public String surroundMe(String in, String out) {

      String outputString = in;
        if (in == null) {

          return in;

        } else if (out == null) {

          return in;

        } else if (out.length() != 4) {

          return in;

        } else {

          outputString = (out.substring(0, 2) + in + out.substring(2, 4));
          return outputString;

        }
    }

    /*
     * Exercise 2.
     *
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text.
     */

    public String endsMeet(String text, int n) {

      String outputString2 = text;
        if (text == null) {

          return text;

        } else if (text.length() < 1 || text.length() > 10) {

          return text;

        } else if (n < 1 || n > text.length()) {

          return text;

        } else {

          outputString2 = text.substring(0, n) + text.substring(text.length() - n, text.length());
          return outputString2;

        }
    }

    /*
     * Exercise 3.
     *
     * Given a string, return a new string using the middle three characters of text.
     */

    public String middleMan(String text) {

      String outputString3 = text;
        if (text == null) {

          return text;

        } else if (text.length() < 3) {

          return text;

        } else if (text.length() % 2 == 0) {

          return text;

        } else {

          outputString3 = (text.substring((int) Math.ceil(text.length() / 2) - 1, (int) Math.ceil (text.length() / 2 ) + 2));
          return outputString3;

        }
    }

    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */

    public boolean isCentered(String text, String target) {

      ProblemSet5 ps = new ProblemSet5 ();

        if (text == null) {

          return false;

        } else if (text.length() < 3) {

          return false;

        } else if (text.length() % 2 == 0) {

          return false;



        } else if (target == null) {

          return false;

        } else if (target.length() != 3) {

          return false;




        } else {

          if (ps.middleMan(text).equals(target)) {

            return true;

          } else {

            return false;

          }
        }
    }

    /*
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */

    public int countMe(String text, char suffix) {
      int count = 0;

      if (text == null) {

        return -1;

      } else if ((suffix >= 'A' && suffix <= 'Z') || (!(suffix >= 'a' && suffix <= 'z'))) {

        return -1;

      } else {

        String [] wordArray = text.spit(" ");
          for (String word : wordArray) {

            String lastChar = String.valueOf(word.charAt(word.length()-1));

            if (lastChar.equals(String.valueOf(suffix))) {
                count++;
            }
          }

          return count;

      }
    }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */

    public int triplets(String text) {

      int tripletCount = 0;

      if (text == null) {

        return -1;

      } else {

          for (int i = 0; i < text.length() - 2; i++) {

            if (text.charAt(i) ++ text.charAt(i + 2) && text.charAt(i) == text.charAt(i + 1)) {
              tripletCount++;

            }
          }

        return tripletCount;

      }
    }

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */

    public long addMe(String text) {

    }

    /*
     * Exercise 8.
     *
     * Given a string, compute the length of the longest sequence.
     */

    public long sequence(String text) {

    }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */

    public String intertwine(String a, String b) {

    }

    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */

    public boolean isPalindrome(String text) {

    }
}
