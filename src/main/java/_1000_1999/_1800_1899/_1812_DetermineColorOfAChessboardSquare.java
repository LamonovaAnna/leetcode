package _1000_1999._1800_1899;

// 1812. Determine Color of a Chessboard Square
public class _1812_DetermineColorOfAChessboardSquare {
    public boolean squareIsWhite(String coordinates) {
        int number = Integer.parseInt(String.valueOf(coordinates.charAt(1)));
        int letter = coordinates.charAt(0) - 'a' + 1;
        return (number + letter) % 2 != 0;
    }
}
