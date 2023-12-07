public class bai1 {
    public static void main(String[] args) {
        int soDong = 4;
        int soCot =4;
        char[][] A = new char[soDong][soCot];
        for (int i = 0; i<soDong;i++){
            for (int j = 0; j<soCot;j++){
                A[i][j]='*';
            }
        }
        System.out.println("mảng của bạn là:");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }



}
