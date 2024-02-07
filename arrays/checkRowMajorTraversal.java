package arrays;

public class checkRowMajorTraversal {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        boolean isRowMajor = checkRowMajor(matrix);
        if (isRowMajor) {
            System.out.println("the matrix is in row major traversal");
        } else {
            System.out.println("the matrix is not in row major traversal");
        }
    }

    static boolean checkRowMajor(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int expectedValue = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != expectedValue) {
                    return false;
                }
                expectedValue++;
            }
        }
        return true;
    }
}
