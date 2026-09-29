class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(b[0], a[0])
        );

        for (int i = 0; i < points.length; i++) {

            int x = points[i][0];
            int y = points[i][1];

            int distance = x * x + y * y;

            pq.add(new int[]{distance, x, y});

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[][] ans = new int[k][2];

        for (int i = 0; i < k; i++) {
            int[] curr = pq.poll();

            ans[i][0] = curr[1];
            ans[i][1] = curr[2];
        }

        return ans;
    }
}