package uas;

// Kelas untuk merepresentasikan transaksi rental
public class TransaksiRental {
     static int kodeCounter = 1; // Counter untuk kode transaksi
     int kodeTransaksi; // Kode transaksi
     String namaPeminjam; // Nama peminjam
     int lamaPinjam; // Lama pinjam dalam jam
     double totalBiaya; // Total biaya
     BarangRental br; // Barang rental yang dipinjam

    // Konstruktor ber parameter buat objek dari transaksiRental
    public TransaksiRental(String namaPeminjam, int lamaPinjam, BarangRental br) {
        this.kodeTransaksi = kodeCounter++;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.br = br;
        this.totalBiaya = calculateTotalBiaya();
    }

    // Method buat hitung total biaya
     double calculateTotalBiaya() {
        double biaya = br.getBiayaSewa() * lamaPinjam;

        if (isMember(namaPeminjam)) {
            biaya -= 25000;
        }

        if (lamaPinjam >= 48 && lamaPinjam <= 78) {
            biaya *= 0.9;
        } else if (lamaPinjam > 78) {
            biaya *= 0.8;
        }

        return biaya;
    }

    // Method buat mengecek apakah peminjam adalah member
     boolean isMember(String namaPeminjam) {
        return namaPeminjam.endsWith("i");
    }

    // Method buat ambil  kode transaksi
    public int getKodeTransaksi() {
        return kodeTransaksi;
    }

    // Method buat ambil nama peminjam rental mobil
    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    // Method buat ambil lama pinjam
    public int getLamaPinjam() {
        return lamaPinjam;
    }

    // Method buat ambil total biaya
    public double getTotalBiaya() {
        return totalBiaya;
    }

    // Method buat ambil barang rental
    public BarangRental getBarangRental() {
        return br;
    }

    // Method toString untuk representasi string dari objek TransaksiRental
    public String toString() {
        return kodeTransaksi + "\t" + br.getNoTNKB() + "\t" + br.getNamaKendaraan() + "\t" + namaPeminjam + "\t" + lamaPinjam + "\t" + totalBiaya;
    }

    
}

    
