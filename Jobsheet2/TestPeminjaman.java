package Jobsheet2;

public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman sewa1 = new Peminjaman();
        sewa1.id = "M001";
        sewa1.namaMember = "Vico";
        sewa1.namaGame = "Monster Hunter Wilds";
        sewa1.harga = 50000;
        sewa1.lamaSewa = 3;
        
        sewa1.tampilData();
    }
}
