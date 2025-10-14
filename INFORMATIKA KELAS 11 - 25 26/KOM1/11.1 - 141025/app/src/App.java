public class App {
    static void luas(float p, float l) {
        System.out.println("luas persegi panjang = " + (p * l));
    }

    static void luas(float r) {
        System.out.println("luas lingkaran = " + (Math.PI * Math.pow(r, 2)));
    }

    public static void main(String[] args) {
        luas(14);
        luas(3, 5);

    }
}
