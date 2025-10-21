abstract class komputer {
    String merk = "Acer";
    private int year;

    komputer() { // constractor method
        System.out.println("from constractor");
    }

    abstract void harga();

    void ram() {
        System.out.println("32gb");
    }
}

class Laptop extends komputer {
    int ukuran = 12;

    void harga() {
        System.out.println("free");
    }
}

public class App {

    public static void main(String[] args) {
        // komputer objKom = new komputer();
        Laptop objLap = new Laptop();
        System.out.println(objLap.merk);
    }
}
