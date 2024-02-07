package arrays;

public class checkColumnMajorTraversal {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 4, 7 },
                { 2, 5, 8 },
                { 3, 6, 9 }
        };
        boolean ColumnMajor = checkColumnMajor(matrix);
        if (ColumnMajor) {
            System.out.println("the matrix is in column major Traversal");
        } else {
            System.out.println("the matrix is not in column major Traversal");
        }
    }

    static boolean checkColumnMajor(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int expectedValue = 1;

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                if (matrix[i][j] != expectedValue) {
                    return false;
                }
                expectedValue++;
            }
        }
        return true;
    }
}
