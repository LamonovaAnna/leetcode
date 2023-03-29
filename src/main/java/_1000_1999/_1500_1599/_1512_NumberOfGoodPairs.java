package _1000_1999._1500_1599;

// 1512. Number of Good Pairs
public class _1512_NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }

        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public void solution() {
        System.out.println(numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
        System.out.println(numIdenticalPairs(new int[]{1, 1, 1, 1}));
        System.out.println(numIdenticalPairs(new int[]{1, 2, 3}));
    }
}
