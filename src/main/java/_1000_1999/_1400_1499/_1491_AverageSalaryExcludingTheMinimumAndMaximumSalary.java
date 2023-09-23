package _1000_1999._1400_1499;

// 1491. Average Salary Excluding the Minimum and Maximum Salary
public class _1491_AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int j : salary) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }

            sum += j;
        }

        return (double) (sum - max - min) / (salary.length - 2);

    }


}
