package com.mycompany.tugas03;

public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.create();
        motor1.store();

        Motor motor2 = new Motor(2, "Honda");
        System.out.println(motor2.read());
        motor2.update();

        Motor motor3 = new Motor(3, "Honda", "Vario", "Hitam", 2014);
        motor3.store();
        motor3.delete();

        MotorMatic varioKu = new MotorMatic(4, "Honda", "Vario 125 LED Old", "Putih", 2016, 12, 1500);
        varioKu.create();
        varioKu.store();
        System.out.println(varioKu.read());
        varioKu.update();
        varioKu.delete();
        varioKu.gantiKirian();
        System.out.println(varioKu.cekKecocokanPart());
    }
}