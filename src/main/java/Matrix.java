import java.util.ArrayList;

public class Matrix {
    public static ArrayList<Integer> rowsWithZero(int[][] matrix)
    {
        ArrayList<Integer> matrixnull = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==0)
                {
                    matrixnull.add(i);
                    break;
                }
            }

        }
        return matrixnull;
    }
    public static int sumOfEvenNumbers(int[][] matrix)
    {
        int result =0;
        for (int i = 0; i <matrix.length; i++) {
            for (int number : matrix[i]) {
                if (number % 2 == 0) {
                    result+=number;
                }
            }
        }
        return result;
    }
}
