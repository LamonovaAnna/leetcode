package _0_999._100_199;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 118. Pascal's Triangle
public class _118_PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        ans.add(List.of(1));
        if (numRows == 1) {
            return ans;
        }
        ans.add(List.of(1, 1));
        if (numRows == 2) {
            return ans;
        }

        int rowCounter = 2;
        while (rowCounter != numRows) {
            rowCounter++;
            Integer[] temp = new Integer[rowCounter];
            temp[0] = 1;
            temp[temp.length - 1] = 1;
            List<Integer> last = ans.get(ans.size() - 1);
            for (int i = 1; i < last.size() / 2 + 1; i++) {
                temp[i] = last.get(i) + last.get(i - 1);
                temp[temp.length - 1 - i] = last.get(last.size() - i) + last.get(last.size() - 1 - i);
            }
            ans.add(Arrays.asList(temp));
        }

        return ans;
    }

    public void solution() {
        System.out.println(generate(5));
        System.out.println(generate(1));
    }
}
