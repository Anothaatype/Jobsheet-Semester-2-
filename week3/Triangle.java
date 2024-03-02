package week3;

public class Triangle {
    public int base;
    public int height;
    public double hypotenuse; 

    // attribute of an triangle
    public Triangle ( int a, int t){
        base = a;
        height = t;
    }

    // method of an triangle 
    public double countArea(){
        return ( 0.5 * (base * height));
    }

    // math sqrt using for root, math pow using for kuadrat 
    public double countPerimeter(){
        return ( base +(1/2 * base + ( hypotenuse = 2*(Math.sqrt(Math.pow(base,2) + Math.pow(height, 2))))));
    }


}
