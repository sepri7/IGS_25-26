public class tester {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("nilai a awal = " + (a));// 10
        // misal : ++a sama dengan a = a + 1
        System.out.println("nilai a sebelum (pre) = " + (++a)); // 11
        System.out.println("nilai a setelah (post) = " + (a++)); // 11
        System.out.println("nilai a setelah post = " + (a));// ??

        // contoh soal :
        int b = 21;
        int hasil = (b++) + (b++) - (--b) + 4;
        System.out.println(hasil);

        // contoh soal :
        int c = 11;
        int hasil2 = (++c) + (--c) + (--c) + (c++);
        System.out.println(hasil2);

        int count = 0;
        for (int n = 64; n > 0; n = n / 4) {
            if (n % 2 == 0) {
                count++;
                System.out.println(n);
            }
        }
        System.out.println(count);

        int num = 5;
        while (true) {
            if (num > 0) {
                num--;
                continue;
            }
            if (num < 0) {
                break;
            }
            System.out.println("2");
        }

    }
}
