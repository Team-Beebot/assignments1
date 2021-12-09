package Assignment1;

import java.util.Scanner;

public class Answer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number you want: ");
        int num1 = sc.nextInt();

        System.out.println("Enter sec number you want: ");
        int num2 = sc.nextInt();

        System.out.println("Enter third number you want: ");
        int num3 = sc.nextInt();

        orderOfGivenNumber(num1, num2, num3);

    }
    public static void orderOfGivenNumber(int num1, int num2, int num3){
        if(num1>num2 && num2>num3){
            System.out.println("They are in decreasing order.");
        }
        else if(num1<num2 && num2<num3){
            System.out.println("They are in increasing order.");
        }
        else{
            System.out.println("they are neither in increasing order nor decreasing order.");
        }

    }

}
