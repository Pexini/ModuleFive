package HomeTask.middle;

import java.util.Random;
import java.util.Scanner;

public class MultiplicatioTable {
    public static void main(String[] args) {

        int userNum = 0;
        int answerRight = 0;
        int answerWrong = 0;
        int extraAnswer = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 5; i++) {
            int a = Math.abs(random.nextInt(9)) + 1;
            int b = Math.abs(random.nextInt(9)) + 1;
            int c = a * b;

            System.out.println();
            System.out.println(" Решите пример № " + i + "   " + a + " * " + b + " ?");


            userNum = scanner.nextInt();


            if (userNum == c) {
                answerRight++;
                System.out.println("Пример № " + i + "\n Правильно : " + c);

            } else {
                answerWrong++;
                System.out.println("Пример № " + i + " \n Hеправильно: " + a + " умножить на " + b + " = " + c);
                System.out.println();


                for (int w = 0; w < 1; w++) {
                    int newA = Math.abs(random.nextInt(9)) + 1;
                    int newB = Math.abs(random.nextInt(9)) + 1;
                    int newC = newA * newB;


                    System.out.println("Дополнительный вопрос: " + newA + " * " + newB + " ?");
                    userNum = scanner.nextInt();

                    while (userNum != newC) {
                        extraAnswer++;
                        answerWrong++;
                        System.out.println("Дополнительный вопрос: " + newA + " * " + newB + " ?");
                        userNum = scanner.nextInt();
                    }
                    if (userNum == newC)
                        extraAnswer++;
                    System.out.println("Верно, возвразаемся к примерам");
                    System.out.println();

                }
                if (answerRight >= 5) {
                    break;
                }
            }


        }
        System.out.println("Итоговая статистика: Правильные ответы = " + answerRight + "; Неправильные ответы =  " + answerWrong + " Дополнительные вопросы = " + extraAnswer);
    }

}




