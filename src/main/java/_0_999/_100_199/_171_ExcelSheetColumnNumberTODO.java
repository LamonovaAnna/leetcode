package _0_999._100_199;

// 171. Excel Sheet Column Number
public class _171_ExcelSheetColumnNumberTODO {
    public int titleToNumber(String columnTitle) {
        double counter = 0;
        StringBuilder sb = new StringBuilder(columnTitle);
        sb.reverse();
        for (int i = 0; i < columnTitle.length(); i++) {
            int ind = sb.charAt(i) - 'A';
            ind++;
            if (i == columnTitle.length() - 1) {
                counter += ind;
            } else {
                counter += (26 * (26%ind) + 26);
            }
        }
        return (int)counter;
    }

    public void solution() {

        //System.out.println(titleToNumber("A"));
        System.out.println(titleToNumber("AB"));
        System.out.println(titleToNumber("ZY"));
        System.out.println(titleToNumber("FXSHRXW"));

    }
}
