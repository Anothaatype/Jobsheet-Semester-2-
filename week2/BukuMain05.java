package week2;

public class BukuMain05 {
    
    public static void main(String[] args) {
        
        Buku05 bk1 = new Buku05();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000; 

        System.out.println("==========================");
        bk1.tampilInformasi();
        System.out.println("==========================");
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        System.out.println("==========================");
        Buku05 bk2 = new Buku05("Self Reward", "Maheera Ayesha", 160, 29,59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        System.out.println("==========================");
        Buku05 bukuSeno = new Buku05("Self Reward", "Baskoro Seno Aji", 300, 29,600000);
        bukuSeno.terjual(5);
        bukuSeno.tampilInformasi();

    }
}
