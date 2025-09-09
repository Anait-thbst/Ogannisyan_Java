package laba1;
import java.util.Scanner;
public class laba1_1 {
   
    public static void main(String[] args) {
        System.out.println("---1.1 Операторы условия if/else if/else с разным количеством операндов---");
            
        System.out.println("\nДва операнда: ");
        int a = 15, b = 6;
        if (a > b && a % 5 == 0) {
            System.out.println("число a больше числа b И a делится на 5");
        } else {
            System.out.println("условие не выполнено");
        }
            
        System.out.println("\nТри операнда: ");
        int x = 8, y = 22, z = 15;
        if (x > y || x > z) {
        System.out.println("число x больше числа y или число x больше числа z");
        } else if (y > z && y % 2 == 0) {
            System.out.println("число y больше числа z И число y четное");
        } else {
            System.out.println("Все приведенные условия неверные");
        }
            
        System.out.println("\nЧетыре операнда: ");
        int n1 = 15, n2 = 8, n3 = 20, n4 = 10;
        if ((n1 > n2 && n1 < n3) || (n4 % 2 == 0)) {
            System.out.println("n1 находится между n2 и n3 или n4 четное");
        } else if (n2 > n3 && n2 > n4) {
            System.out.println("n2 больше n3 и n4");
        } else if (n3 > n4 || n1 < n2) {
            System.out.println("n3 больше n4 или n1 меньше n2");
        } else {
            System.out.println("Все приведенные условия неверные");
        }
    


        System.out.println("\n---1.2 Конструкция switch/case---");
            
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя (Meri, Victoria или Maria): ");
        
        String name = sc.nextLine().trim();
        
        System.out.println("\nРезультат: ");
        
        switch (name) {
            case "Meri":
                System.out.println("Meri, вы приглашены на день рождения 28.07.2025");
                break;
                
            case "Victoria":
                System.out.println("Victoria, жду вас на празднике 28.07.2025");
                break;
                
            case "Maria":
                System.out.println("Maria, здравствуйте, к сожалению, вас нет в списке гостей праздника");
                break;
                
            default:
                System.out.println("Извините, имя '" + name + "' не найдено в списке.");
                System.out.println("Пожалуйста, выберите одно из: Meri, Victoria или Maria");
                break;
        }
        
        sc.close();


        System.out.println("\n---1.3 Тернарный оператор---");
            
        int number = 34;
        String result = (number % 2 == 0) ? "четное" : "нечетное";
        System.out.println("Число " + number + " " + result); 
           
    }
    
}
