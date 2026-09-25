package Kuis;

public class MainSoalA3 {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("0011223344", "Dr. Ayu");
        Dosen d2 = new Dosen("0055667788", "Ir. Bima, M.T.");

        Skripsi s1 = new Skripsi("Sistem Parkir Berbasis IoT", "Andi", d1, d2);

        Skripsi s2 = new Skripsi("Chatbot Layanan Akademik", "Sari", d2);

        System.out.println("--- Info s2 Awal ---");
        System.out.println(s2.info());
        System.out.println();

        s2.setPembimbing2(d2);
        s2.setPembimbing2(d1);

        System.out.println("\n--- Info s2 Setelah Perubahan ---");
        System.out.println(s2.info());
    }
}