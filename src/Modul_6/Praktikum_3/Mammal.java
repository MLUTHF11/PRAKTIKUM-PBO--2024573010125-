package Modul_6.Praktikum_3;

public class Mammal extends Animal {
    protected String furColor;

    public Mammal(String name,String furColor){
        super(name);
        this.furColor = furColor;
    }

    public void giveBirth(){
        System.out.println(name + " is giving birth to live young");
        }
}
