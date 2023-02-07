package _2000_2999._2400_2499;//2469. Convert the Temperature
import java.util.Arrays;

public class ConvertTheTemperature {
    public double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }

    public void solution() {
        System.out.println(Arrays.toString(convertTemperature(36.50)));
        System.out.println(Arrays.toString(convertTemperature(122.11)));
    }
}
