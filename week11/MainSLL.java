package week11;

public class MainSLL {
        public static void main(String[] args) {
            SingleLinkList singLL = new SingleLinkList();
        
            singLL.addFirst("a");
            singLL.addLast("e");
            singLL.insertAt(1, "b");
            singLL.insertAfter("b", "c");
            singLL.insertAfter("c", "d");
            singLL.print();
        }
    }

