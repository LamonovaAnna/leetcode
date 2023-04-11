package _1000_1999._1300_1399;

// 1374. Generate a String With Characters That Have Odd Counts
public class _1374_GenerateAStringWithCharactersThatHaveOddCounts {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();

        sb.append("a".repeat(Math.max(0, n - 1)));

        if (n % 2 == 0) {
            sb.append('b');
        } else {
            sb.append('a');
        }
        return sb.toString();

    }
}
