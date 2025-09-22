package laba2.ru.bmstu.service;
import laba2.ru.bmstu.domain.Person;
import laba2.ru.bmstu.domain.Student;

public class StudentDismisser implements Dismissable {
    @Override
    public void dismiss(Person p){
        if(p instanceof Student){
            Student student  = (Student) p;
            System.out.println("--- Полная информация о студенте ---");
            System.out.println("Имя: " + student.getFirstName());
            System.out.println("Фамилия: " + student.getSecondName());
            System.out.println("Возраст: " + student.getAge() + " лет");
            System.out.println("Группа: " + student.getGroup());
            System.out.println("Курс: " + student.getCourse());
            System.out.println("Номер телефона: " + student.getPhone()); 
        }
    }  

}
