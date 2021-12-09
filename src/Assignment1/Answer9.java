package Assignment1;

import java.util.Scanner;

public class Answer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a distance in meter: ");
        double distance = sc.nextDouble();

        System.out.println("Input a hour: ");
        double hour = sc.nextDouble();

        System.out.println("Input a minute: ");
        double minute = sc.nextDouble();

        System.out.println("Input a second: ");
        double second = sc.nextDouble();
        convertAll(distance, hour, minute, second);


    }
    public static void convertAll(double distance, double hour, double minute, double second){
       double kilometer = distance/1000;
       double miles = distance/1609;
       double minuteInHour = minute/60;
       double secondInHour = second/3600;
       double totalHour = hour + minuteInHour + secondInHour;
       double  hourInSecond = hour * 3600;
       double minuteInSecond = minuteInHour*60;
       double totalSec = second + hourInSecond + minuteInSecond;

       double meterPerSecond = distance/totalSec;
       double kiloMeterPerHour = kilometer/totalHour;
       double milePerHour = miles/totalHour;

        System.out.println(meterPerSecond);
        System.out.println(kiloMeterPerHour);
        System.out.println(milePerHour);

    }
}
