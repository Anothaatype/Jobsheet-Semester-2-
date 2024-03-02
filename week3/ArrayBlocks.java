package week3;

public class ArrayBlocks {
    public static void main(String[] args) {
        
        // instantiate array of blocks in object
        Blocks[] blArray = new Blocks [3];

        // assigning a value in each attribute
        blArray[0] = new Blocks(100, 30, 12);
        blArray[1] = new Blocks(120, 40, 15);
        blArray[2] = new Blocks(210, 50, 25);

        for (int i = 0; i < blArray.length; i++) {
            System.out.println("Volume blocks - " + i + " : " + blArray[i].countVolume());
        }
        
    }
}
