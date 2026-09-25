package Jobsheet2;

public class TestBarangDiskon {
    public static void main(String[] args) {
        BarangDiskon brg = new BarangDiskon();
        brg.kode = "B001";
        brg.namaBarang = "Keyboard Mechanical";
        brg.hargaDasar = 500000;
        brg.diskon = 0.2f; 
        
        brg.tampilData();
    }
}
