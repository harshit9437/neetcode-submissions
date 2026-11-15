
class Solution {

    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        int m = heights.length;
        int n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        Queue<int[]> pq = new LinkedList<>();
        Queue<int[]> aq = new LinkedList<>();

        // Pacific: Top and Left borders
        for (int i = 0; i < m; i++) {
            pq.offer(new int[]{i, 0});
        }

        for (int j = 0; j < n; j++) {
            pq.offer(new int[]{0, j});
        }

        // Atlantic: Bottom and Right borders
        for (int i = 0; i < m; i++) {
            aq.offer(new int[]{i, n - 1});
        }

        for (int j = 0; j < n; j++) {
            aq.offer(new int[]{m - 1, j});
        }

        bfs(heights, pq, pacific);
        bfs(heights, aq, atlantic);

        List<List<Integer>> result = new ArrayList<>();

        // Find common cells
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (pacific[i][j] && atlantic[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }

        return result;
    }

    private void bfs(int[][] heights, Queue<int[]> queue,
                     boolean[][] visited) {

        int m = heights.length;
        int n = heights[0].length;

        int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        while (!queue.isEmpty()) {

            int[] current = queue.poll();

            int r = current[0];
            int c = current[1];

            if (visited[r][c]) continue;

            visited[r][c] = true;

            for (int[] dir : directions) {

                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr >= 0 && nr < m &&
                    nc >= 0 && nc < n &&
                    !visited[nr][nc] &&
                    heights[nr][nc] >= heights[r][c]) {

                    queue.offer(new int[]{nr, nc});
                }
            }
        }
    }
}
