package com.pluralsight;
import java.util.Scanner;

public class RentalCalculator {
   public static void main(String[] args) {

       double standardRentalPrice = 29.99;
       double surcharge = 0.30;
       double electronicTollTag = 3.95;
       double GPS = 2.95;
       double roadSideAssistance = 3.95;
       double basicTotal;
       double optionsCost = 0.0;
       double totalCost = 0.0;

       Scanner myScanner = new Scanner(System.in);

       System.out.println("when is the pickup date? ");
       String pickUpDate = myScanner.nextLine();

       System.out.println("how many days are you renting it for? ");
       int daysRenting = myScanner.nextInt();

       myScanner.nextLine();

       System.out.println("do you want an electronic toll tag for $3.95? (yes / no)");
       String wantsElectronicTag = myScanner.nextLine();

       System.out.println("do you want a gps for $2.95 a day (yes / no)");
       String wantsGps = myScanner.nextLine();

       System.out.println("do you want roadside assistance for $3.95 a day? (yes / no)");
       String wantsRoadSide = myScanner.nextLine();

       System.out.println("how old are you? ");
       int age = myScanner.nextInt();


       basicTotal = standardRentalPrice * daysRenting;

       // calculates the total options cost. ignores the user if prompted no
        if (wantsElectronicTag.equalsIgnoreCase("yes"))
            optionsCost += electronicTollTag * daysRenting;

        if (wantsGps.equalsIgnoreCase("yes"))
            optionsCost += GPS * daysRenting;

        if (wantsRoadSide.equalsIgnoreCase("yes"))
            optionsCost += roadSideAssistance * daysRenting;


        if (age < 25) {
            System.out.println("there is a surcharge fee for drivers under 25, it is 30% ");
            totalCost = (basicTotal + optionsCost) * surcharge;
        } else {
            System.out.println("there is no surcharge fee");
            totalCost = (basicTotal + optionsCost);
        }


        System.out.println("the basic cost of the rental is: " + basicTotal);
        System.out.println("the total options cost is " + optionsCost );
       System.out.println("your total cost will be %2f/n " + totalCost);



    }
}

