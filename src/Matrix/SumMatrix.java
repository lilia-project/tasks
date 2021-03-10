package Matrix;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SumMatrix {

    public void start() {
        System.out.println("введите размер квадратной матрицы ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[][] matrix1 = new int[size][size];
        int[][] matrix2 = new int[size][size];
        int[][] sumMatrix = new int[size][size];

        Random random = new Random();

        // todo simplify method: remove matrix1 and matrix2 from arguments. Make method return an initialized matrix
        initializeM(size, matrix1, matrix2, random);

        //встроенный метод для вывода элементов массива на консоль
        System.out.println(Arrays.deepToString(matrix2));

        // todo extract this for into method that will be responsible for summarising matrix
        // вычисление суммы матриц
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        // вывод на консоль суммы матриц
        System.out.println((Arrays.deepToString(sumMatrix)));

        // todo extract method that will print matrix
        //вычисление суммы элементов в суммарной матрице
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum += sumMatrix[i][j];
            }
        }
        System.out.println("сумма элементов финальной матрицы равна " + sum);
    }

    private void initializeM(int size, int[][] matrix1, int[][] matrix2, Random random) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix1[i][j] = random.nextInt(100);
                matrix2[i][j] = random.nextInt(100);
                System.out.print(" " + matrix1[i][j]);
            }
            System.out.println();
        }
    }
}


