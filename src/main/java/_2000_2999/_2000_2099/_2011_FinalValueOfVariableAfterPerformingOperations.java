package _2000_2999._2000_2099;

//2011. Final Value of Variable After Performing Operations
public class _2011_FinalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int counter = 0;
        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "X++":
                case "++X":
                    counter++;
                    break;
                case "--X":
                case "X--":
                    counter--;
                    break;
            }
        }
        return counter;
    }

    public void solution() {
        System.out.println(finalValueAfterOperations(new String[]{"--X", "X++", "X++"}));
        System.out.println(finalValueAfterOperations(new String[]{"++X", "++X", "X++"}));
        System.out.println(finalValueAfterOperations(new String[]{"X++", "++X", "--X", "X--"}));
    }
}
