package _1000_1999._1500_1599;

//1523. Count Odd Numbers in an Interval Range
public class _1523_CountOddNumbersInAnIntervalRange {
    public int countOdds(int low, int high) {
        if (low % 2 == 0 && high % 2 == 0) {
            return (high - low) / 2;
        } else {
            return (high - low) / 2 + 1;
        }
    }

    public void solution() {
        System.out.println(countOdds(3, 7));
        System.out.println(countOdds(8, 10));
    }

}
