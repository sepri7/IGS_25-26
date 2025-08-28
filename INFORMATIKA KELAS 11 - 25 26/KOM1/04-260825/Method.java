class Loop {
    static void sayHai() {
        System.out.println("Haii apa kabar !");
    }

    static void tambah(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    static int kali(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        sayHai();
        sayHai();
        sayWoi();
        tambah(5, 7);
        tambah(1, 2);
        System.out.println(kali(2, 5));
        int j = 0;
        int i = j++ + j * 5;
        System.out.println(i);

    }

    static void sayWoi() {
        System.out.println("Woiii apakabar !");
    }
}
