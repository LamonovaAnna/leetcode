package _2000_2999._2700_2799;

import java.util.Arrays;

// 2798. Number of Employees Who Met the Target
public class _2798_NumberOfEmployeesWhoMetTheTarget {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        if (target == 0) {
            return hours.length;
        }

        Arrays.sort(hours);

        int ans = 0;
        for (int i = hours.length - 1; i > -1 ; i--) {
            if (hours[i] < target) {
                break;
            }
            ans++;
        }

        return ans;
    }
}
