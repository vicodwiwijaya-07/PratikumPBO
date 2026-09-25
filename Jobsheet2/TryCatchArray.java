package Jobsheet2;

public class TryCatchArray {
    public static void main(String[] args) {
        int[] angka = {1, 2, 3};
        System.out.println("Awal Program");
        
        try {
            System.out.println(angka[3]);
        } catch (Exception e) {
            System.out.println("Terjadi error: Indeks array melebihi batas!");
            // Opsional: e.printStackTrace(); 
        }
        
        System.out.println("Akhir Program");
    }
}
