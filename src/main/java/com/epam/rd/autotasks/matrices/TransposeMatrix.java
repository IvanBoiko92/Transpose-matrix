package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int[][] A = matrix;

        int r = 0;
        int c = 0;
        if ((A.length) == (A[0].length)) {
            r = A.length;
            c = A[0].length;

        }
        else if ((A.length) != (A[0].length)) {
            r = A[0].length;
            c = A.length;
        }
        
        int[][] TA = new int[r][c];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                TA[j][i] = matrix[i][j];
            }
        }
        return TA;
        }



    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] matrix = {
                {1, 2},
                {7, -13} };

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));

    }

}
