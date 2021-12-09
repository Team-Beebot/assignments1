package Assignment1;

import java.util.Scanner;

public class Answer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for making star pattern of same row and column: ");
        int num = sc.nextInt();
        patterStarSquare(num);


    }
    public static void patterStarSquare(int num){
        for(int i = 0; i<num; i++){  // outer loop for number of rows

            for(int j=0; j<num; j++){    // inner loop (column of patter star *)
                System.out.print("* ");
            }
            System.out.println();



        }


    }
}