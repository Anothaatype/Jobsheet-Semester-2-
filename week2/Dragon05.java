package week2;


public class Dragon05 {
    int width, height, x, y; 

    public Dragon05(int w, int h){
        width = w;
        height = h; 
        x = w/2;
        y = h/2;
    }

    void printPosition(){
        System.out.printf("(%d, %d)", x, y );
        System.out.println();
    }

    void moveLeft(){
        if (x>0) {
            x--;
            printPosition();
            detectCollision();
        }
    }
    
    void moveRight(){
        if (x<width){
            x++;
            printPosition();
            detectCollision();
        }
    }

    void moveUp(){
        if (y>0) {
            y++;
            printPosition();
            detectCollision();
        }
    }

    void moveDown(){
        if(y<height)
            y++;
            printPosition();
            detectCollision();
    }

    void detectCollision(){
        if (x<=0 || y<=0 || x>=width || y>=height) {
            System.out.println("Out of Bounds Mates !");
        }
    }

    public static void main(String[] args) {
        Dragon05 Roar = new Dragon05(50,100);
        Roar.printPosition();
        Roar.moveLeft();
        Roar.moveDown();
        Roar.moveUp();
        Roar.moveRight();

        for (int i = 0; i < 50; i++) {
            Roar.moveDown();
        }

    }
}
