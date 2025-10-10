package Modul_3;

public class Latihan1 {
    //Fungsi Nilai rata-rata siswa
    public static double hitungRata_rata(int[] data) {
        int total = 0;
        for (int nilai : data) {
            total += nilai;
        }
        return (double) total / data.length;
    }
    //Fungsi Nilai Tertinggi
    public static int nilaiTertinggi(int[] data){
        int max = data[0];
        for (int nilai : data){
            if (nilai > max){
                max = nilai;
            }
        }
        return  max;
    }
    //Fungsi Nilai Terendah
    public static int nilaiTerendah(int[] data){
        int min = data[0];
        for (int nilai : data){
            if (nilai < min){
                min = nilai;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        //Memberi Nilai Ke Array
        String[] nama_siswa = {"Sukarno", "Suharto", "Habiebie", "Agus", "Wati", "Susilo", "Jecko", "Bro Wo"};
        int[] nilai_siswa = {94, 92, 98, 96, 86, 93, 99, 100};

        //Menampilkan data
        double rata = hitungRata_rata(nilai_siswa);
        int tertiggi = nilaiTertinggi(nilai_siswa);
        int terendah = nilaiTerendah(nilai_siswa);

        System.out.println("\nRata-rata Nilai Siswa Adalah: "+ rata);
        System.out.println("\nNilai Tertinggi Adalah: "+ tertiggi);
        System.out.println("\nNilai Terendah Adalah: "+ terendah);
    }

}
