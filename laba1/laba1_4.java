package laba1;

public class laba1_4 {
    public static void main(String[] args) {
        String text = "   Меня зовут Оганнисян Анаит и я студент группы ИУК5-51Б   ";
        System.out.println("Исходная строка: '" + text + "'");
   
        System.out.println("\nЗамена в строке:");
        String replaced = text.replace("Анаит", "Тиана");
        System.out.println("После replace: '" + replaced + "'");
        
        System.out.println("\nОбрезка пробелов:");
        String trimmed = text.trim();
        System.out.println("После trim: '" + trimmed + "'");
        
        System.out.println("\nОбрезка подстроки:");
        String substring1 = text.substring(31); // с 10-го символа до конца
        String substring2 = text.substring(3, 29); // с 10-го по 25-й символ
        System.out.println("substring(31): '" + substring1 + "'");
        System.out.println("substring(3, 29): '" + substring2 + "'");
        
        System.out.println("\nРазбиение строки на подстроки:");
        String csv = " Prada, Chanel, Dior, Kenzo, Maison Margiela ";
        String[] MHouse = csv.split(",");
        System.out.println("Разбиение по запятой:");
        System.out.println("\tМодные дома:");
        for (int i = 0; i < MHouse.length; i++) {
            System.out.println("\t"+MHouse[i]);
        }
       
        System.out.println("\n---Сравнение строк---");
        
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = "HELLO";
        String str5 = "World";
        
        System.out.println("str1 = '" + str1 + "'");
        System.out.println("str2 = '" + str2 + "'");
        System.out.println("str3 = new String('" + str3 + "')");
        System.out.println("str4 = '" + str4 + "'");
        System.out.println("str5 = '" + str5 + "'");
        
        System.out.println("\nСравнение через '==':");
        System.out.println("str1 == str2: " + (str1 == str2)); 
        System.out.println("str1 == str3: " + (str1 == str3)); 
        System.out.println("str1 == str4: " + (str1 == str4)); 
        
        System.out.println("\nСравнение через equals():");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); 
        System.out.println("str1.equals(str3): " + str1.equals(str3)); 
        System.out.println("str1.equals(str4): " + str1.equals(str4)); 
        System.out.println("str1.equals(str5): " + str1.equals(str5)); 

        System.out.println("\nСравнение через equalsIgnoreCase():");
        System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4)); 
        System.out.println("str4.equalsIgnoreCase(str1): " + str4.equalsIgnoreCase(str1)); 
        
        System.out.println("\n---StringBuilder---");
       
        StringBuilder sb = new StringBuilder();
        System.out.println("Исходный StringBuilder: '" + sb.toString() + "'");
        System.out.println("Длина: " + sb.length() + ", Емкость: " + sb.capacity());
     
        System.out.println("\nКонкатенация строк:");
        sb.append("Anait");
        sb.append(" ");
        sb.append("is");
        sb.append(" ");
        sb.append("student!");
        
        System.out.println("После конкатенации: '" + sb.toString() + "'");
        System.out.println("Длина: " + sb.length() + ", Емкость: " + sb.capacity());
        
        System.out.println("\nОбрезка строки:");
        sb.delete(10, 20); 
        System.out.println("После delete: '" + sb.toString() + "'");
        
        sb.setLength(5); 
        System.out.println("После setLength(5): '" + sb.toString() + "'");
        
        System.out.println("\nОчистка StringBuilder:");
        sb.setLength(0); 
        System.out.println("После очистки: '" + sb.toString() + "'");
        System.out.println("Длина: " + sb.length() + ", Емкость: " + sb.capacity());
    }
    
}
