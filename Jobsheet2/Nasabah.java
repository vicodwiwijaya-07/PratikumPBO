package Jobsheet2;

public class Nasabah {
    public String nama;
    public double saldo;
    
    
    public void tampilkanSaldo (String mataUang){
        System.out.println("Saldo anda adalah "+ nama + mataUang+ saldo); 
    }

    public void tampilkanData(){
        System.out.println();
    }
}
