package _0_999._0_99;

//12. Integer to Roman
public class _12_IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            if (num - 1000 >= 0) {
                num -= 1000;
                sb.append("M");
            } else if (num - 900 >= 0) {
                num -= 900;
                sb.append("CM");
            } else if (num - 500 >= 0) {
                num -= 500;
                sb.append("D");
            } else if (num - 400 >= 0) {
                num -= 400;
                sb.append("CD");
            } else if (num - 100 >= 0) {
                num -= 100;
                sb.append("C");
            } else if (num - 90 >= 0) {
                num -= 90;
                sb.append("XC");
            } else if (num - 50 >= 0) {
                num -= 50;
                sb.append("L");
            } else if (num - 40 >= 0) {
                num -= 40;
                sb.append("XL");
            } else if (num - 10 >= 0) {
                num -= 10;
                sb.append("X");
            } else if (num - 9 >= 0) {
                num -= 9;
                sb.append("IX");
            } else if (num - 5 >= 0) {
                num -= 5;
                sb.append("V");
            } else if (num - 4 >= 0) {
                num -= 4;
                sb.append("IV");
            } else if (num - 1 >= 0) {
                num -= 1;
                sb.append("I");
            }
        }
        return String.valueOf(sb);

    }

    public void solution() {
        System.out.println(intToRoman(3));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
    }
}
