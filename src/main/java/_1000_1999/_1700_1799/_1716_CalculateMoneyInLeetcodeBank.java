package _1000_1999._1700_1799;

// 1716. Calculate Money in Leetcode Bank
public class _1716_CalculateMoneyInLeetcodeBank {
    public int totalMoney(int n) {
        int ans = 0;
        int monday = 0;
        int sum = 0;
        int lastPay = 0;

        for (int i = 0; i < n; i++) {
            if (i % 7 == 0) {
                monday++;
                ans += sum;
                lastPay = monday;
                sum = monday;
            } else {
                lastPay++;
                sum += lastPay;
            }
        }

        return ans + sum;
    }

    public void solution() {
        System.out.println(totalMoney(4)); // 10
    }
}
