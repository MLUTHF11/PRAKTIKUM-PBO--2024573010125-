package Modul_6.Praktikum_2;

public class OverrideTest {
    public static void main(String[] args){
        Car car = new Car("Toyota",180,4);

        car.start();
        car.dispalyInfo();
        car.honk();

        Vehicle vechile = new Car("Honda",1000,2);
        vechile.start();
        vechile.dispalyInfo();
    }
}
