package dfsalgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Magic {

    //loop [] integer --> int[]

    static Integer[] magic(int[][] arr) {
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

    static int lemonSize(int i, int j, int[][] arr) {
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


    static void printResult(Integer[] result) {
        for (Integer r : result) {
            System.out.println(r);
        }
    }

    public static void main(String[] args) {

        int[][] mat1 = {
                {1, 0, 0, 1},
                {0, 0, 1, 0},
                {1, 0, 1, 0},
                {1, 0, 1, 0}
        };
        Integer[] result = magic(mat1);
        System.out.println("Matrix1");
        printResult(result);

        int[][] mat2 = {
                {0, 0, 0, 1, 0, 0, 0, 1},
                {1, 1, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1, 1, 0, 1},
                {1, 1, 1, 0, 0, 0, 0, 0}
        };
        result = magic(mat2);
        System.out.println("Matrix2");
        printResult(result);

        int[][] mat3 = {
                {0, 0, 0, 0, 1},
                {0, 1, 1, 1, 0},
                {0, 1, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0}
        };

        result = magic(mat3);
        System.out.println("Matrix3");
        printResult(result);
    }

}


