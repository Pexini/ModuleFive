package HomeTask.hard;

import java.util.Scanner;

public class DeletedDublicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter length of array :");
        int length = scanner.nextInt();

        int[] array = new int[length];
        boolean[] isDuplicate = new boolean[1002];

        System.out.println("Enter elements of array : ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
            isDuplicate[array[i]] = true;

        }
        System.out.println("Array without duplicate numbers : ");
        for (int i = 0; i < length; i++) {
            if (isDuplicate[array[i]]) {
                isDuplicate[array[i]] = false;
                System.out.println(array[i]);
            }
        }
    }
}