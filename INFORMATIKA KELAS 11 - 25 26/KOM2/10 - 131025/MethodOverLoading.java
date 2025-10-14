class MethodOverLoading {
    static double LUAS(int p, float l) {
        return p * l;
    }

    static double LUAS(int a, int t) {
        return 0.5 * a * t;
    }

    static double LUAS(float r) {
        return (3.14 * r * r);
    }

    static double LUAS(int s) {
        return (s * s);
    }

    public static void main(String[] args) {
        System.out.println(LUAS(5));
        System.out.println(5.5);
        System.out.println(5.1, 5.3);
    }
}
