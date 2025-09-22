package laba2.ru.bmstu;
import laba2.ru.bmstu.domain.Person;
import laba2.ru.bmstu.domain.Student;
import laba2.ru.bmstu.service.PersonDemo;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Александрина","Соколова" , 20, "+79856472311");
        Student student = new Student("Маргарита", "Денисова", 18, "+79151091514", "ИУК5-51Б", 1);
        
        Person student2 = new Student("Виктория", "Сахатова", 22, "+79498857164", "ИУК2-22Б", 4);

        System.out.println("=== ДЕМОНСТРАЦИЯ ДЛЯ PERSON ===");
        PersonDemo personDemo = new PersonDemo(person);
        personDemo.demo();
        personDemo.demoDismiss();

        System.out.println("\n=== ДЕМОНСТРАЦИЯ ДЛЯ STUDENT ===");
        PersonDemo personDemo2 = new PersonDemo(student);
        personDemo2.demoDismiss();

        PersonDemo personDemo3 = new PersonDemo(student2);
        personDemo3.demo();
        personDemo3.demoDismiss();
    }

}
