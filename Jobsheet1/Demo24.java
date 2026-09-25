public class Demo24 {
    public static void main(String[] args) {
        System.out.println("=== Objek Ballpoint ===");
        Ballpoint24 ballpoint1 = new Ballpoint24("Biru Tua", 50);
        ballpoint1.menulis("Belajar PBO Java");
        ballpoint1.mengisiUlangTinta();
        ballpoint1.cetakInfo();

        System.out.println("\n=== Objek Hp ===");
        Hp24 hp1 = new Hp24("Redmi", 80);
        hp1.menelepon("085814626335");
        hp1.mengisiDaya(15);
        hp1.cetakInfo();

        System.out.println("\n=== Objek Kendaraan (Class Induk) ===");
        Kendaraan24 kendaraan1 = new Kendaraan24("Kendaraan Umum");
        kendaraan1.tambahKecepatan(20);
        kendaraan1.rem(5);
        kendaraan1.cetakInfo();

        System.out.println("\n=== Objek Motor (Turunan Kendaraan) ===");
        Motor24 motor1 = new Motor24("Honda Vario", "Cakram", 110);
        motor1.nyalakanMesin();
        motor1.tambahKecepatan(40);
        motor1.bunyikanKlakson();
        motor1.cetakInfo();

        System.out.println("\n=== Objek Mobil (Turunan Kendaraan) ===");
        Mobil24 mobil1 = new Mobil24("BMW ", 2, 390.0);
        mobil1.nyalakanAC();
        mobil1.tambahKecepatan(560);
        mobil1.bukaBagasi();
        mobil1.cetakInfo();
    }
}