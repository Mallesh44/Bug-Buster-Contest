#include <stdio.h>

int main() {
    int rows = 2, cols = 3;
    int matrix[2][3] = {{1, 2, 3}, {4, 5, 6}};
    int transpose[2][3]; 
    
    for(int i = 0; i <= rows; ++i) 
        for(int j = 0; j <= cols; ++j) 
            transpose[i][j] = matrix[j][i]; 

    
    printf("Transpose of the matrix:\n");
    for(int i = 0; i < rows; ++i) { 
        for(int j = 0; j < cols; ++j) 
            printf("%d ", transpose[i][j]);
        printf("\n");
    }
    return 0;
}
