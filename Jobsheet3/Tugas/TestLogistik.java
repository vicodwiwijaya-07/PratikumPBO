package Jobsheet3.Tugas;

import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("=== Sistem Manajemen Pergudangan Kargo ===");
        System.out.println("Nama Pemilik Kontainer : " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal     : " + kontainerAlfa.getKapasitasMaksimal() + " kg");
        System.out.println("Berat Muatan Saat Ini  : " + kontainerAlfa.getBeratMuatanSaatIni() + " kg\n");
        
        // Meminta input pengguna untuk MENAMBAH muatan
        System.out.print("Masukkan nominal berat barang yang akan DIMUAT (kg): ");
        double beratMasuk = sc.nextDouble(); // Membaca input angka desimal
        
        System.out.println("Memproses muatan...");
        kontainerAlfa.tambahMuatan(beratMasuk);
        System.out.println("-> Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg\n");
        
        // Meminta input pengguna untuk MENURUNKAN muatan
        System.out.print("Masukkan nominal berat barang yang akan DIBONGKAR (kg): ");
        double beratKeluar = sc.nextDouble(); // Membaca input angka desimal
        
        System.out.println("Memproses pembongkaran...");
        kontainerAlfa.turunkanMuatan(beratKeluar);
        System.out.println("-> Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg\n");
        
        // Menutup scanner (good practice)
        sc.close();
        System.out.println("=== Operasi Selesai ===");
        

        
        // System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        // System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");
        
        // System.out.println("\nMemasukkan muatan baru seberat 6.000 kg...");
        // kontainerAlfa.tambahMuatan(6000);
        // System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
        
        // System.out.println("\nMemasukkan muatan baru seberat 4.000 kg...");
        // kontainerAlfa.tambahMuatan(4000);
        // System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
        
        // System.out.println("\nMembongkar muat/menurunkan barang seberat 500 kg...");
        // kontainerAlfa.turunkanMuatan(500);
        // System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
        
        // System.out.println("\nMembongkar muat/menurunkan barang seberat 1.500 kg...");
        // kontainerAlfa.turunkanMuatan(1500);
        // System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");


        // // Tes pembongkaran MELEBIHI 50% (Tes Gagal)
        // System.out.println("\n--- Tes Bongkar (Melebihi 50%) ---");
        // System.out.println("Mencoba membongkar muatan seberat 2.500 kg...");
        // kontainerAlfa.turunkanMuatan(2500);
        // System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
        
        // // Tes pembongkaran SESUAI BATAS 50% (Tes Berhasil)
        // System.out.println("\n--- Tes Bongkar (Sesuai Aturan) ---");
        // System.out.println("Mencoba membongkar muatan seberat 1.000 kg...");
        // kontainerAlfa.turunkanMuatan(1000);
        // System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
    }
}
