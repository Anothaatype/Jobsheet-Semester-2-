package week3;

import java.util.Scanner;

public class MainCar {
    
    public static void main(String[] args) {

        // Decide the length of an array based on the user input
        System.out.print("Decide the length of Array : ");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            Car cData[] = new Car[i];
        
        // Accessing every Attribute using user input 
        for (int j = 0; j < cData.length; j++) {
            System.out.println("===================");
            System.out.print("Car Name : " );
            String n = sc.next();
            System.out.print("Car CC : ");
            int c = sc.nextInt();
            System.out.print("Car Price : ");
            int h = sc.nextInt();
            System.out.print    ("Car Production Years : ");
            int t = sc.nextInt();
            cData[j] = new Car(n, c, h, t);

        }

        // Print Out Car Data 
        for (int j = 0; j < cData.length; j++) {
            cData[j].printData();
            System.out.println();
        }

        // Car Maintenance Average Calculation
        double totalBiayaPerawatan = 0;
        double totalRataMobil = 0; 
        int jumlahMobil = 0;
        for(Car car : cData ){
            if(car.tahunProduksi > 2010){
                totalBiayaPerawatan += car.hitungBiayaPerawatan();
                jumlahMobil++;
            }
            totalRataMobil = totalBiayaPerawatan / jumlahMobil;
        }

        // Car Maintenance Price Average Output
        System.out.println("=======================");
        System.out.println("Average Maintenance Price Calculation ");
        System.out.println("=======================");
        System.out.println("Total biaya perawatan mobil diatas 2010 : " + totalBiayaPerawatan);
        System.out.println("Total rata-rata biaya perawatan mobil diatas 2010 : " + totalRataMobil);
        System.out.println("Jumlah mobil tahun produksi diatas 2010 : " + jumlahMobil);
        System.out.println("=======================");

        // Car biggest price with cc over 1500 and production year before 2010 calculation 
        double totalBiayaTerbesar = 0;
        Car biggestSpentCar = null;
            for(Car car : cData){ 
                if (car.cc > 1500 && car.tahunProduksi < 2010) {
                    double biayaTotal = car.hitungBiayaTotal();
                    if (biayaTotal > totalBiayaTerbesar) {
                        totalBiayaTerbesar = biayaTotal;
                        biggestSpentCar = car;
                    }
                }
            }

    }
}
