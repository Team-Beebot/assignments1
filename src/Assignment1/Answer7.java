package Assignment1;

import java.util.Scanner;

public class Answer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first floating point number you want: ");
        float num1 = sc.nextFloat();

        System.out.println("Enter second floating point number number you want: ");
        float num2 = sc.nextFloat();
        checkFloatingNumber(num1, num2);


    }
    public static void checkFloatingNumber(float num1, float num2){

        if (Math.abs(num1 - num2) <= 0.01) { // condition for checking their after decimal value upto 2.
            System.out.println("These numbers are the same.");
        }
        else {
            System.out.println("These numbers are different.");
        }


    }
}
