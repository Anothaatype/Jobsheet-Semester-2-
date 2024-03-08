package week3;

public class Car {
    //Atribut of Car class
    String name;
    int cc, harga, tahunProduksi;

    //Constructor of Car class
    public Car (String n, int c, int h, int t){
        name = n;
        cc = c;
        harga = h;
        tahunProduksi = t;
    }

    // Method of Car class

    public double hitungPajak(){
        if( cc > 1500 ){
           return harga * 0.1;
        }
        else{
            return harga * 0.075;
        }
    }

    public double hitungBiayaPerawatan(){
        if (tahunProduksi < 2010) {
            return harga * 0.08;
        }
        else{
            return harga * 0.05;
        }
    }

    public double hitungBiayaTotal(){
        return hitungPajak() + hitungBiayaPerawatan();
    }

    void printData(){
        System.out.println("=======================");
        System.out.println("CAR IDENTITY ");
        System.out.println("=======================");
        System.out.println("Car Name : " + name );
        System.out.println("Car CC : " + cc );
        System.out.println("Car Price : " + harga );
        System.out.println("Car Production Years : " + tahunProduksi );
        System.out.println("====================");
        System.out.println("Car Tax : " + hitungPajak());
        System.out.println("Car Maintenance : " + hitungBiayaPerawatan());
        System.out.println("====================");
        System.out.println("Car Total Calculation : " + hitungBiayaTotal());
        System.out.println("====================");
    }
}
