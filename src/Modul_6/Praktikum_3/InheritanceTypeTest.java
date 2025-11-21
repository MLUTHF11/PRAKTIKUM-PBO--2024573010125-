package Modul_6.Praktikum_3;

public class InheritanceTypeTest {
    public static  void main(String[] args) {
        Dog dog = new Dog("Buddy", "Brown", "Golden Retviered");
        dog.eat();
        dog.sleep();
        dog.giveBirth();
        dog.bark();

        System.out.println();

        Cat cat = new Cat("Whitetaker", "white", true);
        cat.eat();
        cat.sleep();
        cat.giveBirth();
        cat.meow();

        System.out.println();

        Animal[] animals = {new Dog("Max","Black","labrador"),
                new Cat ("Luna","Gray",false)};

        for (Animal animal : animals){
            animal.eat();
        }
    }
}
