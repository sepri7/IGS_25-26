import java.util.Queue;
import java.util.PriorityQueue;

public class appPriorityQueue {
    public static void main(String[] agrs) {
        Queue<String> AntrianPriority = new PriorityQueue<>();
        // Ordered by Asc
        AntrianPriority.offer("budi");
        AntrianPriority.offer("azalia");
        AntrianPriority.offer("daffa");
        AntrianPriority.offer("caca");
        AntrianPriority.offer("Zalia"); // upper - lower : case
        System.out.println("daftar : " + AntrianPriority);
        System.out.println("Antrian pertama : " + AntrianPriority.poll());
        System.out.println("daftar antrian : " + AntrianPriority);
        System.out.println("selanjutnya : " + AntrianPriority.peek());
    }
}
