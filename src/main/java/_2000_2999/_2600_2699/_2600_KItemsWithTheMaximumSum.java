package _2000_2999._2600_2699;

// 2600. K Items With the Maximum Sum
public class _2600_KItemsWithTheMaximumSum {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (k <= numOnes) {
            return k;
        } else if (numOnes + numZeros >= k) {
            return numOnes;
        } else {
            return numOnes + (k - numOnes - numZeros) * -1;
        }
    }

    public void solution() {
        System.out.println(kItemsWithMaximumSum(3, 0, 5, 8));
    }
}
