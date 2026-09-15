class Solution {
    public int numIslands(char[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        int count = 0;

        // Visit every cell
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                // Found a new island
                if (grid[i][j] == '1') {
                    count++;

                    // Visit the complete island
                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    public void dfs(char[][] grid, int row, int col) {

        // Boundary check
        if (row < 0 || row >= grid.length ||
            col < 0 || col >= grid[0].length) {
            return;
        }

        // If water, return
        if (grid[row][col] == '0') {
            return;
        }

        // Mark current land as visited
        grid[row][col] = '0';

        // Up
        dfs(grid, row - 1, col);

        // Down
        dfs(grid, row + 1, col);

        // Left
        dfs(grid, row, col - 1);

        // Right
        dfs(grid, row, col + 1);
    }
}