package Modul_6.Praktikum_2;

public class Vehicle {
    protected String brand;
    protected  int speed;

    public Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }
    public void start(){
        System.out.println("Vechile is strating....");
    }
    public void dispalyInfo(){
        System.out.println("brand:"+brand);
        System.out.println("speed:"+ speed + "Km/h");
    }
}
