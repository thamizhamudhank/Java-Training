package New_8;

public class Secondary {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3,}, {1, 2, 3,}, {1, 2, 3}};
        for (int row = 0; row <a.length; row++) {
            for (int col = 0; col <a.length; col++) {
                if (row+col==2) {
                    System.out.println(a[row][col]);
                }
            }
        }
    }
}
 