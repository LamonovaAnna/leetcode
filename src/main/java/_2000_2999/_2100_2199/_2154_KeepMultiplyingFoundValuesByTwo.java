package _2000_2999._2100_2199;

// 2154. Keep Multiplying Found Values by Two
public class _2154_KeepMultiplyingFoundValuesByTwo {
    public int findFinalValue(int[] nums, int original) {
        int[] num = new int[1001];

        for (int j : nums) {
            num[j]++;
        }

        while (original < num.length) {
            if (num[original] > 0) {
                original *= 2;
            } else {
                break;
            }
        }

        return original;
    }

    public void solution() {
        System.out.println(findFinalValue(new int[]{4,7,1,16,1,2,7,13}, 1));
    }

}
