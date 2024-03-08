package week4;

import week3.Car;

public class Patient {
    // Patient Attribute
    String name;
    int age, medicationPrice;
    int doctorFee = 100000;


    // Patient Default Constructor 
    public Patient (){}
    
    // Patient Parametric Constructor
    public Patient ( String n,int a, int mp){
        name = n;
        age = a;
        medicationPrice = mp;
    }

    //Patient Method 
    public double averageMedicationPrice(){
        /*if (age > 50) {
            int[] totalFees = {medicationPrice + doctorFee};
        
            int sum = 0;
            int count = 0;
            for (int fee : totalFees) {
                sum += fee;
                count++;
                
            }
            //Calculate the Average 
            double average = (double) sum / count;
            return average;

        }else{
            return 0;
            }
        }*/

        // Calculation Before the > 50 
        int[] medicationPrice = {5000, 10000, 20000};
        int sum = 0;
        for(int price : medicationPrice){
            sum += price; 
        }
        double average = (double) sum / medicationPrice.length;
        return average;
    }
        

    public double totalFee(){
        return medicationPrice * 17500 + doctorFee; 
    }

    void printData(){
        System.out.println("+ ========================= + ");
        System.out.println("       PATIENT DATA       " );
        System.out.println("+ ========================= + ");
        System.out.println("Name    = " + name );
        System.out.println("Age     = " + age );
        System.out.println("+ ========================= + ");
        System.out.println("       PATIENT BILL       " );
        System.out.println("+ ========================= + ");
        System.out.println("Medication Price                   = " + medicationPrice );
        System.out.println("Average Medication Price           = " + averageMedicationPrice());
        System.out.println("Doctor Fee                         = " + doctorFee );
        System.out.println("Total Fee                          = " + totalFee() );
    
    }
}

