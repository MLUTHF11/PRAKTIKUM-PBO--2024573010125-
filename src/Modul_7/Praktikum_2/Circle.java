package Modul_7.Praktikum_2;

public class Circle extends Shape {
    private  double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    @Override
    public void draw(){
        System.out.println("Menggambar lingkaean dengan warna:"+ color +" dan radius"+ radius);
    }
    @Override
    public double calculatorArea(){
        double area = Math.PI * radius * radius;
        System.out.println("luas lingkaran"+ area);
        return area;
    }
    @Override
    public void displayInfo(){
        System.out.println("Lingkaran - warna:"+ color +",radius"+ radius);
    }
}
