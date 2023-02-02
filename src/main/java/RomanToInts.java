//13. Roman to Integer
public class RomanToInts {
    public int romanToInt(String s) {
        char[] symb = s.toCharArray();
        int i = 0;
        int v = 0;
        int x = 0;
        int l = 0;
        int c = 0;
        int d = 0;
        int m = 0;
        for (int j = 0; j < s.length(); j++) {
            if ('I' == symb[j]) {
                ++i;
            } else if ('V' == symb[j]) {
                ++v;
            } else if ('X' == symb[j]) {
                ++x;
            } else if ('L' == symb[j]) {
                ++l;
            } else if ('C' == symb[j]) {
                ++c;
            } else if ('D' == symb[j]) {
                ++d;
            } else if ('M' == symb[j]) {
                ++m;
            }
        }
        int result = i + 5 * v + 10 * x + 50 * l + 100 * c + 500 * d + 1000 * m;

        if (s.contains("IV") || s.contains("IX")) {
            result = result - 2;
        }
        if (s.contains("XL") || s.contains("XC")) {
            result = result - 20;
        }
        if (s.contains("CD") || s.contains("CM")) {
            result = result - 200;
        }

        return result;
    }

    //I can be placed before V (5) and X (10) to make 4 and 9.
    //X can be placed before L (50) and C (100) to make 40 and 90.
    //C can be placed before D (500) and M (1000) to make 400 and 900.

    public void solution() {
        System.out.println(romanToInt("XXX"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("VI"));
        System.out.println(romanToInt("CD"));
    }

}
