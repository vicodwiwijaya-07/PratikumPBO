package Jobsheet2;

public class Barang24 {
    public String namaBarang;
    public String jenisBrg;
    public int stok;

    public void tampilBarang() {
        System.out.println( "Nama Barang        : "+ namaBarang);
        System.out.println("Jenis Kelamin    : " + jenisBrg);
        System.out.println("Stok : " + stok);
    }

    public int tambahStok(int brgMasuk) {
        int stokBaru=brgMasuk+stok;
        return stokBaru;
    }
}
