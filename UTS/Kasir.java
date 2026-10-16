package UTS;

public class Kasir {
    private String nama;

    public Kasir(String nama) { this.nama = nama; }

    
    public void cetakTagihan(Kamar kamar) {
        if (kamar == null) {
            System.out.println("Kamar tidak ditemukan, tidak ada tagihan.");
            return;
        }
        if (kamar.isKosong()) {
            System.out.println("Kamar " + kamar.getNomor() + " kosong, tidak ada tagihan.");
            return;
        }
        Pasien p = kamar.getPasien();
        Dokter d = p.getDpjp();
        String dpjp = (d == null) ? "-" : d.getNama() + " (" + d.getSpesialis() + ")";
       

        System.out.println("=== Tagihan Kamar " + kamar.getNomor() + " ===");
        System.out.println("Pasien    : " + p.getNama() + " (" + p.getNoRM() + ") - " + p.getJenis());
        System.out.println("DPJP      : " + dpjp);
        System.out.println("Lama Inap : " + p.getLamaInap() + " malam");
        System.out.println("Total     : " + p.hitungBiaya(kamar.getTarifPerMalam()));
    }
}