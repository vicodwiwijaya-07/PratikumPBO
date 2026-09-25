public class Mobil24 extends Kendaraan24 {
    private int jumlahPintu;
    private double kapasitasBagasi; // dalam liter

    public Mobil24 (String merk, int jumlahPintu, double kapasitasBagasi) {
        super(merk);
        this.jumlahPintu = jumlahPintu;
        this.kapasitasBagasi = kapasitasBagasi;
    }

    public void bukaBagasi() {
        System.out.println(merk + ": bagasi dibuka, kapasitas " + kapasitasBagasi + " liter");
    }

    public void nyalakanAC() {
        System.out.println(merk + ": AC dinyalakan, kabin mulai sejuk");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah Pintu     : " + jumlahPintu);
        System.out.println("Kapasitas Bagasi : " + kapasitasBagasi + " liter");
        System.out.println("Tipe Kendaraan   : Mobil");
    }
}