package Modul_2;

import java.util.Scanner;

public class GradeDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai dari 1-100 : ");
        int nilai = input.nextInt();

        char grade;
        String keterangan;

        //mengecek nilai huruf menggunakan if else
        if(nilai>=85){
            grade = 'A';
            keterangan ="Excellent";
        } else if (nilai>=75) {
            grade ='B';
            keterangan ="Good";
        } else if (nilai>=65) {
            grade ='C';
            keterangan ="Faie";
        } else if (nilai>= 55) {
            grade ='D';
            keterangan ="Poor";
        } else {
            grade ='E';
            keterangan ="Fail";
        }
        System.out.println("nilai: "+ nilai);
        System.out.println("Grade : "+grade);
        System.out.println("Keterangan : "+keterangan);

        input.close();
    }
}
