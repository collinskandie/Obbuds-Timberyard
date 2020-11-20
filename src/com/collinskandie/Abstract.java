package com.collinskandie;

public class Abstract {
    private
    //declaring variables.
    double dimA;
    double dimB,softWoodPurchased,hardWoodPurchased;
    double dimC,dimD,dimE,dimF;
    double dimG,dimH,dimI,dimJ,quantity,sales;
    double profit,totalProfit,purchases;
    double buyingPriceOfHard,buyingPriceSoft,totalQuantity,quantityPurchased;
    double dimAs,dimBs,dimCs,dimDs,dimEs,dimFs,dimGs,dimHs,dimIs,dimJs;
    String type,dimension;
           //declaring a parameterised constructor.
    public Abstract(){
        dimAs=0;
        dimA=2.2*dimAs;
        dimB=dimA+(0.3*dimA);
        dimC=dimB+(0.3*dimB);
        dimD=dimC+(0.3*dimC);
        dimE=dimD+(0.3*dimD);
        dimF=dimE+(0.3*dimE);
        dimG=dimF+(0.2*dimF);
        dimH=dimG+(0.2*dimG);
        dimIs=0;
        dimI=2.2*dimIs;
        dimJ=dimI+(0.5*dimI);
        // setting prices for softwood.
         dimBs=dimAs+(0.3*dimAs);
         dimCs=dimBs+(0.3*dimBs);
         dimDs=dimCs+(0.3*dimCs);
         dimEs=dimDs+(0.3*dimDs);
         dimFs=dimEs+(0.3*dimEs);
         dimGs=dimFs+(0.2*dimFs);
         dimHs=dimGs+(0.2*dimGs);
         dimJs=dimIs+(0.5*dimIs);
         profit=0; //setting initial profit to be zero
        totalProfit=0; //initial profit is zero.
        purchases=0;

        // setting prices buying and selling
        buyingPriceSoft=0;
        buyingPriceOfHard=2.0*buyingPriceSoft;
        quantityPurchased=softWoodPurchased+hardWoodPurchased;
        totalQuantity=quantityPurchased;

        compute();
    }
    void compute(){
        switch (dimension){
            case "A":
            {
                if (type.equals("hardwood")){
                    sales= quantity*dimA;
                    totalQuantity=totalQuantity-quantity;
                }else if (type.equals("softwood")){
                    sales= quantity*dimAs;
                    totalQuantity=totalQuantity-quantity;
            }
            }
            case "B":
            {
                if (type.equals("hardwood")){
                    sales= quantity*dimB;
                    totalQuantity=totalQuantity-quantity;
                }else if (type.equals("softwood")){
                    sales= quantity*dimBs;
                    totalQuantity=totalQuantity-quantity;
                }
            }
            case "C":
            {
                if (type.equals("hardwood")){
                    sales= quantity*dimC;
                    totalQuantity=totalQuantity-quantity;
                }else if (type.equals("softwood")){
                    sales= quantity*dimCs;
                    totalQuantity=totalQuantity-quantity;
                }
            }
            case "D":
            {
                if (type.equals("hardwood")){
                    sales= quantity*dimD;
                    totalQuantity=totalQuantity-quantity;
                }else if (type.equals("softwood")){
                    sales= quantity*dimDs;
                    totalQuantity=totalQuantity-quantity;
                }
            }
            case "E":
            {
                if (type.equals("hardwood")){
                    sales= quantity*dimE;
                    totalQuantity=totalQuantity-quantity;
                }else if (type.equals("softwood")){
                    sales= quantity*dimEs;
                    totalQuantity=totalQuantity-quantity;
                }
            }
            case "F":
            {
                if (type.equals("hardwood")){
                    sales= quantity*dimF;
                    totalQuantity=totalQuantity-quantity;
                }else if (type.equals("softwood")){
                    sales= quantity*dimFs;
                    totalQuantity=totalQuantity-quantity;
                }
            }
            case "G":
            {
                if (type.equals("hardwood")){
                    sales= quantity*dimG;
                    totalQuantity=totalQuantity-quantity;
                }else if (type.equals("softwood")){
                    sales= quantity*dimGs;
                    totalQuantity=totalQuantity-quantity;
                }
            }
            case "H":
            {
                if (type.equals("hardwood")){
                    sales= quantity*dimH;
                    totalQuantity=totalQuantity-quantity;
                }else if (type.equals("softwood")){
                    sales= quantity*dimHs;
                    totalQuantity=totalQuantity-quantity;
                }
            }
            case "I":
            {
                if (type.equals("hardwood")){
                    sales= quantity*dimI;
                    totalQuantity=totalQuantity-quantity;
                }else if (type.equals("softwood")){
                    sales= quantity*dimIs;
                    totalQuantity=totalQuantity-quantity;
                }
            }
            case "J":
            {
                if (type.equals("hardwood")){
                    sales= quantity*dimJ;
                    totalQuantity=totalQuantity-quantity;
                }else if (type.equals("softwood")){
                    sales= quantity*dimJs;
                    totalQuantity=totalQuantity-quantity;
                }
            }

        }
        sales+=sales;
        //calculating the profit made.
        purchases=quantityPurchased*((buyingPriceOfHard*hardWoodPurchased)+(buyingPriceSoft*softWoodPurchased));
        profit=(sales-purchases);

    }
}
