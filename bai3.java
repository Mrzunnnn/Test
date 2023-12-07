import java.util.Scanner;

public class bai3 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//
//        System.out.print("Nhập vào số nguyên n = ");
//        int n=sc.nextInt();
//
//        if(isPrimeNumber(n)){
//            System.out.println(n+" là số nguyên tố!");
//        } else {
//            System.out.println(n+" không là số nguyên tố!");
//        }
//
//        sc.close();
//    }

    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            int randomNumber = (int) randomDouble;
            System.out.println(randomNumber);
            System.out.println(isPrimeNumber(i));
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
