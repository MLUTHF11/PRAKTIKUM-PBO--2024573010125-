package Modul_1;

public class Emoji {
    public static void main(String[] args) {

        // ✅ Cara 1: Menulis langsung simbol (pastikan file disimpan UTF-8)
        System.out.println("✅ Operasi berhasil!");
        System.out.println("❌ Terjadi kesalahan!");
        System.out.println("⚠️ Peringatan: Stok menipis!");
        System.out.println("💰 Total penjualan hari ini: Rp 1.250.000");

        System.out.println("-------------------------------------");

        // ⚙️ Cara 2: Menggunakan Unicode escape
        // (Setiap emoji punya kode unik, misalnya ⚠️ = \u26A0)
        System.out.println("\u2705 Operasi berhasil (Unicode)");  // ✅
        System.out.println("\u274C Terjadi kesalahan (Unicode)"); // ❌
        System.out.println("\u26A0 Peringatan (Unicode)");         // ⚠
        System.out.println("\u1F4B0 Total penjualan (Unicode)");   // 💰
        System.out.println("\uD83C\uDFB6 Hasil sukses (Surrogate Pair)"); // 🎶
        // (kadang tidak muncul di semua font)
    }
}

