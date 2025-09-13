package laba1;
import java.util.Scanner;
public class laba1_2 {
    public static void main(String[] args) {
        System.out.println("---2.1 Циклы for, while, do...while---");
        
        System.out.println("\nЦикл for: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }
 
        System.out.println("\nЦикл while: ");
        int j = 1;
        while (j <= 10) {
            System.out.println("j = " + j);
            j++;
        }
        
        System.out.println("\nЦикл do...while: ");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 10);
        
        System.out.println("\n---2.2 Операторы continue и break---");
        
        System.out.println("\nОператор break: ");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Достигнуто 5 - выход из цикла");
                break;
            }
            System.out.println("i = " + i);
        }
 
        System.out.println("\nОператор continue: ");
        System.out.println("Четные числа:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) { 
                continue;
            }
            System.out.println(i);
        }
        
        System.out.println("\nКомбинация break и continue: ");
        int count = 0;
        while (true) {
            count++;
            if (count % 3 == 0) {
                System.out.println("Пропускаем числа, кратные 3");
                continue;
            }
            if (count > 13) {
                System.out.println("Достигнут предел - выход");
                break;
            }
            System.out.println("Число: " + count);
        }

        
        System.out.println("\n---2.3 Многомерный массив---");
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int rows = sc.nextInt();
        
        System.out.print("Введите количество столбцов: ");
        int cols = sc.nextInt();
       
        int[][] matrix = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            System.out.println("Строка " + (i + 1) + ":");
            for (int m = 0; m < cols; m++) {
                System.out.print("  Введите элемент [" + i + "][" + m + "]: ");
                matrix[i][m] = sc.nextInt();
            }
        }
        
        System.out.println("\nМатрица:");
        int sum1 = 0;
        for (int i = 0; i < rows; i++) {
            for (int m = 0; m < cols; m++) {
                System.out.print(matrix[i][m] + "\t");
                sum1 += matrix[i][m];
            }
            System.out.println();
        }
        System.out.println("Сумма всех элементов: " + sum1);
        sc.close();
    }
    
}
