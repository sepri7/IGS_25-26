import java.util.LinkedList;

public class appLinkedList {
    public static void main(String[] args) {
        LinkedList<String> dataLL = new LinkedList<>();
        dataLL.offer("def");
        dataLL.offer("zzz");
        dataLL.add("ggg");
        // dataLL.add(99); error
        System.out.println(dataLL);
        LinkedList<Integer> DataLL2 = new LinkedList<>();
        DataLL2.add(100);
        DataLL2.add(50);
        System.out.println(dataLL);
        System.out.println("---- poll : ");
        System.out.println(DataLL2);
        System.out.println(DataLL2.poll());
        System.out.println(DataLL2);
        DataLL2.addFirst(212);
        System.out.println(DataLL2);
    }
}
