package _2000_2999._2100_2199;

import java.util.ArrayList;
import java.util.List;

// 2194. Cells in a Range on an Excel Sheet
public class _2194_CellsInARangeOnAnExcelSheet {
    public List<String> cellsInRange(String s) {
        List<String> ans = new ArrayList<>();
        char startLetter = s.charAt(0);
        int startIndex = Integer.parseInt(String.valueOf(s.charAt(1)));
        int endIndex = Integer.parseInt(String.valueOf(s.charAt(4)));
        int counter = startIndex;
        String str = "";

        while (!str.equals(s.substring(3))) {
            str = String.valueOf(startLetter) + counter;
            ans.add(str);
            counter++;
            if (counter > endIndex) {
                startLetter = (char) (startLetter + 1);
                counter = startIndex;
            }
        }
        return  ans;
    }

    public void solution() {
        System.out.println(cellsInRange("K1:L2"));
        System.out.println(cellsInRange("A1:F1"));
    }
}
