package com.collinskandie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Abstract yard = null;
        System.out.println("Welcome To Obuds2020 timber yard");
        System.out.println("..................................");
        int n;
        do {
            System.out.println("1. Receive Items (new stock) Admin");
            System.out.println("2. Point of sale console");
            System.out.println("3. Check out Reports");
            System.out.println("..................................");
            System.out.println("Please choose an option from above");
            n= scanner.nextInt();
            System.out.println("..................................");
            switch (n){
                case 1:{
                    System.out.println("..................................");
                    System.out.println("Welcome to the admin panel");
                    System.out.println("..................................");
                    System.out.println("Please Enter the total feet of softwood purchased");
                    yard.softWoodPurchased = scanner.nextDouble();
                    System.out.println("Please Enter the total feet of Hardwood purchased");
                    yard.hardWoodPurchased = scanner.nextDouble();
                    System.out.println("Enter the buying price of soft wood");
                    yard.buyingPriceSoft= scanner.nextDouble();
                    System.out.println("Enter the selling price of soft wood in category A");
                    yard.dimAs = scanner.nextDouble();
                    System.out.println("Enter the selling price of soft wood in category I");
                    yard.dimIs = scanner.nextDouble();
                    System.out.println("Thank you, you are logged out as an admin... login again to receive more stock");
                    break;
                }


                case 2:
                case 3:
                case 4:
            }

        }while (true);
    }
}
