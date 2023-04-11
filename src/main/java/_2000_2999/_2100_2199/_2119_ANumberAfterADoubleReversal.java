package _2000_2999._2100_2199;

// 2119. A Number After a Double Reversal
public class _2119_ANumberAfterADoubleReversal {
    public boolean isSameAfterReversals(int num) {
        if (num < 10) {
            return true;
        }
        return num % 10 != 0;
    }
}
