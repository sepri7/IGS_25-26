import java.util.HashSet;

public class app {
    public static void main(String[] args) {
        HashSet<String> data = new HashSet<>();
        data.add("abc");
        data.add("def");
        data.add("ghi");
        System.out.println(data);
        for (String i : data) {
            System.out.println(i);
        }
    }
}
