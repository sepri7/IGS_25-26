import java.util.Arrays;
import java.util.Scanner;

public class App_LoopStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) { // i++ == i += 1
            System.out.print(i + " ");
        }
        System.out.println("------------");
        for (int z = 0; z < 16; z += 5) {
            System.out.print(z + " ");
        }
        System.out.println("------------");
        for (int baseng = 1; baseng <= 9; baseng += 2) {
            System.out.print(baseng + " ");
        }
    }
}
