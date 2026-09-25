package Jobsheet2;

public class TestPerbankan {
    public static void main(String[] args) {    
        Nasabah nsb1 = new Nasabah();
        Nasabah nsb2 = new Nasabah();

        nsb1.nama = "Vico";
        nsb1.saldo= 1000000;
        nsb1.tampilkanSaldo(" IRD");

        nsb2.nama = "Koka";
        nsb2.saldo=  80808;
        nsb2.tampilkanSaldo(" USD");


    }
}
