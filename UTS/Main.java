package UTS;

public class Main {
    public static void main(String[] args) {
        
        Bangsal melati = new Bangsal("Melati", 3, 400000);
        Bangsal mawar  = new Bangsal("Mawar", 3, 250000);
        Pasien p = new PasienBPJS("RM-009", "Ani", 2, "000999");

        System.out.println(p.hitungBiaya(400000)); 

       
        Dokter rina = new Dokter("dr. Rina", "Penyakit Dalam");
        Dokter andi = new Dokter("dr. Andi", "Paru");
        melati.setKepala(rina);

        
        PasienUmum budi = new PasienUmum("RM-001", "Budi", 3);
        budi.setDpjp(andi);
        melati.rawatInap(budi);

        
        PasienBPJS sari = new PasienBPJS("RM-002", "Sari", 4, "0001234");
        sari.setDpjp(rina);
        melati.rawatInap(sari, 3);

       
        Kasir kasir = new Kasir("Kasir 1");
        kasir.cetakTagihan(melati.getKamar(1));
        kasir.cetakTagihan(melati.getKamar(3));
        kasir.cetakTagihan(melati.getKamar(2));


        melati.setKamar(1, mawar.getKamar(1));
        melati.setKamar(2, new Kamar(2, 999999));
        melati.setKamar(3, null);
        Kamar bocor = new Kamar(9, 100000);
        melati.setKamar(1, bocor);
        melati = null;

        // kasir.cetakTagihan(melati.getKamar(2));   
        // kasir.cetakTagihan(melati.getKamar(5));   
    }
}