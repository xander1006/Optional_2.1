import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter number of n- matrix");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println("Enter random limit numeral M:");
        int m = scan.nextInt();

        //инициализация класса Random
        Random random = new Random();

        //инициализация матрицы
        int [][] matrix = new int[n][n];
        //заполнение матрицы
        for (int i= 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = random.nextInt(m*2+1)-m; // генерация случайных чисел
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        //Вводим столбец матрицы для сортировки
        System.out.println("Enter sorting column: ");
        int k = scan.nextInt();
        //сортировка матрицы
        boolean bool = false;
        int temp;
        while (!bool){
            bool = true;
        for (int i = 0; i < n-1; i++) {
            if (matrix[i][k-1] > matrix[i + 1][k-1]){
                bool = false;
                for (int j = 0; j < n; j++) {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[i + 1][j];
                    matrix[i + 1][j] = temp;
                }
            }
        }
        }
            //Вывод отсортированной матрицы
            for (int i= 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }

        }
    }

