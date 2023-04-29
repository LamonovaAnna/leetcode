package _1000_1999._1400_1499;

// 1450. Number of Students Doing Homework at a Given Time
public class _1450_NumberOfStudentsDoingHomeworkAtAGivenTime {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int ans = 0;

        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                ans++;
            }
        }
        return ans;
    }

    public void solution() {
        System.out.println(busyStudent(new int[]{1, 2, 3}, new int[]{3, 2, 7}, 4));
    }
}
