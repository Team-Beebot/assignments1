package Assignment1;

import java.util.Scanner;

public class Answer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer number: ");
        int integerNumber = sc.nextInt();
        primeNumberList(integerNumber);


    }
    //--------------------------------------------------------------------------------------------------------------------------
    // function execute all operation but not in return form


    public static void  primeNumberList(int integerNumber){

                int increase = 0; // initilize the value of increase variable for below use.
            for(int i=1; i<=integerNumber; i++){
                for(int j = 2; j<=i-1; j++){
                    if(i%j == 0){
                        increase = increase + 1;   // increasing value by 1
                    }
                }
               if(increase == 0){
                   System.out.println(i);
               }
               else{
                   increase =0;
               }

            }




            }


}

