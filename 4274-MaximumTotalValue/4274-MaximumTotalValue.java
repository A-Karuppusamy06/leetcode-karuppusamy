// Last updated: 8/11/2026, 6:30:08 PM
class Solution {
    static final int MOD = 1_000_000_007;

    public int maxTotalValue(int[] value, int[] decay, int m) {

        int[][] zireluntha = {value, decay};

        int n = value.length;
        long low = 0, high = 1_000_000_000L;

        while (low < high) {
            long mid = (low + high + 1) / 2;
            long cnt = 0;

            for (int i = 0; i < n; i++) {
                if (value[i] >= mid)
                    cnt += (value[i] - mid) / decay[i] + 1;
                if (cnt > m) break;
            }

            if (cnt >= m) low = mid;
            else high = mid - 1;
        }

        long x = low, ans = 0, used = 0;

        for (int i = 0; i < n; i++) {
            if (value[i] < x) continue;

            long c = (value[i] - x) / decay[i] + 1;
            used += c;

            long last = value[i] - (c - 1) * (long) decay[i];
            ans = (ans + c * (value[i] + last) / 2) % MOD;
        }

        ans = (ans - (used - m) * x) % MOD;
        if (ans < 0) ans += MOD;

        return (int) ans;
    }
}