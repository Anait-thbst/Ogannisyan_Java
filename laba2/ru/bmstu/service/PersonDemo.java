package laba2.ru.bmstu.service;
import laba2.ru.bmstu.domain.Person;
import laba2.ru.bmstu.domain.Student;

public class PersonDemo {
    private Person person;

    public PersonDemo(Person person){
        this.person = person;
    }

    public void demo(){
        System.out.println("\n--- Демонстрация PersonPrinter ---");
        PersonPrinter.printFI(person);

        System.out.println("\nПолная информация о человеке:");
        PersonPrinter.printInfo(person);
    }
    
    public void demoDismiss(){
        System.out.println("\n--- Демонстрация Dismissable ---");
        StudentDismisser sDismisser = new StudentDismisser();
        if(person instanceof Student){
            System.out.println("Student dismiss:");
            sDismisser.dismiss(person);
        }
        else{
            System.out.println("Default dismiss:");
            Dismissable defDismissable = new Dismissable() {};
            defDismissable.dismiss(person);
        }
    }
}
