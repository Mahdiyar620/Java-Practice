public class MatrixDiagonals {

    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < 3; i++)
        {
            sum1 = sum1 + a[i][i];
            sum2 = sum2 + a[i][2 - i];
        }

        System.out.println(sum1);
        System.out.println(sum2);
    }
}
