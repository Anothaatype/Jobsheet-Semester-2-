package week4;

import java.util.Scanner;

import week3.Car;

public class MainPatient {
    public static void main(String[] args) {
        
        // Create an Patient Object of Array 
        Scanner sc = new Scanner(System.in);
        System.out.print("Input How Many Patient : " );
        int i = sc.nextInt();
        Patient[] p = new Patient[i];

        // Input Patient Data 
        for (int j = 0; j < p.length; j++) {
            System.out.println("+ ========================= + ");
            System.out.println("     INPUT DATA PATIENT     ");
            System.out.println("+ ========================= + ");
            System.out.print("Patient Name  = " );
            String n = sc.next();
            System.out.print("Patient Age   = ");
            int a = sc.nextInt();
            System.out.print("Patient Pills Need  = ");
            int mp = sc.nextInt();
            p[j] = new Patient(n, a, mp);
            for(Patient pat : p);
        }

        // Print All the Patient Data 
        for (int j = 0; j < p.length; j++) {
            p[j].printData();
        }
        
        
        }
    }

