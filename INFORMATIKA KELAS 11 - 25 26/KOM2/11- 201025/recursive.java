public class recursive {

    static void recur(int angka) {
        if (angka == 0) {
            return;
        } else {
            recur(angka - 1);
        }
        System.out.println("Value of angka : " + angka);
    }

    // !5 = 5*4*3*2*1 =120
    static int faktorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else {
            return n * faktorial(n - 1);
        }
    }

    public static void main(String[] args) {
        recur(5);
        System.out.println("faktorial dari 5 : " + faktorial(5));
    }
}
