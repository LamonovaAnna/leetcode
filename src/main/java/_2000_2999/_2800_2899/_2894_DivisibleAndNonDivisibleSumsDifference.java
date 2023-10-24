package _2000_2999._2800_2899;

public class _2894_DivisibleAndNonDivisibleSumsDifference {
    public int differenceOfSums(int n, int m) {

        int sumND = 0;
        int sumD = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sumD += i;
            } else {
                sumND += i;
            }
        }

        return sumND - sumD;
    }
}
