class Solution {

    public int findKthNumber(int n, int k) {

        int curr = 1;
        k--;

        while (k > 0) {

            long steps = countSteps(curr, curr + 1, n);

            if (steps <= k) {
                curr++;
                k -= steps;
            } else {
                curr *= 10;
                k--;
            }
        }

        return curr;
    }

    private long countSteps(long first, long last, int n) {

        long steps = 0;

        while (first <= n) {
            steps += Math.min((long) n + 1, last) - first;
            first *= 10;
            last *= 10;
        }

        return steps;
    }
}