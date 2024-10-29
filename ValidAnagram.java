import java.util.Arrays;
public class ValidAnagram {
    public static void main(String[] args) {
        /*
        Given two strings s and t, return true if t is anagram of s, and false otherwise.

        Example:
        Input: s = "anagram", t = "nagaram"

        Output: true

         */


        // Input String str
        String s = "anagram";
        String t = "nagram";

        /*
        String s = rat;
        String t = car;
         */

        char array1[] = s.toCharArray();
        char array2[] = t.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        s = new String(array1);
        t = new String(array2);

        if (s.equals(t)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
