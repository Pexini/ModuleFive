package HomeTask.middle;

import java.util.Random;
import java.util.Scanner;

public class multiplicatioTable {
    public static void main(String[] args) {

        int userNum = 0;

        for (int i = 0; i < 5; i++) {
            int a = Math.abs(new Random().nextInt()) % 9 + 1;
            int b = Math.abs(new Random().nextInt()) % 9 + 1;
            int c = a * b;

            System.out.println(" Ответь на вопрос сколько будет " + a + " * " + b + " ?");

            Scanner scanner = new Scanner(System.in);
            userNum = scanner.nextInt();

            if (userNum == c) {
                System.out.println("Правильно : " + c);
            } else {
                System.out.println("Hеправильно: " + a + " умножить на " + b + " = " + c);
            }

        }
    }
}

