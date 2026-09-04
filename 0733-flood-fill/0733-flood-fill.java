import java.util.*;

class Solution {

    public void dfs(int[][] image, int i, int j, int newColor, int orgColor) {

        // Boundary check + different color check
        if (i < 0 || j < 0 ||
            i >= image.length || j >= image[0].length ||
            image[i][j] == newColor ||
            image[i][j] != orgColor) {
            return;
        }

        // Change current pixel
        image[i][j] = newColor;

        // Up
        dfs(image, i - 1, j, newColor, orgColor);

        // Right
        dfs(image, i, j + 1, newColor, orgColor);

        // Down
        dfs(image, i + 1, j, newColor, orgColor);

        // Left
        dfs(image, i, j - 1, newColor, orgColor);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int orgColor = image[sr][sc];

        dfs(image, sr, sc, color, orgColor);

        return image;
    }
}