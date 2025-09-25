package Modul_2;

public class ForLoopDemo {
    public static void main(String[] args){
        //contoh 1: Menampilkan angka 1-10
        System.out.println("===Angka 1-10===");
        for (int i=1;i<=10;i++){
            System.out.print(i + " ");
        }
        System.out.println("\n===Angka 2-20===");
        for (int i=2;i<=20;i+=2) {
            System.out.print(i + " ");
        }
        System.out.println("\n=== Contdown ===");
        for (int i=10;i>=1;i--) {
            System.out.print(i + " ");
        }
        System.out.println("START");

        System.out.println("\n=== Table Perkalian Lima ===");
        for (int i =1; i<=10;i++){
            System.out.println(" 5 x "+i+"=" + (5*i));
        }
    }
}
