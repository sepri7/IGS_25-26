class MethodReturn {
    static String MyName() {
        return "Jessy";
    }

    static int Tambah(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {
        MyName();
        System.out.println(MyName());
        Tambah(10, 5);
        System.out.println(Tambah(10, 5));
    }
}
