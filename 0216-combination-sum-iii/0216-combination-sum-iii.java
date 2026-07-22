class Solution {

    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, k, n, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int k, int target,
                           List<Integer> list,
                           List<List<Integer>> result) {

        if (target == 0 && list.size() == k) {
            result.add(new ArrayList<>(list));
            return;
        }

        if (target < 0 || list.size() > k) {
            return;
        }

        for (int i = start; i <= 9; i++) {

            list.add(i);

            backtrack(i + 1, k, target - i, list, result);

            list.remove(list.size() - 1);
        }
    }
}