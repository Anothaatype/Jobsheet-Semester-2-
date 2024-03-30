package week5;

import java.util.Scanner;

public class MainFaktorial {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("===================================");
    System.out.print("Input the number of elements you want to count : ");
    int elements = sc.nextInt();

    Faktorial [] fk = new Faktorial[elements];
    for (int i = 0; i < elements; i++) {
        fk[i] = new Faktorial();
        System.out.print("Input the data value to-" +(i+1) +" : ");
        fk[i].num = sc.nextInt();
    }

    // faktorialBF 
    System.out.println("===================================");
    System.out.println("Factorial Results with Brute Force");
    for (int i = 0; i < elements; i++) {
        long faktorialBFStart = System.nanoTime();
        System.out.println("Faktorial of value " + fk[i].num + " is " + fk[i].faktorialBF(fk[i].num));
        long faktorialBFEnd = System.nanoTime();
        System.out.printf("Time in nanosecond: %,d\n",faktorialBFEnd - faktorialBFStart);
    }

    System.out.println("===================================");
    System.out.println("Factorial Results with Divide and Conquer");
    for (int i = 0; i < elements; i++) {
        long faktorialDCStart = System.nanoTime();
        System.out.println("Faktorial of value " + fk[i].num + " is " + fk[i].faktorialDC(fk[i].num));
        long faktorialDCEnd = System.nanoTime();
        System.out.printf("Time in nanosecond: %,d\n",faktorialDCEnd - faktorialDCStart);
    }
    System.out.println("===================================");
}
}
