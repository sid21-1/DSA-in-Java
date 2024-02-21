package arrays;

public class learn {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        
        System.out.println("Spiral traversal:");
        spiralTraversal(matrix);
    }

    static void spiralTraversal(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int topRow = 0, bottomRow = rows - 1;
        int leftCol = 0, rightCol = cols - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            // Traverse top row
            for (int i = leftCol; i <= rightCol; i++) {
                System.out.print(matrix[topRow][i] + " ");
            }
            topRow++;

            // Traverse right column
            for (int i = topRow; i <= bottomRow; i++) {
                System.out.print(matrix[i][rightCol] + " ");
            }
            rightCol--;

            // Traverse bottom row
            if (topRow <= bottomRow) {
                for (int i = rightCol; i >= leftCol; i--) {
                    System.out.print(matrix[bottomRow][i] + " ");
                }
                bottomRow--;
            }

            // Traverse left column
            if (leftCol <= rightCol) {
                for (int i = bottomRow; i >= topRow; i--) {
                    System.out.print(matrix[i][leftCol] + " ");
                }
                leftCol++;
            }
        }
    }
}


