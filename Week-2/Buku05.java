public class Buku05 {

    String judul, Pengarang; 
    int halaman, stok, harga; 

    void tampilInformasi (){
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah Halaman : " + stok);
        System.out.println("Harga : Rp " + harga);
    }

    void terjual(int jml) {
        if(stok>0){
        stok -= jml;
        }

        else{}
    }
    
    void restock(int jml){
        stok += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;
    }
}