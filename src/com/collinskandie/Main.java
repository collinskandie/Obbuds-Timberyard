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
                    System.out.println("..................................");
                    break;
                }
                case 2:
                {
                    String option,type;
                    System.out.println("..................................");
                    System.out.println("Welcome to the point of sell interface");
                    System.out.println("..................................");
                    System.out.println("Please enter the category of wood you wish to sell i.e:");
                    System.out.println("A-1X1”,B-1X2”,C-2X2”,D-2X3”,E-3X3”,F-3X4”,G-4X4”,H-1X6”,I-2X6”,J-3X6”");
                    System.out.println("Use the initial letters only that is A for category A-1X1”");
                    option= scanner.next();
                    if (option.equals("A"))
                    {
                        yard.dimension= scanner.next();

                    }else if (option.equals("B"))
                    {
                        yard.dimension= scanner.next();

                    }else if (option.equals("C"))
                    {
                        yard.dimension= scanner.next();

                    }else if (option.equals("D"))
                    {
                        yard.dimension= scanner.next();

                    }else if (option.equals("E"))
                    {
                        yard.dimension= scanner.next();

                    }else if (option.equals("F"))
                    {
                        yard.dimension= scanner.next();

                    }else if (option.equals("G"))
                    {
                        yard.dimension= scanner.next();

                    }else if (option.equals("I"))
                    {
                        yard.dimension= scanner.next();

                    }else if (option.equals("J"))
                    {
                        yard.dimension= scanner.next();

                    }
                    System.out.println("What kind of wood do you want to sell hard or softwood");
                    type= scanner.nextLine();
                    //quantity sold will be generated randomly in the abstract class.
                    System.out.println("We know its unfair but the system want us to generate thw quantity you are selling randomly. Just accept the cash from the customer");
                    System.out.println("..................................");
                    System.out.println("This is the amount you should accept from the buyer"+yard.sales);
                    System.out.println("Thank you, proceed to reports");
                    break;
                }
                case 3:
                {
                    //This section of the code will display reports of sales, stock and profits made by Obuds 2020.
                    System.out.println("..................................");
                    System.out.println("Sales report");
                    System.out.println("..................................");
                    System.out.println("Totals sales"+yard.totalSales);
                    System.out.println("sales on Hardwood"+yard.hardWSales);
                    System.out.println("sales on Softwood"+yard.hardWSales);
                    System.out.println("..................................");
                    System.out.println("Stock report");
                    System.out.println("..................................");
                    System.out.println("The total of feet available for sale as at now is"+yard.totalQuantity);
                    System.out.println("Softwood available for sale"+yard.softAv);
                    System.out.println("Softwood available for sale"+yard.hardAv);
                    System.out.println("..................................");
                    System.out.println("The total profit made is"+yard.totalProfit);
                    System.out.println("..................................");
                    System.out.println("Thank you");
                    break;

                }
                case 4:
                {
                    System.out.println("You are logging out of the system, bye");
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Invalid Choice");
                    System.out.println("Please try again");
            }

        }while (true);
    }
}
