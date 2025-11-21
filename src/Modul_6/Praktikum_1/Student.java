package Modul_6.Praktikum_1;

public class Student extends Person {
    private String StudenId;

    public Student(String name, int age, String StudentId){
        super(name,age);
        this.StudenId = StudentId;
    }
    public void study(){
        System.out.println(name + "is studying.");
    }
    @Override
    public void greet(){
        System.out.println("hello, i am student named"+ name);
    }
}
