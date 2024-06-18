package uas;
import java.util.Scanner;

// Kelas sistem rental
public class MainSistemRental {
    static DoubleLinkedList<BarangRental> barangRentals = new DoubleLinkedList<>();
    static DoubleLinkedList<TransaksiRental> transaksiRentals = new DoubleLinkedList<>();

    // Main Program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeBarangRentals();

        // Looping while buat nampilin menu 
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan Transaksi urut no TNKB");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayBarangRentals();
                    break;
                case 2:
                    processPeminjaman(scanner);
                    break;
                case 3:
                    displayTransaksiRentals();
                    break;
                case 4:
                    sortTransaksiByTNKB();
                    break;
                case 5:
                    calculateTotalIncome();
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    // Method untuk menginisialisasi daftar barang rental
    static void initializeBarangRentals() {
        barangRentals.add(new BarangRental("S 4567 YV", "Honda Beat", "Motor", 2017, 25000));
        barangRentals.add(new BarangRental("V 4511 VS", "Honda Vario", "Motor", 2018, 25000));
        barangRentals.add(new BarangRental("N 1453 AA", "Toyota Yaris", "Mobil", 2022, 40000));
        barangRentals.add(new BarangRental("AB 4321 XA", "Toyota Innova", "Mobil", 2019, 40000));
        barangRentals.add(new BarangRental("L 1234 AG", "Toyota Avanza", "Mobil", 2021, 40000));
    }

    // Method untuk menampilkan daftar barang rental
    static void displayBarangRentals() {
        System.out.println("++====================================================++");
        System.out.println("         Daftar Kendaraan Rental Serba Serbi            ");
        System.out.println("========================================================");
        System.out.println("No TNKB\tNama Kendaraan\tJenis\tTahun\tBiaya Sewa Perjam");
        System.out.println("++====================================================++");
        barangRentals.display();
        System.out.println("++====================================================++");
    }

    // Method untuk memproses peminjaman
    static void processPeminjaman(Scanner scanner) {
        scanner.nextLine(); // kasih baris baru 
        System.out.println("++====================================================++");
        System.out.print("Masukkan Nama Peminjam: ");
        String namaPeminjam = scanner.nextLine();
        System.out.print("Masukkan Nomor TNKB: ");
        String noTNKB = scanner.nextLine();
        System.out.print("Masukkan Lama Pinjam (jam): ");
        int lamaPinjam = scanner.nextInt();

        BarangRental br = findBarangRentalByTNKB(noTNKB);
        if (br != null) {
            TransaksiRental tr = new TransaksiRental(namaPeminjam, lamaPinjam, br);
            transaksiRentals.add(tr);
            System.out.println("Transaksi berhasil ditambahkan!");
        } else {
            System.out.println("Barang dengan nomor TNKB tersebut tidak ditemukan!");
        }
        System.out.println("++====================================================++");
    }

    // Method untuk mencari barang rental berdasarkan nomor TNKB
    static BarangRental findBarangRentalByTNKB(String noTNKB) {
        Node<BarangRental> current = barangRentals.getHead();
        while (current != null) {
            if (current.data.getNoTNKB().equals(noTNKB)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    // Method pemanggilan untuk menampilkan daftar transaksi rental dan total 
    static void displayTransaksiRentals() {
        System.out.println("++====================================================++");
        System.out.println("      Daftar Transaksi Peminjaman Rental Serba Serbi    ");
        System.out.println("========================================================");
        System.out.println("Kode\tNo TNKB\tNama Barang\tNama Peminjam\tLama Pinjam\tTotal Biaya");
        System.out.println("++====================================================++");
        transaksiRentals.display();
        System.out.println("++====================================================++");
        

    }   

    // Method buat menampilkan total income 
    static void calculateTotalIncome() {
        double totalIncome = 0;
        Node<TransaksiRental> current = transaksiRentals.getHead();
        while (current != null) {
            totalIncome += current.data.getTotalBiaya();
            current = current.next;
        }
        System.out.println("========================================================");
        System.out.println("          Total Pendapatan Rental Serba Serbi          ");
        System.out.println("========================================================");
        System.out.println("Total pendapatan dari semua transaksi: " + totalIncome);
    }


    // Method untuk mengurutkan transaksi berdasarkan nomor TNKB
    static void sortTransaksiByTNKB() {
        transaksiRentals.sort((tr1, tr2) -> tr1.getBarangRental().getNoTNKB().compareTo(tr2.getBarangRental().getNoTNKB()));
        displayTransaksiRentals();
    }
}

