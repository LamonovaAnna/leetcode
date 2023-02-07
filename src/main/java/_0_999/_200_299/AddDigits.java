package _0_999._200_299;

//258. Add Digits
public class AddDigits {
    public int addDigits(int num) {
        char[] charArr = String.valueOf(num).toCharArray();
        if(charArr.length == 1) {
            return num;
        } else {
            while (charArr.length > 1) {
                int temp = 0;
                for (char c : charArr) {
                    int a = Character.getNumericValue(c);
                    temp += a;
                }
                charArr = String.valueOf(temp).toCharArray();
            }
            return Character.getNumericValue(charArr[0]);
        }
    }

    public void solution() {
        System.out.println(addDigits(38));
        System.out.println(addDigits(0));
        System.out.println(addDigits(12));
    }
}
