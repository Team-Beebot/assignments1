package Assignment1;

import java.util.Scanner;

public class Answer5C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for making inverted pyramid pattern: ");
        int rows = sc.nextInt();
        invertedPyramidPattern(rows);
    }
    public static void invertedPyramidPattern(int rows){
        for(int i = rows; i >= 1; --i) { // outerloop

            // inner loop for space
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            for(int j=i; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }

            for(int j = 0; j < i - 1; ++j) {
                System.out.print("* ");
            }

            System.out.println();
        }



    }
}
