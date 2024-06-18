package uas;
import java.util.Comparator;

// Class Double Link List
public class DoubleLinkedList<T> {
    private Node<T> head; // Node head
    private Node<T> tail; // Node tail

    // Konstruktor tidak berparameter untuk menginisiasi double link list nya
    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Method untuk menambahkan elemen ke linked list
    public void add(T data) {
        Node<T> newNode = new Node<>(data); // Membuat node baru
        if (head == null) {
            head = tail = newNode; // kalau linked list nya kosong, head sama tail jadi node baru
        } else {
            tail.next = newNode; // Nambahin node baru di akhir
            newNode.prev = tail; // Mengatur node sebelumnya dari node baru
            tail = newNode; // Mengatur node baru sebagai tail
        }
    }

    // Method untuk menampilkan semua elemen dalam linked list
    public void display() {
        Node<T> current = head; // Memulai dari head
        while (current != null) {
            System.out.println(current.data); // Menampilkan data
            current = current.next; // Berpindah ke node berikutnya
        }
    }

    // Method untuk mendapatkan node head
    public Node<T> getHead() {
        return head;
    }

    // Method untuk mengurutkan elemen dalam linked list
    public void sort(Comparator<T> comparator) {
        if (head == null) return; // Jika linked list kosong, keluar dari metode

        // pake bubble sort buat ngurutin elemennya
        boolean swapped;
        do {
            swapped = false;
            Node<T> current = head;
            while (current.next != null) {
                if (comparator.compare(current.data, current.next.data) > 0) {
                    T temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
}

// Pakai comparator supaya bisa ngubah kriteria pengurutannya tanpa perlu ngubah pengimplementasian dari elemen itu sndiri 
// Adanya <T> supaya untuk bisa buat kelas yang bekerja dengan berbagai jenis data tanpa perlu menuliskan tipe data yang spesifik 
