package HomeTask.middle;

import java.util.Scanner;

public class DivisorsByN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение N: ");
        int n = scanner.nextInt();

        if (n < 0 || n > 100) {
            System.out.println("Значение N доблжно быть больше 100 ");
            return;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Дедители " + i);

            }
        }
    }
}

