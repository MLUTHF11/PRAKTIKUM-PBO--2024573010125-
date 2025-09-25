package Modul_2;

import java.util.Scanner;

public class NestedIfDemo {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan umur anda: ");
    int umur = input.nextInt();

    if (umur>=0) {
        if (umur <= 2) {
            System.out.println("kategori: Bayi");
        } else if (umur <= 5) {
            System.out.println("kategori: Balita");
        } else if (umur <= 12) {
            System.out.println("kategori: Anak-Anak ");
        } else if (umur <= 19) {
            System.out.println("kategori: Remaja ");
        } else if (umur <= 59) {
            System.out.println("kategori: Dewasa");
        }
    }else {
            System.out.println("kategori: Lansia");
        }

    input.close();
}
}
