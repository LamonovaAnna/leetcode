package _1000_1999._1500_1599;

import java.util.HashMap;
import java.util.Map;

// 1507. Reformat Date
public class _1507_ReformatDate {
    public String reformatDate(String date) {
        Map<String, String> months = new HashMap<>();
        months.put("Jan", "01");
        months.put("Feb", "02");
        months.put("Mar", "03");
        months.put("Apr", "04");
        months.put("May", "05");
        months.put("Jun", "06");
        months.put("Jul", "07");
        months.put("Aug", "08");
        months.put("Sep", "09");
        months.put("Oct", "10");
        months.put("Nov", "11");
        months.put("Dec", "12");

        String[] dateS = date.split(" ");

        StringBuilder s = new StringBuilder();
        for (int i = dateS[0].length() - 3; i != -1; i--) {
            s.append(dateS[0].charAt(i));
        }
        if (s.length() == 1) {
            s.append(0);
        }
        s.reverse();
        s.insert(0, "-").insert(0, months.get(dateS[1])).insert(0, '-').insert(0, dateS[2]);

        return s.toString();
    }

    public void solution() {
        System.out.println(reformatDate("20th Oct 2052"));
        System.out.println(reformatDate("6th Jun 1933"));
        System.out.println(reformatDate("26th May 1960"));
    }
}
