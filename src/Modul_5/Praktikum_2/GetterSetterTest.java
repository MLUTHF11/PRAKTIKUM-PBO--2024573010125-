package Modul_5.Praktikum_2;

public class GetterSetterTest {
    public static void main(String[] args) {
        System.out.println("TEST GETTER DAN SETTER\n");

        // Membuat object mahasiswa
        Mahasiswa mhs = new Mahasiswa("20230001", "Budi Santoso", "Teknik Informatika");
        System.out.println("--- Data Awal ---");
        mhs.tampilkanInfo();

        // //////////////////////////////////////////////////
        // Test GETTER
        // //////////////////////////////////////////////////
        System.out.println("\n--- TEST GETTER ---");
        System.out.println("Mengambil data menggunakan getter:");
        System.out.println("NPM      : " + mhs.getNpm());
        System.out.println("Nama     : " + mhs.getNama());
        System.out.println("Jurusan  : " + mhs.getJurusan());
        System.out.printf("IPK      : %.2f%n", mhs.getIpk());
        System.out.println("Semester : " + mhs.getSemester());
        System.out.println("Aktif    : " + mhs.isAktif());

        // //////////////////////////////////////////////////
        // Test SETTER dengan validasi
        // //////////////////////////////////////////////////
        System.out.println("\n--- TEST SETTER ---");

        // Test 1: Update IPK valid
        System.out.println("n1. Update IPK (valid):");
        mhs.setIpk(3.75);

        // Test 2: Update IPK invalid (akan ditolak)
        System.out.println("\nn2. Update IPK (invalid): Akan ditolak");
        mhs.setIpk(5.0);

        // Test 3: Update nama valid
        System.out.println("\nn3. Update Nama (valid):");
        mhs.setNama("Ahmad Budi Santoso");

        // Test 4: Update nama invalid (akan ditolak)
        System.out.println("\nn4. Update Nama (invalid - mengandung angka): Akan ditolak");
        mhs.setNama("Budi123");

        // Test 5: Update semester valid
        System.out.println("\nn5. Update Semester:");
        mhs.setSemester(5);

        // Test 6: Update semester invalid (akan ditolak)
        System.out.println("\nn6. Update Semester (invalid): Akan ditolak");
        mhs.setSemester(0);

        // Test 7: Update status
        System.out.println("\nn7. Update Status:");
        mhs.setAktif(false);

        // Tampilkan data akhir
        System.out.println("\n--- Data Setelah Update ---");
        mhs.tampilkanInfo();

        // //////////////////////////////////////////////////
        // Demonstrasi Computed Property
        // //////////////////////////////////////////////////
        // Metode private (getPredikat) dipanggil melalui metode public (tampilkanInfo)
        System.out.println("\n--- COMPUTED PROPERTY ---");
        System.out.println("Predikat : " + mhs.getPredikat()); // Error jika getPredikat() private!
        // Catatan: Jika getPredikat() diubah menjadi public di kelas Mahasiswa,
        // baris di atas akan berjalan. Dalam konteks kode Mahasiswa sebelumnya,
        // getPredikat() adalah private, sehingga baris ini akan menyebabkan error
        // kecuali Anda memanggil mhs.tampilkanInfo() yang mengaksesnya secara internal.
        // Asumsi di sini: getPredikat() diakses secara internal atau diubah menjadi public.

        // //////////////////////////////////////////////////
        // Tidak bisa akses langsung (akan error)
        // //////////////////////////////////////////////////
        System.out.println("\nCATATAN ENKAPSULASI:");
        // Baris-baris di bawah ini akan menyebabkan ERROR Kompilasi
        // karena field-field tersebut dideklarasikan sebagai private di kelas Mahasiswa.
        System.out.println("X TIDAK BISA: mhs.npm = \"123\";");
        System.out.println("X TIDAK BISA: mhs.ipk = 5.0;");
        System.out.println("X HANYA BISA: mhs.setIpk(5.0);");
        System.out.println("✓ VALIDASI otomatis dilakukan di setter!");
    }
}
