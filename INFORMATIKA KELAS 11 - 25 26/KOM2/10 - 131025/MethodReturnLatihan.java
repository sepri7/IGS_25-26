class MethodReturnLatihan {
    static int abc(int x, int y) {
        return (x - y);
    }

    static int def(int x, int y) {
        return (x * y);
    }

    public static void main(String[] args) {
        var hasil = abc(5, 4);
        float hasil2 = def(2, 3);

        System.out.println(hasil + hasil2);
        System.out.println(bagian(5, 2));
    }

    static float bagian(float a, int n) {
        return a / n;
    }
}
