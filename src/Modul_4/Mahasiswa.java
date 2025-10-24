package Modul_4;


public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;

    //constructur dengan parameter
    public Mahasiswa(String nama, String npm, String jurusan, double ipk){
        this.nama = nama;
        this.nim = npm;
        this.jurusan = jurusan;
    }

    //Gether methods
    public String getNama(){
        return nama;
    }

    public String getNim(){
        return nim;
    }

    public String getJurusan(){
        return jurusan;
    }
}
