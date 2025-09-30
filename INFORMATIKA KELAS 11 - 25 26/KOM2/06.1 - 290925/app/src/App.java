public class App {
    public static void main(String[] args) {
        for (int z = 1; z <= 5; z++) {
            for (int i = 1; i <= z; i++) {
                System.out.print("^ ");
            }
            System.out.println();
        }

        System.out.println("---------While-loop");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("---------While-loop : 2");
        int x = 10;
        while (x <= 20) {
            System.out.println(x);
            x += 2;
        }

        System.out.println("--------- DO While-loop");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);
    }
}
