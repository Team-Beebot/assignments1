package Assignment1;

import java.util.Scanner;

public class Answer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your body mass in kg: ");
        float bodyMass = sc.nextFloat();

        System.out.println("Enter your height: ");
        float height = sc.nextFloat();
        float finalBmi = bmiCalculator(bodyMass, height);

        System.out.println(finalBmi);

    }
    public static float bmiCalculator(float bodyMass, float height){
       float heightInMeter = (float) (height/3.281);

        return (bodyMass/(heightInMeter*heightInMeter));
    }
}
