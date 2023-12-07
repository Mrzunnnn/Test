public class bai12 {

    public static void main(String[] args) {
        int soDong = 4;
        int soCot = 4;
        char[][] A = new char[soDong][soCot];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                if (j <= i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
