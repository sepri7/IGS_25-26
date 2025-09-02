import java.util.Arrays;

class Method {
    void sayHai() {
        System.out.println("Haii apa kabar !");
    }

    static int tambahan(int a, int b) {
        return a + b;
    }

    static int tambahan2(int[] num) {
        int total = 0;
        for (int i = 0; i < num.length; i++) {
            total += num[i];
        }
        return total;
    }

    static int tambahan3(int... num) {
        int total = 0;
        for (int i : num) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        Method say = new Method();
        say.sayHai();
        System.out.println(tambahan(9, 7));
        int[] data = { 1, 2, 3, 4 };
        System.out.println(tambahan2(data));
        int[] data2 = { 2, 3, 43, 2, 3, 22, };
        System.out.println(tambahan2(data2));
        System.out.println(tambahan3(data2));
    }
}