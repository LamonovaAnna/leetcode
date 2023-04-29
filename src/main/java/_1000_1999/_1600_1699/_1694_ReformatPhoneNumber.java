package _1000_1999._1600_1699;

// 1694. Reformat Phone Number
public class _1694_ReformatPhoneNumber {
    public String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < number.length(); i++) {
            if (Character.isDigit(number.charAt(i))) {
                sb.append(number.charAt(i));
            }
        }

        if (sb.length() < 4) {
            return sb.toString();
        }

        if (sb.length() == 4) {
            sb.insert(2, '-');
            return sb.toString();
        }

        int counter = 3;
        while (counter < sb.length()) {
            sb.insert(counter, '-');
            if (sb.length() - counter == 5) {
                counter += 3;
            } else {
                counter += 4;
            }
        }


        return sb.toString();
    }

    public void solution() {
        System.out.println(reformatNumber("-223-"));
        System.out.println(reformatNumber("-2222-"));
        System.out.println(reformatNumber("1-23-45 6"));
        System.out.println(reformatNumber("123 4-567788 99"));
    }
}
