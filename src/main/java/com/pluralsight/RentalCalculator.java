package com.pluralsight;
import java.util.Scanner;

public class RentalCalculator {
   public static void main(String[] args) {

       double basicCarRentalPrice = 29.99;
       double surcharge = 0.30;
       double electronicTollTag;
       double GPS = 2.95;
       double roadSideAssistance = 3.95;

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




    }
}

