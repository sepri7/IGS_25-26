import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

class latihan1 {
    public static void main(String[] args) {
        System.out.println("antrian beli gorengan");
        System.out.println("1.antrian masuk");
        System.out.println("2.antrian selanjutnya");
        System.out.println("3.daftar antrian");
        System.out.println("4.gorengan tutup");
        Queue<String> antrian = new LinkedList<>();
        while (true) {
            System.out.println("pilih menu");
            Scanner sc = new Scanner(System.in);
            int menu = sc.nextInt();
            if (menu == 1) {
                System.out.println("masukkan nama");
                String nama = sc.next();
                System.out.println("antrian " + nama);
                antrian.offer(nama);
            } else if (menu == 2) {
                System.out.println(antrian.poll());
            } else if (menu == 3) {
                System.out.println(antrian);
            } else if (menu == 4) {
                System.out.println("gorengan tutup");
                break;
            }
        }

    }
}