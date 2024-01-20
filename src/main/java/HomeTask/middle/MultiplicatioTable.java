package HomeTask.middle;

import java.util.Random;
import java.util.Scanner;

public class MultiplicatioTable {
    public static void main(String[] args) {

        int userNum = 0;
        int answerRight = 0;
        int answerWrong = 0;

        for (int i = 0; i < 15; i++) {
            int a = Math.abs(new Random().nextInt(9)) + 1;
            int b = Math.abs(new Random().nextInt(9)) + 1;
            int c = a * b;


            System.out.println(" Ответь на вопрос сколько будет " + a + " * " + b + " ?");

            Scanner scanner = new Scanner(System.in);
            userNum = scanner.nextInt();


            if (userNum == c) {
                answerRight++;
               // System.out.println("Пример № " + patterns + " Правильно : " + c);
            } else {
                answerWrong++;
             //   System.out.println("Пример № " + patterns + " Hеправильно: " + a + " умножить на " + b + " = " + c);
            }
            if ((answerRight + answerWrong) % 5 == 0) {
                System.out.println( "Ваш результат : " + " Правильные ответы = " +  answerRight + "; Неправильные ответы =  " + answerWrong );
                break;
            }

        }
    }
}

