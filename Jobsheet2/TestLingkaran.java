package Jobsheet2;

public class TestLingkaran {
    public static void main(String[] args) {
        Lingkaran L1 = new Lingkaran();
        L1.phi = 3.14;
        L1.r = 10;
        
        System.out.println("Luas Lingkaran     : " + L1.hitungLuas());
        System.out.println("Keliling Lingkaran : " + L1.hitungKeliling());
    }
}
