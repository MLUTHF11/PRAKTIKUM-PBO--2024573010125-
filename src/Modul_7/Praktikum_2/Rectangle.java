package Modul_7.Praktikum_2;

public class Rectangle extends  Shape {
    private double widht;
    private double height;

    public Rectangle(String color, double widht,double height){
        super(color);
        this.widht= widht;
        this.height=height;
    }
    @Override
    public void draw(){
        System.out.println("Menggambar persegi panjang dengan warna:"+ color +",lebar:"+widht+",tinggi"+height);
    }
    @Override
    public double calculatorArea(){
        double area = widht + height;
        System.out.println("Luas persegi panjang:"+area);
        return area;
    }

    @Override
    public void displayInfo(){
        System.out.println("persegi panjang - warna :"+ color + ",lebar: "+widht+",tinggi:"+height);
    }
}
