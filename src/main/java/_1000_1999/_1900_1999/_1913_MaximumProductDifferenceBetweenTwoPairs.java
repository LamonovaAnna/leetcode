package _1000_1999._1900_1999;

// 1913. Maximum Product Difference Between Two Pairs
public class _1913_MaximumProductDifferenceBetweenTwoPairs {
    public int maxProductDifference(int[] nums) {
        int fMax = 0;
        int sMax = 0;
        int fMin = Integer.MAX_VALUE;
        int sMin = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > fMax) {
                sMax = fMax;
                fMax = num;
            } else if (num > sMax) {
                sMax = num;
            }

            if (num < fMin) {
                sMin = fMin;
                fMin = num;
            } else if (num < sMin) {
                sMin = num;
            }
        }
        return (fMax * sMax) - (fMin * sMin);
    }

    public void solution() {
        System.out.println(maxProductDifference(new int[] {5,6,2,7,4}));
    }

}
