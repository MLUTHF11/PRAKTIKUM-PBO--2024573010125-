package Modul_5.Praktikum_2;

public class Mahasiswa {

    // Private Fields (Data)
    private String npm;
    private String nama;
    private String jurusan;
    private double ipk;
    private int semester;
    private boolean aktif;

    // Constructor
    public Mahasiswa(String npm, String nama, String jurusan) {
        this.npm = npm;
        this.nama = nama;
        this.jurusan = jurusan;
        this.ipk = 0.0;
        this.semester = 1;
        this.aktif = true;
    }

    // //////////////////////////////////////////////////
    // GETTER METHODS
    // //////////////////////////////////////////////////

    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public double getIpk() {
        return ipk;
    }

    public int getSemester() {
        // Asumsi semester diubah menjadi "10" prefix
        return semester;
    }

    public boolean isAktif() {
        return aktif;
    }

    // //////////////////////////////////////////////////
    // SETTER METHODS (dengan validasi)
    // //////////////////////////////////////////////////

    // Note: npm, ipk tidak dibuat setter karena dianggap data yang sudah baku
    // dan hanya diinisialisasi di constructor atau melalui metode khusus

    public void setNama(String nama) {
        // Validasi: Nama hanya huruf dan spasi, dimulai huruf kapital
        if (nama.matches("^[A-Z][a-zA-Z\\s]*$")) {
            this.nama = nama;
            System.out.println("NAMA Berhasil diubah menjadi: " + nama);
        } else {
            System.out.println("ERROR: Nama harus dimulai huruf dan spasi!");
        }
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
        System.out.println("Jurusan berhasil diubah menjadi: " + jurusan);
    }

    public void setIpk(double ipk) {
        // Validasi: IPK harus antara 0.0 sampai 4.0
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
            System.out.printf("IPK berhasil diubah menjadi: %.2f%n", ipk);
        } else {
            System.out.println("ERROR: IPK harus antara 0.0 - 4.0!");
        }
    }

    public void setSemester(int semester) {
        // Validasi: semester tidak boleh kurang dari 1
        if (semester >= 1) {
            this.semester = semester;
            System.out.println("Semester berhasil diubah menjadi: " + semester);
        } else {
            System.out.println("ERROR: Semester harus setara atau lebih dari 1!");
        }
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
        String status = aktif ? "AKTIF" : "TIDAK AKTIF";
        System.out.println("Status keaktifan: " + status);
    }

    // //////////////////////////////////////////////////
    // PRIVATE METHOD (Logika Tambahan)
    // //////////////////////////////////////////////////

    // Metode private untuk memberikan predikat berdasarkan IPK
    public String getPredikat() {
        if (ipk >= 3.5) {
            return "Cum Laude (Sangat Baik)";
        } else if (ipk >= 3.0) {
            return "Dengan Pujian (Baik)";
        } else if (ipk >= 2.5) {
            return "Cukup";
        } else {
            return "Kurang";
        }
    }

    // //////////////////////////////////////////////////
    // PUBLIC METHOD (Tampilan Info)
    // //////////////////////////////////////////////////

    public void tampilkanInfo() {
        System.out.println("---------- DATA MAHASISWA ----------");
        System.out.println("NPM      : " + npm);
        System.out.println("Nama     : " + nama);
        System.out.println("Jurusan  : " + jurusan);
        System.out.printf("IPK      : %.2f%n", ipk);
        System.out.println("Predikat : " + getPredikat());
        System.out.println("Semester : " + semester);
        System.out.println("Status   : " + (aktif ? "AKTIF" : "TIDAK AKTIF"));
        System.out.println("------------------------------------");
    }
}

