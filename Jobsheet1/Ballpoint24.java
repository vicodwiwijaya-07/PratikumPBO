public class Ballpoint24 {
    private String warna;
    private int sisaTinta; 

    public Ballpoint24 (String warna, int sisaTinta) {
        this.warna = warna;
        this.sisaTinta = sisaTinta;
    }

    public void menulis(String teks) {
        if (sisaTinta <= 0) {
            System.out.println("Tinta habis, tidak bisa menulis.");
            return;
        }
        sisaTinta -= 5;
        if (sisaTinta < 0) sisaTinta = 0;
        System.out.println("Menulis: \"" + teks + "\" (sisa tinta " + sisaTinta + "%)");
    }

    public void mengisiUlangTinta() {
        sisaTinta = 100;
        System.out.println("Tinta ballpoint diisi ulang menjadi 100%");
    }

    public void cetakInfo() {
        System.out.println("Warna      : " + warna);
        System.out.println("Sisa Tinta : " + sisaTinta + "%");
    }
}