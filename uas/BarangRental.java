package uas;

//Attribute Barang Rental 
public class BarangRental {
         String noTNKB;
         String namaKendaraan;
         String jenisKendaraan;
         int tahun;
         int biayaSewa;
    
        // Konstruktor ber-parameter
        public BarangRental(String noTNKB, String namaKendaraan, String jenisKendaraan, int tahun, int biayaSewa) {
            this.noTNKB = noTNKB;
            this.namaKendaraan = namaKendaraan;
            this.jenisKendaraan = jenisKendaraan;
            this.tahun = tahun;
            this.biayaSewa = biayaSewa;
        }
        
        // Method untuk mengambil Nomor TNKB
        public String getNoTNKB() {
            return noTNKB;
        }
        
        //Method untuk mengambil Nama Kendaraan
        public String getNamaKendaraan() {
            return namaKendaraan;
        }
        
        // Method untuk mengambil Jenis Kendaraan 
        public String getJenisKendaraan() {
            return jenisKendaraan;
        }
        
        // Method untuk mengambil Tahun
        public int getTahun() {
            return tahun;
        }
        
        // Method untuk mengambil BiayaSewa
        public int getBiayaSewa() {
            return biayaSewa;
        }
    
        //Method toString untuk mempresentasikan barang rental nya
        public String toString() {
            return noTNKB + "\t" + namaKendaraan + "\t" + jenisKendaraan + "\t" + tahun + "\t" + biayaSewa;
        }
    }
