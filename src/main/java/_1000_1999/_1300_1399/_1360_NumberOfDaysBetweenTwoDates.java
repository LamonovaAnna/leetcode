package _1000_1999._1300_1399;

// 1360. Number of Days Between Two Dates
public class _1360_NumberOfDaysBetweenTwoDates {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(countDays(date2) - countDays(date1));
    }

    private int countDays(String date) {
        int[] startDate = new int[] {1971, 1, 1};
        int[] yearDays = new int[] {31, 28, 31, 30 ,31, 30, 31, 31, 30, 31, 30, 31};
        String[] dateS = date.split("-");
        int days = 0;

        int year = Integer.parseInt(dateS[0]);
        while (year > startDate[0]) {
            if (startDate[0] % 4 != 0 || (startDate[0] % 100 == 0 && startDate[0] % 400 != 0)) {
                days += 365;
            } else {
                days += 366;
            }
            startDate[0]++;
        }

        int month = Integer.parseInt(dateS[1]);
        if (month > startDate[1]) {
            for (int i = 0; i < month - 1; i++) {
                days += yearDays[i];
            }
        }

        if (month > 2) {
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                days += 1;
            }
        }

        return days + Integer.parseInt(dateS[2]);
    }

    public void solution() {
        System.out.println(daysBetweenDates("2100-09-22", "1991-03-12"));
        System.out.println(daysBetweenDates("2019-06-29", "2019-06-30"));
        System.out.println(daysBetweenDates("2020-01-15", "2019-12-31"));
    }
}
