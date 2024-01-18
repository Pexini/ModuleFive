package HomeTask.middle;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите число : ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Фактор числа возможен только для положительных чисел ");
            return;
        } else {
            long factorial = 1;
            for (int i = 2; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial " + factorial);
        }
    }
}
