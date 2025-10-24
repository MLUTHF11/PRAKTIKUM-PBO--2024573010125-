package Modul_5.Praktikum_1;

public class AccessModifierTest {
    public static void main(String[] args) {
        // Membuat objek Person
        Person person = new Person("Budi Santoso", 25);

        // Test akses public
        person.email = "budi@email.com"; // OK - public
        System.out.println("Email: " + person.email);

        // Test akses default (dalam package yang sama)
        person.alamat = "Jakarta"; // OK - dalam package yang sama
        System.out.println("Alamat: " + person.alamat);

        // Test akses protected (dalam package yang sama)
        person.telepon = "081234567890"; // OK - dalam package yang sama
        System.out.println("Telepon: " + person.telepon);

        // Test akses private - AKAN ERROR jika uncomment
        // person.nama = "Andi";         // ERROR - private
        // person.umur = 30;             // ERROR - private
        // person.metodePribadi();       // ERROR - private

        // Mengakses data private melalui public method (tampilkanInfo)
        System.out.println("\n--- Tampilkan Info Lengkap ---");
        person.tampilkanInfo();

        // Mengakses private method melalui public method (panggilMetodePribadi)
        System.out.println("\n--- Panggil Metode Private ---");
        person.panggilMetodePribadi();

        System.out.println("\nDEMONSTRASI ACCESS MODIFIER");
        System.out.println("✓ Public    : Bisa diakses");
        System.out.println("✓ Default   : Bisa diakses (dalam package sama)");
        System.out.println("✓ Protected : Bisa diakses (dalam package sama)");
        System.out.println("X Private   : TIDAK bisa diakses langsung");
    }
}
