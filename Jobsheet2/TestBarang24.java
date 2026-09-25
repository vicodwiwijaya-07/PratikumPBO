package Jobsheet2;

public class TestBarang24 {
    public static void main (String args[]){
        Barang24 brg1=new Barang24();
        brg1.namaBarang="Pensil";
        brg1.jenisBrg= "ATK";
        brg1.stok=10;
        brg1.tampilBarang();
        System.out.println("Stok Baru adalah " + brg1.tambahStok(20));
    }
}
