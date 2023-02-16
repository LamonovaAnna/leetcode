package _0_999._600_699;

//682. Baseball Game
public class _682_BaseballGame {
    public int calPoints(String[] operations) {
        int[] numbers = new int[operations.length];
        int counter = 0;
        int sum = 0;
        for (String operation : operations) {
            if (operation.equals("+")) {
                numbers[counter] = numbers[counter - 1] + numbers[counter - 2];
                sum += numbers[counter];
                counter++;
            } else if (operation.equals("D")) {
                numbers[counter] = numbers[counter - 1] * 2;
                sum += numbers[counter];
                counter++;
            } else if (operation.equals("C")) {
                sum -= numbers[counter - 1];
                numbers[counter - 1] = 0;
                counter--;
            } else if (Character.isDigit(operation.charAt(0)) || Character.isDigit(operation.charAt(1))) {
                numbers[counter] = Integer.parseInt(operation);
                sum += numbers[counter];
                counter++;
            }
        }
        return sum;
    }

    public void solution() {
        System.out.println(calPoints(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"}));
        System.out.println(calPoints(new String[]{"5", "2", "C", "D", "+"}));
        System.out.println(calPoints(new String[]{"1", "C"}));
    }
}
