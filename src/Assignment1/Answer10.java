package Assignment1;

import java.util.Scanner;

public class Answer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check whether your input number is Armstrong number or not: ");
        int num = sc.nextInt();
        int finalValue = checkArmstrongNumber(num);
        if(num == finalValue){
            System.out.println("this is a Armstrong number.");
        }
        else{
            System.out.println("This is not a Armstrong number.");
        }

    }
    public static int checkArmstrongNumber(int num){
        int reverse = 0;
        int sumOfNum= 0; // initialize for adding those three digits in cube form.
        if(num>99 && num<1000) {


            for(int i=1; i<=3; i++) {
                int rem = num % 10;//getting remainder
                sumOfNum += (rem * rem * rem); // getting sum of their cube step by step
                reverse = (reverse * 10) + rem;
                num = num / 10; // for another iteration


            }


        }
        return sumOfNum;

    }
}
