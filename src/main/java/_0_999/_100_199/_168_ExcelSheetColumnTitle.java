package _0_999._100_199;

// 168. Excel Sheet Column Title
public class _168_ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            char c = (char) (columnNumber % 26 + 'A');
            sb.append(c);
            columnNumber /= 26;

        }
        sb.reverse();
        return sb.toString();
    }

    public void solution() {
        System.out.println(convertToTitle(2147483647));
        System.out.println(convertToTitle(1));
        System.out.println(convertToTitle(28));
        System.out.println(convertToTitle(701));
    }
}
