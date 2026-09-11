// Last updated: 9/11/2026, 9:22:54 AM
class Solution {
    public boolean isThree(int n) {
        int root = (int)Math.sqrt(n);
        if (root * root != n) return false; // not a perfect square
        return isPrime(root);
    }

    private boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
