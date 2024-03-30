package week5;

public class Faktorial {
    public int num;

    // Faktorial Method Using Looping
    public int faktorialBF (int n){
        int faktorial = 1;
        for(int i =1; i<= n; i++){
            faktorial = faktorial * i;
        }
        return faktorial;
    }

    public int faktorialDC(int n){
        if (n==1) {
            return 1;
        }
        else {
            int faktorial = n * faktorialDC(n - 1);
            return faktorial;
        }
    }
}
