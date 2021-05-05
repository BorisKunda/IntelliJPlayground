package regularj;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int arr1D[] = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};


        int[][] matrixArr2d = {
                {1, 1},
                {0, 0},
        };


        print2D(matrixArr2d);

        System.out.println("---");

        System.out.println("count: " + getCountOccurrences2D(1, matrixArr2d));

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
        for (int i = 0; i < n; i++)
            if (x == arr[i])
                res++;
        return res;
    }

}




