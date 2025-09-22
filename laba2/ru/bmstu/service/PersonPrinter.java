package laba2.ru.bmstu.service;
import laba2.ru.bmstu.domain.Person;

public class PersonPrinter {

    public static void printFI(Person p){
        System.out.println("Имя, фамилия: " + p.getFirstName() + " " + p.getSecondName());
    }

    public static void printInfo(Person p){
        System.out.printf("Имя: %s ", p.getFirstName());
        System.out.printf(", Фамилия: %s ", p.getSecondName());
        System.out.printf(", Возраст: %d ", p.getAge());
        System.out.printf(", Номер телефона: %s ", p.getPhone() + ".\n");
    }   
}
