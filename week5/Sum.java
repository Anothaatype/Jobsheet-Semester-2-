package week5;

public class Sum {

    // Sum Attribute
    public int elemen;
    public double profit[], total;

    // Sum Constructor 
    public Sum (int el) {
        elemen = el;
        profit = new double [elemen];
        total = 0;
    }

    // Sum Method BF
    double totalBF(double arr[]){
        for (int i = 0; i < elemen; i++) {
            total = total + arr[i];
        }
        return total;
    }

    // Sum Method DC
    double totalDC(double arr[], int l, int r){
        if (l==r) {
            return arr[l];
        }else if (l<r){
            int mid = (l+r)/2;
            double lsum = totalDC(arr, l,mid-1);
            double rsum = totalDC(arr,mid+1, r);
            return lsum + rsum + arr[mid];
        }
        return 0;
    }
}
