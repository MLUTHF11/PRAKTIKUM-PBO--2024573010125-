package Modul_4;

public class RencanaKartuStudi {
    private Mahasiswa mahasiswa;
    private MataKuliah[] daftarMatakuliah;
    private int jumlahMatkul;
    private int maxMatkul;

    public RencanaKartuStudi(Mahasiswa mahasiswa, int maxMatkul) {
        this.mahasiswa = mahasiswa;
        this.maxMatkul = maxMatkul;
        this.jumlahMatkul = 0;
        this.daftarMatakuliah = new MataKuliah[maxMatkul];
    }

    // Menambah mata kuliah ke KRS
    public boolean tambahMatakuliah(MataKuliah matkul) {
        if (jumlahMatkul < maxMatkul) {
            daftarMatakuliah[jumlahMatkul++] = matkul;
            System.out.println("\nNote: Mata kuliah " + matkul.getNama() + " berhasil ditambahkan.");
            return true;
        } else {
            System.out.println("\nNote: KRS sudah penuh! Maksimal = " + maxMatkul + " mata kuliah.");
            return false;
        }
    }

    public boolean hapusMatakuliah(String kode) {
        for (int i = 0; i < jumlahMatkul; i++) {
            if (daftarMatakuliah[i].getKode().equalsIgnoreCase(kode)) {
                String namaMKHapus = daftarMatakuliah[i].getNama();

                for (int j = i; j < jumlahMatkul - 1; j++) {
                    daftarMatakuliah[j] = daftarMatakuliah[j + 1];
                }
                daftarMatakuliah[jumlahMatkul - 1] = null;
                jumlahMatkul--;
                System.out.println("Mata kuliah " + namaMKHapus + " (" + kode + ") berhasil dihapus dari KRS.");
                return true; // Berhasil dihapus
            }
        }
        return false; // Mata kuliah tidak ditemukan
    }


    // Menghitung total SKS
    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMatkul; i++) {
            totalSKS += daftarMatakuliah[i].getSks();
        }
        return totalSKS;
    }

    // Menghitung IPK
    public double hitungIPK() {
        if (jumlahMatkul == 0) return 0.0;

        double totalBobot = 0.0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMatkul; i++) {
            MataKuliah mk = daftarMatakuliah[i];
            totalBobot += mk.getBobotNilai() * mk.getSks();
            totalSKS += mk.getSks();
        }

        return totalSKS == 0 ? 0.0 : totalBobot / totalSKS;
    }

    // Menampilkan KRS
    public void tampilkanKRS() {
        System.out.println("-------------------------------------------------");
        System.out.println("           KARTU RENCANA STUDI (KRS)             ");
        System.out.println("-------------------------------------------------");
        System.out.println("Nama Mahasiswa : " + mahasiswa.getNama());
        System.out.println("NIM            : " + mahasiswa.getNim());
        System.out.println("Jurusan        : " + mahasiswa.getJurusan());
        System.out.println("-------------------------------------------------");
        System.out.println("KODE      MATA KULIAH                 SKS   NILAI");
        System.out.println("-------------------------------------------------");

        if (jumlahMatkul == 0) {
            System.out.println("Belum ada mata kuliah yang diambil!");
        } else {
            for (int i = 0; i < jumlahMatkul; i++) {
                daftarMatakuliah[i].tampilkanInfo();
            }
        }

        System.out.println("-------------------------------------------------");
        System.out.println("Total SKS      : " + hitungTotalSKS());
        System.out.printf("IP Semester    : %.2f%n", hitungIPK());
        System.out.println("-------------------------------------------------");
        System.out.println("");
    }
    public MataKuliah cariMataKuliah(String kode){
        for(int i = 0; i < jumlahMatkul; i++ ){
            if(daftarMatakuliah[i].getKode().equalsIgnoreCase(kode)){
                return daftarMatakuliah[i];
            }
        }
        return null;
    }

}
