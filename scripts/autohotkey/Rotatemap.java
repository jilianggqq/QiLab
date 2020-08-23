// n * n
// 1 2 3
// 4 5 6
// 7 8 9
//
// 3 2 1
// 6 5 4
// 9 8 7

// 3 6 9
// 2 5 8
// 1 4 7

// 3 6 9
// 2 5 8
// 1 4 7

// x,y -> x, n-y-1 -> n-y-1, x m[x,y]-m[y,x]
class Solution {
  public void rotate(int[][] matrix) {
    if (matrix == null || matrix.length == 0) return;
    int n = matrix.length;

    // switch column 0 with n-1, 1 with n -2;
    for (int i=0; i < n; i++) {
      for (int j=0; j < n/2; j++) {
        swap(matrix[i], j, n-1-j);
      }
    }

    // swith (i, j) with (j, i)
    for (int i=0; i < n; i++) {
      for (int j=i+1; j < n; j++) {
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = tmp;
      }
    }
  }

  public void swap(int[] row, int i, int j) {
    int tmp = row[i];
    row[i] = row[j];
    row[j] = tmp;
  }

}
