package HomeTask.middle;

import java.util.Scanner;

public class SummaNumbers {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 45, 1};
        int sum = 0;
        for (int i = 0; i < array.length; i++){
        sum += array[i];
    }
        System.out.println( "Sum of all elements " + sum);
}
}
