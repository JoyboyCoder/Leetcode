class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        for (int j = 0; j < cols; j++) sortDiagonal(mat, 0, j);
        for (int i = 1; i < rows; i++) sortDiagonal(mat, i, 0);

        return mat;
    }

    private void sortDiagonal(int[][] mat, int row, int col) {
        int rows = mat.length;
        int cols = mat[0].length;
        List<Integer> diagonal = new ArrayList<>();

        int i = row, j = col;
        while (i < rows && j < cols) {
            diagonal.add(mat[i][j]);
            i++;
            j++;
        }

        Collections.sort(diagonal);

        i = row;
        j = col;
        int idx = 0;
        while (i < rows && j < cols) {
            mat[i][j] = diagonal.get(idx++);
            i++;
            j++;
        }
    }
}