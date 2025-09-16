class MethodLanjutan {
    // kenapa static
    static void ha() {
        System.out.println("haha");
    }

    void hi() {
        System.out.println("hihi");
    }

    // overloading
    static void hai(String name) {
        System.out.println("hai hai  : " + name);
    }

    static void hai(int umur) {
        System.out.println("haiii umur kamu sekarang  : " + umur);
    }

    static void hai(String name, int umur) {
        System.out.println("hai hai  : " + name + "umur kamu : " + umur);
    }

    // recursive
    static void recur(int n) {
        if (n == 0) {
            return;
        } else {
            recur(n - 1);
        }
        System.out.println(n);
    }

    static int faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // kenapa static
        ha();
        ha();
        MethodLanjutan obj = new MethodLanjutan();
        obj.hi();

        // overloading
        hai("jessy");
        hai(16);
        hai("jeje", 15);

        // recursive
        recur(10);
    }
}