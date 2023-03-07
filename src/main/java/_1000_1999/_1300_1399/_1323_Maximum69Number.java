package _1000_1999._1300_1399;

// 1323. Maximum 69 Number
public class _1323_Maximum69Number {
    public int maximum69Number(int num) {
        String[] dig = String.valueOf(num).split("");

        int index = 0;
        for (int i = 0; i < dig.length; i++) {
            if (dig[i].equals("6")) {
                index = dig.length - 1 - i;
                break;
            }
            if (i == dig.length - 1) {
                return num;
            }
        }

        return num + (int)(3 * Math.pow(10, index));

    }

    public void solution() {
        System.out.println(maximum69Number(9999));
        System.out.println(maximum69Number(9996));
        System.out.println(maximum69Number(9669));


    }
}
