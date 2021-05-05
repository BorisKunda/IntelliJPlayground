package dfsalgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Magic {

    //loop [] integer --> int[]

    private static Integer[] magic(int[][] arr) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    int currLemonSize = lemonSize(i, j, arr);
                    res.add(currLemonSize);
                }
            }
        }
        Collections.sort(res);
        return res.toArray(new Integer[0]);
    }

    private static int lemonSize(int i, int j, int[][] arr) {
        if (i >= 0 && i < arr.length && j >= 0 && j < arr[0].length) {
            if (arr[i][j] == 1) {
                arr[i][j] = 0;
                return 1 + lemonSize(i + 1, j, arr) +
                        lemonSize(i - 1, j, arr) +
                        lemonSize(i, j + 1, arr) +
                        lemonSize(i, j - 1, arr);

            }

        }
        return 0;
    }


    public static void main(String[] args) {

        int[][] matrix1 = {
                {1, 0, 0, 1},
                {0, 0, 1, 0},
                {1, 0, 1, 0},
                {1, 0, 1, 0}
        };

        int[][] matrix2 = {
                {0, 0, 0, 1, 0, 0, 0, 1},
                {1, 1, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1, 1, 0, 1},
                {1, 1, 1, 0, 0, 0, 0, 0}
        };

        int[][] matrix3 = {
                {0, 0, 0, 0, 1},
                {0, 1, 1, 1, 0},
                {0, 1, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0}
        };

        System.out.println("Matrix1" + Arrays.toString(magic(matrix1)));

        System.out.println("Matrix2" + Arrays.toString(magic(matrix2)));

        System.out.println("Matrix3" + Arrays.toString(magic(matrix3)));

    }

}


