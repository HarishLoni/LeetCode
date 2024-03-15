void setZeroes(int** matrix, int matrixSize, int* matrixColSize) {
    bool firstrow = false;
    bool firstcol = false;
    int row = matrixSize;
    int col = *matrixColSize;
    int i, j;

    for (i = 0; i < row; i++) {
        for (j = 0; j < col; j++) {
            if (matrix[i][j] == 0) {
                if (i == 0) firstrow = true;
                if (j == 0) firstcol = true;
                matrix[0][j] = 0;
                matrix[i][0] = 0;
            }
        }
    }

    for (i = 1; i < row; i++) {
        for (j = 1; j < col; j++) {
            if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                matrix[i][j] = 0;
            }
        }
    }

    if (firstrow) {
        for (j = 0; j < col; j++) {
            matrix[0][j] = 0;
        }
    }
    if (firstcol) {
        for (i = 0; i < row; i++) {
            matrix[i][0] = 0;
        }
    }
}
