package quizweek12;

public class Main {
    
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();

            // Adding elements to the front of the list 
                dll.addFirst(45);
                dll.addFirst(10);
                dll.addFirst(10);
                dll.addFirst(15);
                dll.addFirst(150);

        // Printing the list after adding elements
        System.out.println("=========+ DATA ELEMENTS +======== ");
        dll.print();
        System.out.println("=================================== ");
        System.out.println("");

        // First Part
        // Deleting the first element in the list
        dll.deleteFirst();
        // Printing the list after deleting the first element
        dll.print();

        // Second Part
        // Adding elements to the end of the list
        dll.addLast(15);
        dll.addLast(30);
        // Printing the list after adding elements to the end
        dll.print();
    
        // Third Part
        // Deleting the last element in the list
        dll.deleteLast();
        // Printing the list after deleting the last element
        dll.print();
        
        // Fourth Part
        // Printing the list from tail to head
        dll.printFromTail();

        System.out.println(""); 

        // Getting the position of the first occurrence of 10 from the tail
        System.out.println("========= DATA POSITIONS ========== ");
        System.out.println("Position of 10 from tail: " + dll.getPositionFromTail(10));
    
        // Getting the position of the last occurrence of 10 from the tail
        System.out.println("Last position of 10 from tail: " + dll.getLastPositionFromTail(10));
    
        // Calculating and printing the average of the elements in the list
        System.out.println("Average: " + dll.getAverage());
    
        // Calculating and printing the median of the elements in the list
        System.out.println("Median: " + dll.getMedian());
        System.out.println("=================================== ");
    }
}
    

