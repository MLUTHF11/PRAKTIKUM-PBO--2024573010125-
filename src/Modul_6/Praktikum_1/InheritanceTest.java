package Modul_6.Praktikum_1;

public class InheritanceTest {
    public static void main(String[] args){
        Student student = new Student("alice",20,"178273");

        // method superclass
        student.displayInfo();

        //method subclass
        student.study();
        // memanggil override method
        student.greet();

        // polymorphism: Student sebagai person
        Person person = new Student("BOB",22,"3235236");
        person.greet();
    }
}
