import java.awt.desktop.SystemSleepEvent;

public class bai4 {
    public static void main(String[] args) {
        int n =10;
        int i=2;
        int s=0;
        while (s<n){
            if(isPrimeNumber(i)) {
                if (i<=10) {
                    System.out.println(i);
                    s++;
                }
            }
            i++;
        }
    }
    public static boolean  isPrimeNumber(int n){
        if (n<2){
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2;i<=squareRoot;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}
