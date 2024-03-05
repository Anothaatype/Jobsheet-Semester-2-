package week3;
public class Sphere {

    // Attribute of Sphere 
    int r;

    //Parametric Constructor of Sphere
    public Sphere(int j){
        r = j;
    }

    //Default Constructor of Sphere 
    public Sphere(){}

    // Method of Sphere 
    double calcVol(){
        double vol = 0;
        vol = (4.0/3.0)*Math.PI*r*r*r;
        return vol;
    }
    double calcSurface(){
        double sur = 0;
        sur = 4*Math.PI*r*r;
        return sur;
    }
}
