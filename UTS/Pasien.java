package UTS;



public class Pasien {
    protected String noRM;
    protected String nama;
    protected int lamaInap;
    private Dokter dpjp;   

    public Pasien(String noRM, String nama, int lamaInap) {
        this.noRM = noRM;
        this.nama = nama;
        this.lamaInap = lamaInap;
    }

    public void setDpjp(Dokter dpjp) { this.dpjp = dpjp; }
    public Dokter getDpjp() { return dpjp; }

    public String getNoRM() { return noRM; }
    public String getNama() { return nama; }
    public int getLamaInap() { return lamaInap; }

    
    public int hitungBiaya(int tarifPerMalam) {
        return tarifPerMalam * lamaInap;
    }

    public String getJenis() { return "Pasien"; }
}