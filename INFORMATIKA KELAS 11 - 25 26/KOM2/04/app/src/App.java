public class App {
    public static void main(String[] args) {
        var abc = 10;
        // unary abc = abc +1
        System.out.println("abc pre : " + (++abc));
        System.out.println("abc pre-2 : " + abc);
        var xyz = 20;
        System.out.println(" xyz post : " + (xyz++));
        System.out.println(" xyz post-2 : " + xyz);
        System.out.println("--------");
        System.out.println(10 >= 10);
        System.out.println(10 < 10);
        System.out.println("--------");
        System.out.println(true && false);
        byte a = 20;
        byte b = 20;
        System.out.println((a < b) && (b == a));
        System.out.println((a < b) || (b != a));
        System.out.println(!(b != a));
        System.out.println("--------");
        char[] nilai = { 'A', 'B', 'D', 'C', 'Z' };
        System.out.println("ke-2 " + nilai[2]);
        String nama[] = new String[2];
        nama[0] = "nana";
        nama[1] = "nono";
        // nama[2] = "nunu";
        System.out.println("ke-1 nama " + nama[1]);

    }
}
