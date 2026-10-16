package UTS;

public class PasienBPJS extends Pasien {
    private String noBPJS;

    public PasienBPJS(String noRM, String nama, int lamaInap, String noBPJS) {
        super(noRM, nama, lamaInap);
        this.noBPJS = noBPJS;
    }

    public String getNoBPJS() { return noBPJS; }

    @Override
    public int hitungBiaya(int tarifPerMalam) {
        return super.hitungBiaya(tarifPerMalam) * 10 / 100;   
    }

    @Override
    public String getJenis() { return "BPJS"; }
}
