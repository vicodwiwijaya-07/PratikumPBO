public class Hp24 {
    private String merk;
    private int kapasitasBaterai; 

    public Hp24 (String merk, int kapasitasBaterai) {
        this.merk = merk;
        this.kapasitasBaterai = kapasitasBaterai;
    }

    public void menelepon(String nomor) {
        if (kapasitasBaterai <= 0) {
            System.out.println("Baterai habis, tidak bisa menelepon.");
            return;
        }
        kapasitasBaterai -= 10;
        if (kapasitasBaterai < 0) kapasitasBaterai = 0;
        System.out.println("Menelepon ke " + nomor + " (sisa baterai " + kapasitasBaterai + "%)");
    }

    public void mengisiDaya(int tambahan) {
        kapasitasBaterai += tambahan;
        if (kapasitasBaterai > 100) kapasitasBaterai = 100;
        System.out.println("Mengisi daya, baterai sekarang " + kapasitasBaterai + "%");
    }

    public void cetakInfo() {
        System.out.println("Merk              : " + merk);
        System.out.println("Kapasitas Baterai : " + kapasitasBaterai + "%");
    }
}