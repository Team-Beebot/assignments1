package Assignment1;

import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check whether your input letter is palindrome or not: ");
        String strLetter = sc.nextLine();

        checkPalindrome(strLetter);   // from here all program going to work or start functioning,


    }
//------------------------------------------------------------------------------------------------------
    // void function for palindrome check

    private static void checkPalindrome(String strLetter){
        String  reverseStr = "";

        int strLength = strLetter.length();    // strLength variable store length of the given string.

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr += strLetter.charAt(i);
        }

        if (strLetter.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(strLetter + " is a Palindrome String.");
        }
        else {
            System.out.println(strLetter + " is not a Palindrome String.");
        }
    }

}

