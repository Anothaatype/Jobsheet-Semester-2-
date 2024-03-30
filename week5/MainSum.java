package week5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
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


    }
}
