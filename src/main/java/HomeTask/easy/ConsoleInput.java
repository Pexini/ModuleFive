package HomeTask.easy;

import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {


        System.out.println("Введите число и степень");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int result = 1;

        for (int i = 0; i < n; i++)
        {
            result *= a;
        }
        System.out.println(a  + " В степени " + n + " равно " + result );
    }
}
