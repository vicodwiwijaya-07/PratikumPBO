package Jobsheet3.Tugas;

public class Kontainer {
    // 1. Atribut diset private (menyembunyikan state internal)
    private String nomorResi;
    private String namaPemilik;
    private double kapasitasMaksimal;
    private double beratMuatanSaatIni;

    // 2. Konstruktor untuk inisialisasi nilai awal
    public Kontainer(String nomorResi, String namaPemilik, double kapasitasMaksimal) {
        this.nomorResi = nomorResi;
        this.namaPemilik = namaPemilik;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.beratMuatanSaatIni = 0; // Saat kontainer dibuat, muatan selalu 0
    }

    // 3. Method Getter untuk mengambil (membaca) nilai atribut
    public String getNomorResi() {
        return nomorResi;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public double getBeratMuatanSaatIni() {
        return beratMuatanSaatIni;
    }

    // 4. Method untuk menambah muatan dengan validasi maksimal kapasitas
    public void tambahMuatan(double berat) {
        if (this.beratMuatanSaatIni + berat > this.kapasitasMaksimal) {
            System.out.println("Maaf, berat muatan melebihi kapasitas maksimal kontainer.");
        } else {
            this.beratMuatanSaatIni += berat;
        }
    }

    // // 5. Method untuk menurunkan (membongkar) muatan
    // public void turunkanMuatan(double berat) {
    //     if (berat <= this.beratMuatanSaatIni) {
    //         this.beratMuatanSaatIni -= berat;
    //     } else {
    //         System.out.println("Maaf, muatan yang dibongkar melebihi muatan yang ada!");
    //     }
    // }

    // Modifikasi Method untuk menurunkan (membongkar) muatan dengan batasan 50%
    public void turunkanMuatan(double berat) {
        double batasMaksimalBongkar = this.beratMuatanSaatIni * 0.5;

        
        if (berat > batasMaksimalBongkar) {
            System.out.println("Maaf, demi keselamatan, pembongkaran muatan satu kali jalan tidak boleh melebihi 50% dari muatan saat ini!");
        } else {
            this.beratMuatanSaatIni -= berat;
        }
    }
}