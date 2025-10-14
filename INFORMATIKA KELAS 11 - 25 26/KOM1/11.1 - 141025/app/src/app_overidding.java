class player {
    String name;

    void Display() {
        System.out.println("Semua player ada nama..");
    };
}

class senjata extends player {
    String senjataName;

    @Override
    void Display() {
        System.out.println("Senjata dimiliki player");
    };
}

public class app_overidding {
    public static void main(String[] args) {
        senjata s1 = new senjata();
        s1.Display();
        player p1 = new player();
        p1.Display();
        player sp1 = new senjata();
        sp1.Display();
    }

}
