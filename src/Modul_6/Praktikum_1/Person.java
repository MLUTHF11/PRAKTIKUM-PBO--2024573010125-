package Modul_6.Praktikum_1;

public class Person {
    protected  String name;
    protected  int age ;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Name:" + name);
        System.out.println("age:"+age);
    }
    public void greet(){
        System.out.println("hello, iam a person");
    }
}

