package HomeTask.middle;

public class module {
    public static void main(String[] args) {
        int n = 3;
        double[] array = {3.2, -1.3, 7.3};

        double maxValue = Math.abs(array[0]);

        for (int i = 1; i < n; i++) {
            double value = Math.abs(array[i]);
            if (value > maxValue) {
                maxValue = value;
            }
        }
        System.out.println("MaxValue " + maxValue);
    }
}
