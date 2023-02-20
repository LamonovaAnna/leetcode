package _0_999._400_499;

//476. Number Complement
public class _476_NumberComplement {
    public int findComplement(int num) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(num));
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '0') {
                sb.insert(i, 1);
                sb.deleteCharAt(i + 1);
            } else {
                sb.insert(i, 0);
                sb.deleteCharAt(i + 1);
            }
        }
        return Integer.parseInt(String.valueOf(sb), 2);
    }

    public void solution() {
        System.out.println(findComplement(5));
        System.out.println(findComplement(1));
    }
}
