package _0_999._300_399;

//374. Guess Number Higher or Lower
public class _374_GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int left = 0;
        int right = n;
        int mid = n / 2;


        while (true) {
            int ans = guess(mid);
            if (ans == -1) {
                right = mid - 1;
            } else if (ans == 1) {
                left = mid + 1;
            } else {
                return mid;
            }
            mid = (right - left) / 2 + left;
        }


    }

    private int guess(int num) {
        int val = 9;
        return Integer.compare(val, num);
    }

    public void solution() {
        System.out.println(guessNumber(12));
    }
}
