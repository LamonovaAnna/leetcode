package _1000_1999._1300_1399;

// 1342. Number of Steps to Reduce a Number to Zero
public class _1342_NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps(int num) {
        int ans = 0;

        while(num > 0) {
            if (num % 2 != 0) {
                ans++;
                num--;
            } else {
                ans++;
                num = num / 2;
            }
        }
        return ans;
    }


    public void solution() {
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfSteps(8));
        System.out.println(numberOfSteps(123));
    }
}
