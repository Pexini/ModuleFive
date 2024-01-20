package HomeTask.hard;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов в ряде Фибоначчи: ");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;
        System.out.println( "Ваш ряд чисел Фибоначчи : ");
        System.out.print(a + " " + b);

        for (int i = 0; i < n; i++) {

            int next = a + b;
            a = b;
            b = next;

            System.out.print(" " + next);

        }
    }
}

