package _1000_1999._1500_1599;

// 1556. Thousand Separator
public class _1556_ThousandSeparator {
    public String thousandSeparator(int n) {
        if (n < 1000) {
            return String.valueOf(n);
        }

        StringBuilder sb = new StringBuilder();

        while (n > 1000) {
            sb.insert(0, n % 1000);
            if (n % 1000 < 100) {
                sb.insert(0, 0);
            }
            sb.insert(0, '.');
            n /= 1000;
        }
        sb.insert(0, n);

        return sb.toString();
    }

    public void solution() {
        System.out.println(thousandSeparator(1222234));
    }
}
