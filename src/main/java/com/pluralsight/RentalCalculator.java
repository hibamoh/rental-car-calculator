package com.pluralsight;
import java.util.Scanner;

public class RentalCalculator {
   public static void main(String[] args) {

       double basicCarRentalPrice = 29.99;
       double surcharge = 0.30;

       Scanner myScanner = new Scanner(System.in);

       System.out.println("when is the pickup date? ");
       String pickUpDate = myScanner.nextLine();

       System.out.println("how many days are you renting it for? ");
       int daysRenting = myScanner.nextInt();



    }
}

