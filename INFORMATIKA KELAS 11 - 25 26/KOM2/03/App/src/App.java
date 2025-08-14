public class App {
    public static void main(String[] args) {
        byte a = 127;
        // byte a = 200; // tidak bisa batas byte 127.
        // long b = 100L;
        // float c = 100.11f;
        // double d = 100.11;
        // System.out.println("a = " + a);
        System.out.println("----- Luas_Keliling Lingkaran");
        int r = 10;
        double luas = 3.14 * r * r;
        double keliling = 2 * 3.14 * r;
        System.out.println("Luas lingkaran adalah " + luas + " cm dan Keliling lingkaran adalah " + keliling
                + " cm jika Panjang jari - jari nya " + r + " cm");
    }
}
