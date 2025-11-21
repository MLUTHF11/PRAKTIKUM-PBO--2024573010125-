package Modul_6.Praktikum_3;

public class Dog extends Mammal{
    private String breed;

    public Dog(String name, String furColor, String breed){
        super(name, furColor);
        this.breed= breed;
    }
    public void bark(){
        System.out.println(name+ "is barking: Woof Woof!");
    }
    @Override
    public void eat(){
        System.out.println(name+" the dog is eating dog food");
    }
}
