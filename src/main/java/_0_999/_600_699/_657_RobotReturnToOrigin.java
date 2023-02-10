package _0_999._600_699;

//657. Robot Return to Origin
public class _657_RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int upDown = 0;
        int rightLeft = 0;

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                upDown++;
            } else if (moves.charAt(i) == 'D') {
                upDown--;
            } else if (moves.charAt(i) == 'R') {
                rightLeft++;
            } else {
                rightLeft--;
            }
        }

        return upDown == 0 && rightLeft == 0;
    }

    public void solution() {
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("UULL"));
    }
}
