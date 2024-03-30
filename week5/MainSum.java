package week5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("Program for Calculating Total Profits");
        System.out.print("Input the number of Companies : ");
        int numCompanies=sc.nextInt();
        
        // Creating an Array of Object 
        Sum[] companySums = new Sum[numCompanies];

        // Inputting or Entering the value for the quantity of the company, months and, profit for each months 
        System.out.println("================================================");
        for (int i = 0; i < numCompanies; i++) {
            System.out.println("++                Company "+(i+1)+"                   ++");
            System.out.println("================================================");
            System.out.print("The Quantities Of Month "+(i+1)+" : ");
            int toElement = sc.nextInt();
            companySums[i] = new Sum(toElement);
            System.out.println("The Company "+(i+1)+" Profit is : ");
            for(int j=0; j < toElement; j++){
            System.out.print("Monthly Profit - "+(j+1)+" = ");
            companySums[i].profit[j] = sc.nextDouble();
            System.out.println("================================================");
            }
        }

        // Calculate The Profit For Each Company
        System.out.println("================================================");
        System.out.println("++         Total Profit Every Company         ++");
        System.out.println("================================================");
        for(int i = 0; i < numCompanies; i++){
            System.out.println("Company "+(i+1)+" :");
            System.out.println("Total profit using Brute Force : "+ companySums[i].totalBF(companySums[i].profit));
            System.out.println("Total using Divide Conquer : "+ companySums[i].totalDC(companySums[i].profit, 0, companySums[i].elemen-1));
            System.out.println("================================================");
        }
        

        /* Depends on the jobsheet 
        Scanner sc = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Program for Calculating Total Profits");
        // Inputting the value of months that want to be calculate 
        System.out.print("Input the Number of Months : ");
        int totElemen = sc.nextInt();

        // Creating an array of object that called sm 
        Sum sm = new Sum(totElemen);
        sm.elemen = totElemen;

        // Inputting profit for each months
        System.out.println("==============================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Input the profit of the month to - " + (i+1) + " = ");
            sm.profit[i] = sc.nextDouble();
        }

        // Showing Sum Calculations by Brute Force Method 
        System.out.println("==============================");
        System.out.println("++         RESULTS          ++");
        System.out.println("==============================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total Profits of the company for " + sm.elemen + " month is = " + sm.totalBF(sm.profit));

        // Showing Sum Calculations  by Divide and Conquer Method
        System.out.println("==============================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total Profits of the company for " + sm.elemen + " month is = " + sm.totalDC(sm.profit, 0,sm.elemen-1));
        */

    }
}
