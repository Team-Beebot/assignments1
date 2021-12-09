package Assignment1;

import java.util.Scanner;

public class Answer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] listOfName = new String[5];
       int  lengthOfArr = listOfName.length;

       String[] stringsAlpha = new String[5]; // this is another array after sorting name in ascending order.

        for(int i=0; i<lengthOfArr; i++){
            System.out.println("Enter a name you want: ");
            listOfName[i] = sc.next();


        }


    }
}
