package laba2.ru.bmstu.service;
import laba2.ru.bmstu.domain.Person;

public interface Dismissable {
    default void dismiss(Person p){
        System.out.println("Имя, фамилия и номер телефона человека: " + p.getFirstName() + " " + p.getSecondName() +  " , " + p.getPhone());
    }
}
