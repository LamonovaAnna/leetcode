package _1000_1999._1100_1199;

// 1154. Day of the Year
public class _1154_DayOfTheYear {
    public int dayOfYear(String date) {
        String[] dateArr = date.split("-");

        int month = Integer.parseInt(dateArr[1]) - 1;
        int ans = 0;


        while (month > 0) {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> {
                    ans += 31;
                    month--;
                }
                case 4, 6, 9, 11 -> {
                    ans += 30;
                    month--;
                }
                case 2 -> {
                    if (Integer.parseInt(dateArr[0]) % 4 == 0 && Integer.parseInt(dateArr[0]) % 100 != 0 ||
                            (Integer.parseInt(dateArr[0]) % 4 == 0 &&
                                    Integer.parseInt(dateArr[0]) % 100 == 0 &&
                                    Integer.parseInt(dateArr[0]) % 400 == 0)) {
                        ans += 29;
                    } else {
                        ans += 28;
                    }
                    month--;
                }
            }
        }
        return ans + Integer.parseInt(dateArr[2]);
    }

    public void solution() {
        System.out.println(dayOfYear("2019-01-09"));
        System.out.println(dayOfYear("2019-02-10"));

    }
}
