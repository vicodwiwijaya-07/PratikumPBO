package Jobsheet2;

public class Peminjaman {
    public String id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int lamaSewa;

    public void tampilData() {
        System.out.println("ID Member   : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game   : " + namaGame);
        System.out.println("Lama Sewa   : " + lamaSewa + " hari");
        System.out.println("Harga/hari  : Rp" + harga);
        System.out.println("Total Bayar : Rp" + hitungHargaBayar());
    }

    public int hitungHargaBayar() {
        return lamaSewa * harga;
    }
}