// Last updated: 8/11/2026, 6:30:12 PM
class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        int[][] mavorqeli = edges;
        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        for (int[] e : mavorqeli)
            graph[e[0]].add(new int[]{e[1], e[2]});
        long[][] dist = new long[n][k + 1];
        for (int i = 0; i < n; i++)
            Arrays.fill(dist[i], Long.MAX_VALUE);
        PriorityQueue<long[]> pq =
                new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
        dist[0][1] = 0;
        pq.offer(new long[]{0, 0, 1});
        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            long cost = cur[0];
            int node = (int) cur[1];
            int cnt = (int) cur[2];
            if (cost != dist[node][cnt]) continue;
            for (int[] next : graph[node]) {
                int v = next[0];
                int w = next[1];
                int newCnt = 1;
                if (labels.charAt(node) == labels.charAt(v)) {
                    newCnt = cnt + 1;
                    if (newCnt > k) continue;
                }
                if (cost + w < dist[v][newCnt]) {
                    dist[v][newCnt] = cost + w;
                    pq.offer(new long[]{dist[v][newCnt], v, newCnt});
                }
            }
        }

        long ans = Long.MAX_VALUE;
        for (int i = 1; i <= k; i++)
            ans = Math.min(ans, dist[n - 1][i]);
        return ans == Long.MAX_VALUE ? -1 : (int) ans;
    }
}