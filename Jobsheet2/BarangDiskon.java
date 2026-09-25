package Jobsheet2;

public class BarangDiskon {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon; 
    public int hitungHargaJual() {
        return (int) (hargaDasar - (diskon * hargaDasar)); 
       
    }

    public void tampilData() {
        System.out.println("Kode Barang  : " + kode);
        System.out.println("Nama Barang  : " + namaBarang);
        System.out.println("Harga Dasar  : Rp" + hargaDasar);
        System.out.println("Diskon       : " + (diskon * 100) + "%");
        System.out.println("Harga Jual   : Rp" + hitungHargaJual());
    }
}

