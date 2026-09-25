package Jobsheet3.Tugas;

public class Tiket {
    
    private String judulFilm;
    private double hargaDasar;
    private boolean statusPembayaran;

    // Konstruktor dengan validasi harga
    public Tiket(String judulFilm, double hargaDasar) {
        this.judulFilm = judulFilm;
        
       if (hargaDasar < 0) {
            this.hargaDasar = 35000;
        } else {
            this.hargaDasar = hargaDasar;
        }
        this.statusPembayaran = false;
    }

    // Getter untuk membaca nilai (Read-Only)
    public String getJudulFilm() {
        return judulFilm;
    }

    public double getHargaDasar() {
        return hargaDasar;
    }

    // Getter untuk tipe boolean biasanya menggunakan awalan 'is'
    public boolean isStatusPembayaran() {
        return statusPembayaran;
    }

    // Catatan: TIDAK ADA SETTER untuk statusPembayaran demi keamanan transaksi

    // Method khusus untuk memproses pembayaran
    public void lakukanPembayaran() {
        this.statusPembayaran = true;
    }
}
