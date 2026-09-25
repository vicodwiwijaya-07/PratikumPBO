package Jobsheet3.Tugas;

public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap1 = new EncapDemo();
        EncapDemo encap2 = new EncapDemo();

        encap1.setName("James");
        encap1.setAge(35); 
        encap2.setName("Vico");
        encap2.setAge(17); 



        System.out.println("Name : " + encap1.getName());
        System.out.println("Age : " + encap1.getAge());
        System.out.println("Name : " + encap2.getName());
        System.out.println("Age : " + encap2.getAge());
    }
}
