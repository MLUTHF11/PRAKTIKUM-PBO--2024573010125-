package Modul_7.Praktikum_2;

public class Shape {
    protected String color;

    public Shape(String color){
        this.color=color;
    }

    public void draw(){
        System.out.println("Menggambar shape dengan warna");
    }
    public double calculatorArea(){
        System.out.println("Menghitung luas shape umum");
        return 0.0;
    }

    public void displayInfo(){
        System.out.println("Shape-warna" + color );
    }
}
