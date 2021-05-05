package regularj;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int rows, columns, outerIndex, innerIndex, count = 0, specialValue;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        columns = scanner.nextInt();

        int matrix[][] = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");

        for (outerIndex = 0; outerIndex < rows; outerIndex++) {
            for (innerIndex = 0; innerIndex < columns; innerIndex++) {
                matrix[outerIndex][innerIndex] = scanner.nextInt();
            }
        }

        print2D(matrix);

        System.out.println("Enter the value for number x:");
        specialValue = scanner.nextInt();

        for (outerIndex = 0; outerIndex < rows; outerIndex++) {
            if (outerIndex == specialValue)
                count++;
        }

        for (innerIndex = 0; innerIndex < columns; innerIndex++) {
            if (innerIndex == specialValue)
                count++;
        }

        System.out.println("Number x appears " + count + " times.");

        /**-OLD----------------------------------------------------------------------------------------------*/
        /**-OLD----------------------------------------------------------------------------------------------*/
        /**-OLD----------------------------------------------------------------------------------------------*/
        /**-OLD----------------------------------------------------------------------------------------------*/

        //Count occurrences of specific number scanner an array (1D)
        int arr1D[] = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int n = arr1D.length;
        int x = 2;
        System.out.println(countOccurrences1D(arr1D, n, x));

    }

    public static void print2D(int mat[][]) {
        // Loop through all rows
        for (int[] row : mat)

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }

    static int countOccurrences1D(int arr[], int n, int x) {
        int res = 0;
        for (int i = 0; i < n; i++)
            if (x == arr[i])
                res++;
        return res;
    }

}




