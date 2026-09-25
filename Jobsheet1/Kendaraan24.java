public class Kendaraan24 {
    protected String merk;
    protected int kecepatan;

    public Kendaraan24 (String merk) {
        this.merk = merk;
        this.kecepatan = 0;
    }

    public void tambahKecepatan(int tambahan) {
        kecepatan += tambahan;
        System.out.println(merk + " menambah kecepatan menjadi " + kecepatan + " km/h");
    }

    public void rem(int pengurangan) {
        kecepatan -= pengurangan;
        if (kecepatan < 0) kecepatan = 0;
        System.out.println(merk + " mengerem, kecepatan sekarang " + kecepatan + " km/h");
    }

    public void cetakInfo() {
        System.out.println("Merk      : " + merk);
        System.out.println("Kecepatan : " + kecepatan + " km/h");
    }
}