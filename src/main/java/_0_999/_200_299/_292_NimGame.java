package _0_999._200_299;

//292. Nim Game
public class _292_NimGame {
    public boolean canWinNim(int n) {
        return n % 4 != 0;

    }

    public void solution() {
        System.out.println(canWinNim(4));
        System.out.println(canWinNim(1));
        System.out.println(canWinNim(2));
    }
}
