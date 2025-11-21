import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;

class appDeque {
    public static void main(String[] args) {
        // Queue :
        Queue<Integer> DataQueue = new ArrayDeque<>();
        DataQueue.offer(70);
        DataQueue.offer(60);
        DataQueue.offer(90);
        DataQueue.add(1);
        System.out.println(DataQueue);
        System.out.println(DataQueue.poll());
        System.out.println(DataQueue);
        // Deque
        System.out.println("------DEQUE");
        Deque<Integer> DataDeque = new ArrayDeque<>();
        DataDeque.offer(3);
        DataDeque.offer(2);
        DataDeque.offer(3);
        DataDeque.offerFirst(1);
        DataDeque.offerLast(10);
        System.out.println("data : " + DataDeque);
        System.out.println("PollLast :  " + DataDeque.pollLast());
        System.out.println("data : " + DataDeque);
    }
}