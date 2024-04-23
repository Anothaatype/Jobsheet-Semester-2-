package week6;

public class Student {

    // Student Attributes
    String name;
    int entryYear, age;
    double gpa;

    // Parametric Constructor
    Student(String n, int ey, int a, double g){
        name = n;
        entryYear = ey;
        age = a;
        gpa = g;
    }

    // Print Method 
    void print() { 
        System.out.println("Name : " + name );
        System.out.println("Entry Year : " + entryYear );
        System.out.println("Age : " + age );
        System.out.println("GPA : " + gpa );
    }
    
}
