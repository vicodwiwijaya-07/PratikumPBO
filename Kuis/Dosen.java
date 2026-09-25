package Kuis;
public class Dosen {
    private String nidn;
    private String nama;

    public Dosen(String nidn, String nama) {
        this.nidn = nidn;
        this.nama = nama;
    }

    public String getNidn() {
        return nidn;
    }

    public String getNama() {
        return nama;
    }

    public String info() {
        return nidn + " - " + nama;
    }
}