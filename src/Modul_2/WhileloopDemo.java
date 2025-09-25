package Modul_2;

import java.util.Scanner;

public class WhileloopDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("=== WHILE LOOP - Tebak Angka ");
        int angkarahasia =7;
        int tebakan =0;

        while(tebakan!=angkarahasia){
            System.out.print("Tebak angka (1-10): ");
            tebakan = input.nextInt();

            if (tebakan<angkarahasia){
                System.out.println("terlalu kecil!");
            } else if (tebakan>angkarahasia) {
                System.out.println("terlalu besar");
            }else {
                System.out.println("Benar!! Angka rahasianya adalah "+ angkarahasia);
            }
        }
        //contoh do while
        System.out.println("\n=== DO-While Loop - Menu ===");
        int pilihan;

        do {
            System.out.println("\n1.Tampilkan pesan");
            System.out.println("2.Hitung FaktoriaL");
            System.out.println("3.KELUAR");
            System.out.println("pilih menu: ");
            pilihan = input.nextInt();

            switch(pilihan){
                case 1:
                    System.out.println("HELLO WORLD");
                    break;
                case 2:
                    System.out.println("masukkan angka: ");
                    int n = input.nextInt();
                    long faktorial = 1;
                    for (int i=1;i<=n;i++){
                        faktorial *=i;
                    }
                    System.out.println("Faktorial" + n + "=" +faktorial);
                    break;
                case 3:
                    System.out.println("terima kasih");
                    break;
                default:
                    System.out.println("pilihan tidak sesuai");
            }
        }while(pilihan!=3);
        input.close();
    }
}
