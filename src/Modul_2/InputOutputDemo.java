package Modul_2;

import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args){
        // membuat object scanner
        Scanner input = new Scanner(System.in);

        //membaca input string
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        //membaca input integer
        System.out.print("Masukkan umur Anda");
        int umur = input.nextInt();

        //membaca input double
        System.out.println("Masukkan tinggi anda (cm): ");
        double tinggi = input.nextInt();

        //menampilkan output
        System.out.println("\n === DATA ANDA ===");
        System.out.println("nama : "+nama);
        System.out.println("umur : "+umur + "tahun");
        System.out.println("tinggi: "+tinggi +"cm");

        //menutup Scanner
        input.close();
    }
}
