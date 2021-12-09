package Assignment1;

import java.util.Scanner;

public class Answer5A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for making hollow square pattern: ");
        int n = sc.nextInt();
        hollowSquarePattern(n);
    }
    public static void hollowSquarePattern(int n){
        for (int i = 1; i <= n; i++) {
            for(int j =1; j<=n ; j++){
                if(j==1 || j==n || i==1 || i==n){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();



        }
    }
}
