package Modul_6.Praktikum_3;

public class Cat extends Mammal{
    private boolean isIndoor;

    public Cat(String name,String furcolor,boolean isIndoor){
        super(name,furcolor);
        this.isIndoor=isIndoor;
    }
    public void meow(){
        System.out.println(name+" is meowing : Meow meow!");
    }
    @Override
    public void eat(){
        System.out.println(name+" the cat is eating cat food.");
    }
}
