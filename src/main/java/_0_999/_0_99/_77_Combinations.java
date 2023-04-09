package _0_999._0_99;

import java.util.LinkedList;
import java.util.List;

// 77. Combinations
public class _77_Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new LinkedList<>();
        if (k == 0) {
            ans.add(new LinkedList<>());
            return ans;
        }
        backtrack(1, new LinkedList<>(), k, n, ans);
        return ans;
    }

    private void backtrack(int start, LinkedList<Integer> current, int k, int n, List<List<Integer>> ans) {
        if (current.size() == k) {
            ans.add(new LinkedList<>(current));
        }

        for (int i = start; i <= n && current.size() < k; i++) {
            current.add(i);
            backtrack(i + 1, current, k, n, ans);
            current.removeLast();
        }
    }

    public void solution() {
        System.out.println(combine(3, 3));
        System.out.println(combine(4, 2));
        // [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
    }

}

