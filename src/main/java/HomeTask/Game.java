package HomeTask;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int secretNumber = Math.abs(new Random().nextInt()) % 100;
        int inputNumber = -1;
        int atterns = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Попробуйте угадать число от 0 до 100. Введите число : ");

        while (secretNumber != inputNumber) {
            if (scanner.hasNextInt()) {
                inputNumber = scanner.nextInt();
                atterns++;

                if (inputNumber > secretNumber) {
                    System.out.println("Введеное число больше загаданного");
                }
                if (inputNumber < secretNumber) {
                    System.out.println("Введенное число меньше загаданного");
                }
            }else {
                System.out.println("Invalid input");
                scanner.next();
            }
            }
            System.out.println("вы угадали ! Загаданое число " + secretNumber + " Количесвтов попыток : " + atterns);
        }
    }
