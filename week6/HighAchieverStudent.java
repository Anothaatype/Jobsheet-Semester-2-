package week6;

public class HighAchieverStudent {
    
    // Creating Object of Array about Student List 
        Student list[] = new Student[5];
        int idx;
    

    // Adding an Object from Student class Method 
    void add(Student std){
        if (idx < list.length) {
            list[idx] = std;
            idx++;
        }
        else {
            System.out.println("The student list is already full-filled");
        }
    }

    // Print Method
    void print (){
        for (Student s : list) {
            s.print();
            System.out.println("=============================");
        }
    }

    // Bubble Sort Method 
    void bubbleSort (){
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1; j++) {
                if ( list[j].gpa > list[j-1].gpa) {
                    //Swap
                    Student tmp = list[j-1];
                    list [j] = list [j-1];
                    list [j-1] = tmp;
                }
            }
        }
    }

    //Selection Sort Method
    void selectionSort() {
        for (int i = 0; i < list.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < list.length; j++) {
                if (list[j].gpa < list[idxMin].gpa) {
                    idxMin = j;
                }
            }
            Student tmp = list[idxMin];
            list[idxMin] = list[i];
            list[i] = tmp;
        }
    }

    // Insertion Sort Methdod 
    void insertionSort(boolean asc) {
        for (int i = 0; i < list.length-1; i++) {
            Student temp = list[i];
            int j = i;
            if(asc) {
                while (j > 0 && list[j-1].gpa > temp.gpa) {
                    list[j] = list[j-1];
                    j--;
                }
            } else {
                while (j > 0 && list[j-1].gpa < temp.gpa) {
                    list[j] = list[j-1];
                    j--;
                }
            }
            list[j] = temp;
        }
    }

    
}
