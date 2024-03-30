package week5;

import java.util.Scanner;

public class MainSquared {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("==============================");
    System.out.print("Input the number of elements you want to count : ");
    int element = sc.nextInt();

    Squared [] png = new Squared[element];

    for (int i = 0; i < element; i++){
        System.out.print("Input the value to be squared to-"+(i+1)+" : ");
        int num = sc.nextInt();
        System.out.print("Input the square value to-"+(i+1)+" : ");
        int squared = sc.nextInt();
        png[i] = new Squared(num, squared);
    }

    // Selections for choosing which method that want to be use 
    System.out.println("==============================");
    System.out.println("Select the method to use : ");
    System.out.println("==============================");
    System.out.println("1. Brute Force Squared");
    System.out.println("2. Divide and Conquer Squared");
    System.out.print("Enter your choice : ");
    int choice = sc.nextInt();

    // Selections Output 
    switch (choice) {
        case 1:
        System.out.println("==============================");
        System.out.println("++          RESULT          ++");   
        System.out.println("==============================");
        System.out.println("Results with Brute Force squared");
        for (int i = 0; i < element; i++) {
        System.out.println("Value "+png[i].num+" squared "+png[i].squared+"is : "+png[i].squaredBF(png[i].num, png[i].squared));
        }    
            break;
        case 2:
        System.out.println("==============================");
        System.out.println("++          RESULT          ++");   
        System.out.println("==============================");
        System.out.println("Results with Divide and Conquer squared");
        for (int i = 0; i < element; i++) {
        System.out.println("Value "+png[i].num+" squared "+png[i].squared+"  : "+png[i].squaredDC(png[i].num, png[i].squared));
        }
            break;
    
        default:
        System.out.println("Invalid choice");
    }
    /* Inputing the value of number and squared value 
    for (int i = 0; i < element; i++) {
        png[i] = new Squared();
        System.out.print("Input the value to be squared to-" + (i+1) + " : " );
        png[i].num = sc.nextInt();
        System.out.print("Input the squared value to-" + (i+1) + " : " );
        png[i].squared = sc.nextInt();
        System.out.println("==============================");
    }*/

    // Result of the Calculations 
    /*System.out.println("++          RESULT          ++");
    System.out.println("4==============================");
    System.out.println("Results with Brute Force Squared");
    for (int i = 0; i < element; i++) {
        System.out.println("Value : " + png[i].num + " squared "+png[i].squared + " is : " + png[i].squaredBF(png[i].num,png[i].squared));
    }
    System.out.println("==============================");
    System.out.println("Results with Divide and Conquer Squared");
    for (int i = 0; i < element; i++) {
        System.out.println("Value : " + png[i].num + " squared "+png[i].squared + " : " + png[i].squaredBF(png[i].num,png[i].squared));
    }*/

    }
}
