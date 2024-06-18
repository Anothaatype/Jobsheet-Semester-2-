package uas;

// Kelas Node yang digunakan dalam DoubleLinkedList
public class Node<T> {
    T data; // Data yang disimpan di node
    Node<T> next; // Node setelahnya
    Node<T> prev; // Node sebelumnya

    // Konstruktor untuk menginisialisasi node
    Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

    

