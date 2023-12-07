import java.util.Scanner;

public class bai2 {
//    cau 1
    public static void main(String[] args) {
        char c = 'o';
        int B = 0;
        String A ;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi của bạn vào đây : ");
        A = sc.nextLine();
        System.out.println("Độ dài của chuỗi là: "+ A.length());

//        cau 2

        for (int i = 0;i<A.length();i++){
           if(A.charAt(i)== c){
                B++;
            }
        }
        System.out.println("Số lần xuất hiện của o trong chuỗi là : "+B);
    }

}
