package Jobsheet3.MontorEncapsulation;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor ();
        motor.printStatus();
        motor.tambahKecepatan();

        motor.nyalakanMesin();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.matikanMesin();
        motor.printStatus();

        // motor.printStatus();
        // motor.kecepatan = 50;
        // motor.printStatus();

        motor.nyalakanMesin();
        System.out.println("Mesin dinyalakan.\n");

        for (int i = 1; i <= 22; i++) {
            System.out.println("Panggilan ke-" + i + ": ");
            motor.tambahKecepatan();
        }

        System.out.println(" Status Akhir ");
        motor.printStatus();
    }
}
