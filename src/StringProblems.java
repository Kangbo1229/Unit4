import java.util.Scanner;

public class StringProblems {
    public static String printTheLetters(String s) {
        String blank = "";
        for (int i = 0; i < s.length(); i++) {
            blank += s.substring(i,i+1)+"\n";
        }
        return blank;
    }



    public static void main(String[] args) {
        //System.out.print(printTheLetters("pizza"));
        //System.out.print(everyOtherletter());
        //System.out.print(countTheVowels());
        //System.out.print(differentStrings());
        //System.out.print(isPalindrome());
    }
}
