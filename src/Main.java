import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter number of n- matrix");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println("Enter random limit numeral M:");
        int m = scan.nextInt();

        Random random = new Random();           //инициализация класса Random

        int [][] matrix = new int[n][n];        //инициализация матрицы
        for (int i= 0; i < n; i++){             //заполнение матрицы
            for (int j = 0; j < n; j++){
                matrix[i][j] = random.nextInt(m*2+1)-m; // генерация случайных чисел
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
