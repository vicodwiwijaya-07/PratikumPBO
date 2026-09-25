package Kuis;

public class Skripsi {
    private String judul;
    private String namaMahasiswa;
    private Dosen pembimbing1;
    private Dosen pembimbing2;

    public Skripsi(String judul, String namaMahasiswa, Dosen pembimbing1) {
        this.judul = judul;
        this.namaMahasiswa = namaMahasiswa;
        this.pembimbing1 = pembimbing1;
        this.pembimbing2 = null;
    }

    public Skripsi(String judul, String namaMahasiswa, Dosen pembimbing1, Dosen pembimbing2) {
        this.judul = judul;
        this.namaMahasiswa = namaMahasiswa;
        this.pembimbing1 = pembimbing1;

        if (pembimbing1 != null && pembimbing1 == pembimbing2) {
            System.out.println("Pembimbing 2 tidak boleh sama dengan Pembimbing 1");
            this.pembimbing2 = null;
        } else {
            this.pembimbing2 = pembimbing2;
        }
    }

    public Dosen getPembimbing1() {
        return pembimbing1;
    }

    public void setPembimbing1(Dosen pembimbing1) {
        this.pembimbing1 = pembimbing1;
    }

    public Dosen getPembimbing2() {
        return pembimbing2;
    }

    public void setPembimbing2(Dosen pembimbing2) {
        if (this.pembimbing1 != null && this.pembimbing1 == pembimbing2) {
            System.out.println("Pembimbing 2 tidak boleh sama dengan Pembimbing 1");
        } else {
            this.pembimbing2 = pembimbing2;
        }
    }

    public String info() {
        String info = "Judul: " + judul + "\n" +
                "Mahasiswa: " + namaMahasiswa + "\n" +
                "Pembimbing 1: " + pembimbing1.info() + "\n";
        if (pembimbing2 != null) {
            info += "Pembimbing 2: " + pembimbing2.info();
        } else {
            info += "Pembimbing 2: -";
        }
        return info;
    }

}
