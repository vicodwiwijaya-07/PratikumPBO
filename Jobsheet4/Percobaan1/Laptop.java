package Jobsheet4.Percobaan1;

public class Laptop {
    private String merek;
    private Processor proc;

     public Laptop() {
        
    }

    public Laptop (String merek, Processor proc) {
        this.merek = merek;
        this.proc = proc;
    }

    public void  setMerk(String merek){
        this.merek = merek;
    }

    public String getMerk() {
        return merek;
    }

    public void setProc(Processor proc) {
        this.proc = proc;
    }
    public void  info() {
        System.out.println("Merek Laptop: " + merek);
        if (proc != null) {
            proc.info();
        }
    }

}
