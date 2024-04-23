package week6;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        HighAchieverStudent data = new HighAchieverStudent();
        int n = 5;

        //Heading of Program 
        System.out.println("==============================");
        System.out.println("++  INPUT THE STUDENT DATA  ++");
        System.out.println("==============================");

        // Inserting Attributes 
        for (int i = 0; i < n; i++) {
            System.out.print("Name : ");
            String name = s2.nextLine();
            System.out.print("Entry Year : ");
            int entryYear = s1.nextInt();
            System.out.print("Age : ");
            int age = s1.nextInt();
            System.out.print("GPA : ");
            double GPA = s1.nextDouble();
            System.out.println("==============================");
            Student s = new Student(name, entryYear, age, GPA);
            data.add(s);
        }

        // Print Data 
        System.out.println("");
        System.out.println("==============================");
        System.out.println("++    UNSORTED DATA LIST    ++");
        System.out.println("==============================");
        data.print();

        System.out.println("");
        System.out.println("==============================");
        System.out.println("++    BUBBLE SORT LISTED    ++");
        System.out.println("==============================");
        data.print();

        // Using BubbleSort 
        System.out.println("Student Data After Sort by GPA : ");
        data.bubbleSort();
        data.print();

        System.out.println("");
        System.out.println("==============================");
        System.out.println("++  SELECTIONS SORT LISTED  ++");
        System.out.println("==============================");
        data.print();

        System.out.println("Ascending Sorted Student list");
        data.selectionSort();
        data.print();

        System.out.println("");
        System.out.println("==============================");
        System.out.println("++  INSERTION SORT LISTED   ++");
        System.out.println("==============================");
        data.print();

        System.out.println("Ascending Sorted Student List");
        data.insertionSort(false);
        data.print();

        s1.close();
        s2.close();
    }
}
