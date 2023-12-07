import java.util.Scanner;

public class bai5 {
//    ý 1-2
    public static void main(String[] args) {
        int soDong,soCot;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng : ");
        soDong = sc.nextInt();
        System.out.println("Nhập số cột : ");
        soCot = sc.nextInt();
        int[][] A = new int[soDong][soCot];
        for (int i = 0; i<soDong;i++){
            for (int j = 0 ; j<soCot;j++){
                System.out.println("nhập phân tử ");
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Mảng của bạn vừa nhập là : ");
        for (int i= 0;i<soDong;i++){
            for (int j =0;j<soCot;j++){
                System.out.print(A[i][j]+"\t");
            }
            System.out.println("\n");
        }
//        ý 3
        for (int i=0;i<soDong;i++){
            for (int j=0;j<soCot;j++){
                if(i==j){
                    System.out.println("số nằm trên trục chính là" + A[i][j]);
                }
            }
        }
    }

}
