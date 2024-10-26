public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //0,0,0,0,0
        int rows = 3;
        int cols = 4;
        int[][] res = new int[3][4];
        int val = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[i][j] = val++;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(res.length); //The number of rows
        System.out.println(res[0].length);//Number of columns

    }
}
