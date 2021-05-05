package regularj;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /**--Data--*/

        int[] arr1D = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};


        int[][] binaryMatrixS = {
                {1, 1},
                {0, 0},
        };

        int[][] binaryMatrixM = {
                {1, 1, 1, 0},
                {1, 0, 1, 1},
                {1, 0, 0, 1},
                {1, 0, 0, 1}
        };

        int[][] binaryMatrixL = new int[][]{

                {1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1},
                {1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1},
                {1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1},
                {1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1},
                {1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1},
        };

        /**--Methods--*/

        print(findNumberConnected(0, 0, binaryMatrixS)+"");

    }

    public static void print(String s) {
        System.out.println(s);
    }

    public static int getCountOccurrences2D(int specialVal, int[][] matrix) {

        int rows, columns, outerIndex, innerIndex, count = 0;

        rows = matrix.length;
        columns = matrix[0].length;

        for (outerIndex = 0; outerIndex < rows; outerIndex++) {
            for (innerIndex = 0; innerIndex < columns; innerIndex++) {

                if (matrix[outerIndex][innerIndex] == specialVal) {
                    count++;
                }

            }
        }

        return count;

    }

    public static void print2D(int matrix[][]) {
        for (int[] row : matrix)
            System.out.println(Arrays.toString(row));
    }

    static int countOccurrences1D(int arr[]) {

        int n = arr.length;
        int x = 2;

        int res = 0;
        for (int j : arr)
            if (x == j)
                res++;
        return res;
    }

    public static int findNumberConnected(int a, int b, int[][] z) {
        boolean canUp = (a - 1 >= 0);
        boolean canDown = (a + 1 < z.length);
        boolean canRight = (b + 1 < z[0].length);
        boolean canLeft = (b - 1 >= 0);

        int value = z[a][b];

        int up = 0;
        int down = 0;
        int right = 0;
        int left = 0;

        z[a][b] = 2;

        if (canUp && z[a - 1][b] == value) {
            up = findNumberConnected(a - 1, b, z);
        }
        if (canDown && z[a + 1][b] == value) {
            down = findNumberConnected(a + 1, b, z);
        }
        if (canLeft && z[a][b - 1] == value) {
            left = findNumberConnected(a, b - 1, z);
        }
        if (canRight && z[a][b + 1] == value) {
            right = findNumberConnected(a, b + 1, z);
        }

        return up + left + right + down + 1;
    }

}




