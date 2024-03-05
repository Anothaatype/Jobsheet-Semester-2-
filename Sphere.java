public class Sphere {

    // Attribute of Sphere 
    int r;

    //Constructor of Sphere
    public Sphere(int j){
        r = j;
    }

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
