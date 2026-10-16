package UTS;

public class Bangsal {
    private String nama;
    private Kamar[] daftarKamar;   
    private Dokter kepala;         
 
    public Bangsal(String nama, int jumlahKamar, int tarifPerMalam) {
        this.nama = nama;
        initKamar(jumlahKamar, tarifPerMalam);
    }
    
    // penambahan setter baru
     public void setKamar(int nomor, Kamar kamarBaru) {
        if (nomor < 1 || nomor > daftarKamar.length) {
            return;  
        }
        daftarKamar[nomor - 1] = kamarBaru;  
    }

    
    private void initKamar(int jumlahKamar, int tarifPerMalam) {
        daftarKamar = new Kamar[jumlahKamar];
        for (int i = 0; i < jumlahKamar; i++) {
            daftarKamar[i] = new Kamar(i + 1, tarifPerMalam);
        }
    }
 
    public void setKepala(Dokter kepala) { this.kepala = kepala; }
 
    public Kamar getKamar(int nomor) {
        if (nomor < 1 || nomor > daftarKamar.length) {
            return null;  
        }
        return daftarKamar[nomor - 1];
    }
 
    // overloading 1: kamar kosong pertama
    public boolean rawatInap(Pasien p) {
        if (p == null) {
            System.out.println("Pasien tidak boleh null.");
            return false;
        }
        for (Kamar k : daftarKamar) {
            if (k.isKosong()) {
                return k.isiPasien(p);
            }
        }
        System.out.println("Semua kamar penuh.");
        return false;
    }
 
    // overloading 2: kamar tertentu
    public boolean rawatInap(Pasien p, int nomorKamar) {
        if (p == null) {
            System.out.println("Pasien tidak boleh null.");
            return false;
        }
        Kamar k = getKamar(nomorKamar);
        if (k == null) {
            System.out.println("Kamar " + nomorKamar + " tidak ada.");
            return false;
        }
        if (!k.isiPasien(p)) {
            System.out.println("Kamar " + nomorKamar + " sudah terisi.");
            return false;
        }
        return true;
    }
 
    public void tampilInfo() {
        System.out.println("Bangsal " + nama);
        if (kepala != null) {
            System.out.println("Kepala : " + kepala.getNama() + " (" + kepala.getSpesialis() + ")");
        }
        for (Kamar k : daftarKamar) {
            String isi = k.isKosong() ? "kosong" : k.getPasien().getNama();
            System.out.println("Kamar " + k.getNomor() + " : " + isi);
        }
    }
}
 