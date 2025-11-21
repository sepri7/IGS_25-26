import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

class appQueue {
    public static void main(String[] agrs) {
        Queue<String> antrian = new LinkedList<>();
        antrian.offer("Budi");
        antrian.offer("Jessy");
        antrian.offer("Nana");
        antrian.offer("Kaka");
        antrian.add("Kiki");
        System.out.println(" semua daftar antrian " + antrian);
        System.out.println(" antrian pertama " + antrian.poll());
        System.out.println(" daftar antrian " + antrian);
        System.out.println(" antrian selanjutnya  " + antrian.peek());
        System.out.println(" daftar antrian " + antrian);
        System.out.println("Antrian Gagal : " + antrian.remove());
        // remove(): remove first data
        System.out.println(" daftar antrian " + antrian);
        System.out.println("Antrian Gagal : " + antrian.remove("Kaka"));
        // remove("???") : remove by value
        System.out.println(" daftar antrian " + antrian);
        // antrian.addFirst("nana"); akan error karena dataColection Queue
    }
}