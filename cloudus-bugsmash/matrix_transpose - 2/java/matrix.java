public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5}  
        };

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[rows][cols]; 

       
        for (int i = 0; i <= rows; i++) { 
            for (int j = 0; j <= cols; j++) { 
                transpose[j][i] = matrix[i][j]; 
            }
        }

       
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < cols; j++) { 
                System.out.print(transpose[i][j]); 
            }
            System.out.println();
        }
    }
}
