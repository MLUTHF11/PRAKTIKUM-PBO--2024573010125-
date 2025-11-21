package Modul_7.Praktikum_2;

public class PolymorphismTest {
    public static void main(String[] args){
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("merah",5.0);
        shapes[1] = new Rectangle("merah",5.0,6.0);
        shapes[2] = new Triangle("merah",3.0,4.0);

        System.out.println("___ POLIMORFISME RUNTIME ___ ");
        for(Shape shape : shapes){
            shape.draw();
            shape.calculatorArea();
            shape.displayInfo();
            System.out.println();
        }
        System.out.println("___ INDIVIDUAL OBJECTS ___");
        Shape shape1= new Circle("Kuning",7.0);
        Shape shape2 = new Rectangle("ungu",5.8,8.0);

        shape1.draw();
        shape2.draw();

        System.out.println("\n--- TYPE CHECKING ---");
        for (Shape shape: shapes){
            if(shape instanceof Circle){
                Circle circle = (Circle) shape;
                System.out.println("ini adalah Circle dengan radius: "+ circle.calculatorArea());
            } else if (shape instanceof  Rectangle) {
                Rectangle rectangle=(Rectangle) shape;
                System.out.println("Ini adalah Rectangle dengan luas: "+ rectangle.calculatorArea());
            } else if (shape instanceof  Triangle) {
                Triangle triangle=(Triangle) shape;
                System.out.println("Ini adalah Triangle dengan luas: "+ triangle.calculatorArea());

            }
        }
    }
}
