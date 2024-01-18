package HomeTask.middle;

public class MainDiagonalSum {

    public static void main(String[] args) {


//        int[][] array = new int[3][3];
//        array[0][0] = 1;
//        array[1][1] = 2;
//        array[2][2] = 1;

        int[][] array = new int[5][5];
        array[0][0] = 3;
        array[1][1] = 9;
        array[2][2] = 3;
        array[3][3] = 3;
        array[4][4] = 3;


        int diagonalSum = 0;
        for (int i = 0; i < array.length; i++) {
            diagonalSum += array[i][i];
        }
        System.out.println(" Сумма элементов на главной диагонали: " + diagonalSum);

    }
}

