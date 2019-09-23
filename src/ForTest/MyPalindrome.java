package ForTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyPalindrome {
    public static void main(String[] args) throws java.lang.Exception{
        String line;
        BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
        line=inp.readLine();
        String line2 = line.replaceAll("\\d|\\W|\\s","");
        palindrome(line2);
    }
    static boolean palindrome(String s) {
        String w = s.toLowerCase();
        int number = w.length();
        for (int i = 0; i < (number/2); ++i) {
            if (w.charAt(i) != w.charAt(number - i - 1)) {
              System.out.println("NO");
                return false;
            }
        }
        System.out.println("YES");
        return true;

    }
}
