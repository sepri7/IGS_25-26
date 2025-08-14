public class App {
    public static void main(String[] args) {
        byte umur = 15;
        System.out.println("Umur = " + umur + " tahun");
        float nilai = 85.5f;
        System.out.println("nilai = " + nilai);
        double uang = 1000000000.00;
        System.out.println("uang = " + uang);
        byte bin = 0b1101;
        byte oct = 076;
        int hex = 0x9AB;

        // AUTO
        byte a = 45;
        short b = a;
        short aa = 34;
        // MANUAL
        byte c = 50;
        short d = (short) c;
        short cc = (short) 55.5;
        int dd = (int) cc;
        short e = 129;
        byte ee = (byte) e;
        System.out.println(ee);
    }
}
