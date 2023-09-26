package _2000_2999._2400_2499;

// 2413. Smallest Even Multiple
public class _2413_SmallestEvenMultiple {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        } else {
            return n * 2;
        }
    }
}
