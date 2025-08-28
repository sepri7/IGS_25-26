import java.util.InputMismatchException;
import java.util.Scanner;

class Loop {
    public static void main(String[] args) {
        // for loop:
        for (int i = 1; i < 3; i += 1) {
            System.out.println("loop i : " + i);
        }
        // for (;;) {
        // System.out.println("teruss...");
        // }
        // while
        int x = 2;
        while (x <= 10) {
            System.out.println("WhileLoop : " + x);
            x += 2;
        }
        // do-while
        int z = 9;
        do {
            System.out.println("WhileDoLoop : " + z);
            z--;
        } while (z >= 0);

        System.out.println("----Latihan-1");
        for (int i = 100; i >= 0; i -= 50) {
            System.out.print(i + "\t");
        }
        System.out.println("\n----Latihan-2");
        int j = 1;
        while (j <= 19) {
            System.out.print(j + "\t");
            j += 6;
        }
        System.out.println("\n----Latihan-3");
        int k = 2;
        do {
            System.out.print(k + "\t");
            k *= 5;
        } while (k <= 10);
        System.out.println("\n----Break");
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("\n----continue");
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("\n----For each : Array");
        char grade[] = { 'A', 'B', 'C', 'D', 'E' };
        for (char i : grade) {
            System.out.print("nilaiku : " + i + "\t");
        }
    }
}
