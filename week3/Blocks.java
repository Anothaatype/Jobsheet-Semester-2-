package week3;
public class Blocks {
    public int width,length, height;

    // class attribute of blocks using parametric constructor
    public Blocks (int p, int l, int t ){
        length = p;
        width = l;
        height = t;
    }

    // method of blocks
    public int countVolume(){
        return length*width*height;
    }

}


