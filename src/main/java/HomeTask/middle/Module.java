package HomeTask.middle;

public class Module {
    public static void main(String[] args) {
        int n = 3;
        double[] array = {3.2, -1.3, 7.3};

        double maxValue = 0;

        for (int i = 1; i < n; i++) {
            double value = Math.abs(array[i]);

            if (i == 0 || value > maxValue) {
                maxValue = value;
            }
        }
        System.out.println("MaxValue " + maxValue);
    }
}
