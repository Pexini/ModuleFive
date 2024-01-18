package HomeTask.middle;

import java.util.Random;
import java.util.Scanner;

public class multiplicatioTable {
    public static void main(String[] args) {
        int a = Math.abs(new Random().nextInt()) % 9 + 1;
        int b = Math.abs(new Random().nextInt()) % 9 + 1;
        int c = a * b;
        int userNum = 0;
        System.out.println(" Ответь на вопрос сколько будет " + a + " умножить на " + b + " ?");

        while (userNum != c) {
            Scanner scanner = new Scanner(System.in);
            userNum = scanner.nextInt();

            if (userNum == c) {
                System.out.println("правильно " + a + " умножить на " + b + " равно " + c);
            } else {
                System.out.println("неправильно " + a + " умножить на " + b + " равно " + c);
            }

        }
    }
}
