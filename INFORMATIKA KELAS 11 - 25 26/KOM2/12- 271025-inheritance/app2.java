class a {
    String nama = "dari a";
    String dariA = "a";

    static void saydariA() {
        System.out.println("Hallo aku berasal dari A");
    }
}

class b extends a {
    String nama = "dari b";
}

// ini adalah contoh inheritance : Single
public class app2 {
    public static void main(String[] args) {
        b objB = new b();
        System.out.println(objB.nama);
        System.out.println(objB.dariA);
        objB.saydariA();
    }
}
