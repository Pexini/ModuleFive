package HomeTask.middle;

import java.util.Random;
import java.util.Scanner;

public class MultiplicatioTableTwo {
    public static void main(String[] args) {
        int userNum = 0;
        int answerRight = 0;
        int answerWrong = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 1; i <= 5; i++) {
            int a = Math.abs(random.nextInt(9)) + 1;
            int b = Math.abs(random.nextInt(9)) + 1;
            int c = a * b;

            System.out.println();
            System.out.println(" Решите пример #" + i + " : " + a + " * " + b + " ?");

            userNum = scanner.nextInt();

            if (userNum == c) {
                answerRight++;
                System.out.println("Правильно " + c);
                System.out.println();

            } else {
                answerWrong++;
                System.out.println(" Ответ неверный.  Правильный ответ  " + c);
                for (int j = 0; j < 5; j++) {
                    int newA = Math.abs(random.nextInt(9)) + 1;
                    int newB = Math.abs(random.nextInt(9)) + 1;
                    int newC = newA * newB;
                    System.out.println("Примеры для повторения :  " + newA + " * " + newB + " =  " + newC);

                }

            }
        }

        System.out.println(" Статисктика ответов : " + " Правильных " + answerRight + " Неправильных " + answerWrong);
    }
}
