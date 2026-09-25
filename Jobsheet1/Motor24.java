public class Motor24 extends Kendaraan24 {
    private String jenisRem;
    private int kapasitasMesin; 

    public Motor24 (String merk, String jenisRem, int kapasitasMesin) {
        super(merk);
        this.jenisRem = jenisRem;
        this.kapasitasMesin = kapasitasMesin;
    }

    public void nyalakanMesin() {
        System.out.println(merk + ": mesin motor dinyalakan, brum brum!");
    }

    public void bunyikanKlakson() {
        System.out.println(merk + ": membunyikan klakson - Tin tin!");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jenis Rem       : " + jenisRem);
        System.out.println("Kapasitas Mesin : " + kapasitasMesin + " cc");
        System.out.println("Tipe Kendaraan  : Motor");
    }
}