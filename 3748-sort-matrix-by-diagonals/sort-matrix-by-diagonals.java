import java.util.*;

class Solution {

    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;

        // Bottom-left diagonals (including main diagonal)
        for (int row = 0; row < n; row++) {
            sortDiagonal(grid, row, 0, false);
        }

        // Top-right diagonals
        for (int col = 1; col < n; col++) {
            sortDiagonal(grid, 0, col, true);
        }

        return grid;
    }

    private void sortDiagonal(int[][] grid, int row, int col, boolean ascending) {
        int n = grid.length;

        // Store diagonal elements
        List<Integer> list = new ArrayList<>();

        int i = row;
        int j = col;

        // Collect all elements of the diagonal
        while (i < n && j < n) {
            list.add(grid[i][j]);
            i++;
            j++;
        }

        // Sort the list
        Collections.sort(list);

        // If descending order is needed
        if (!ascending) {
            Collections.reverse(list);
        }

        // Put sorted values back into the matrix
        i = row;
        j = col;
        int index = 0;

        while (i < n && j < n) {
            grid[i][j] = list.get(index);
            index++;
            i++;
            j++;
        }
    }
}