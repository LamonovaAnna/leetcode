package _2000_2999._2300_2399;

// 2303. Calculate Amount Paid in Taxes
public class _2303_CalculateAmountPaidInTaxes {
    public double calculateTax(int[][] brackets, int income) {
        double tax = 0.0;
        if (income == 0) {
            return tax;
        }

        if (brackets[0][0] <= income) {
            tax = brackets[0][0] / 100.0 * brackets[0][1];
        } else {
            return income / 100.0 * brackets[0][1];
        }


        boolean moreThanIncome = false;
        for (int i = 1; i < brackets.length; i++) {
            if (brackets[i][0] <= income) {
                tax += (brackets[i][0] - brackets[i - 1][0]) / 100.0 * brackets[i][1];
            } else {
                if (moreThanIncome) {
                    break;
                }
                tax += (income - brackets[i - 1][0]) / 100.0 * brackets[i][1];
                moreThanIncome = true;
            }
        }


        return tax;
    }

    public void solution() {
        System.out.println(calculateTax(new int[][]{{10, 10}}, 5));
        System.out.println(calculateTax(new int[][]{{3, 50}, {7, 10}, {12, 25}}, 10));
        System.out.println(calculateTax(new int[][]{{1, 0}, {4, 25}, {5, 50}}, 2));
        System.out.println(calculateTax(new int[][]{{2, 50}}, 0));

    }
}
