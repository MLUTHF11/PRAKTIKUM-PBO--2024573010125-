package Modul_2;

import java.awt.*;
import java.util.Scanner;

public class MenuDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU PILIHAN ===");
        System.out.println("1.Hitung Luas Persegi");
        System.out.println("2.Hitung Luas Lingkaran");
        System.out.println("3.Hitung Luas Segitiga");
        System.out.println("4.keluar");

        System.out.print("Pilih menu");
        int pilihan = input.nextInt();

        switch (pilihan){
            case 1:
                System.out.print("masukkan sisi persegi");
                double sisi = input.nextDouble();
                double luaspersegi = sisi * sisi;
                System.out.println("Luas Persegi = "+luaspersegi);
                break;

            case 2:
                System.out.print("masukkan jari jari lingkaran");
                double jarijari = input.nextDouble();
                double luaslingkaran = Math.PI * jarijari * jarijari;
                System.out.println("Luas Lingkaran = "+luaslingkaran);
                break;

            case 3 :
                System.out.print("masukkan alas segitiga");
                double alas = input.nextDouble();
                System.out.print("masukkan tinggi segitiga");
                double tinggi = input.nextDouble();
                double luasSegitiga = 0.5*alas * tinggi;
                System.out.println("Luas Segitiga = "+luasSegitiga);
                break;

                case 4 :
                    System.out.println("TERIMA KASIH :)");
                    break;
            default:
                System.out.println("Pilihan Tidak Valid!!!");
        }
        input.close();
    }
}
