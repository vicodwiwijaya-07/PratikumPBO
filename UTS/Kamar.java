package UTS;

public class Kamar {
    private int nomor;
    private int tarifPerMalam;
    private Pasien pasien;   

    public Kamar(int nomor, int tarifPerMalam) {
        this.nomor = nomor;
        this.tarifPerMalam = tarifPerMalam;
    }

    
    public boolean isiPasien(Pasien pasien) {
        if (pasien == null || !isKosong()) {
            return false;
        }
        this.pasien = pasien;
        return true;
    }

    public Pasien getPasien() { return pasien; }
    public boolean isKosong() { return pasien == null; }
    public int getNomor() { return nomor; }
    public int getTarifPerMalam() { return tarifPerMalam; }
}
