class player {
    String name;

    void Display() {
        System.out.println("Semua player ada nama..");
    };

    // overloading : merubahkan override yang ada dalam satu class
    void kendaraanPlayer(int roda) {
        System.out.println("kendaaaran roda : " + roda);
    }

    // @Override : tidak boleh ada di overloading
    void kendaraanPlayer(int roda, String warna) {
        System.out.println("kendaaaran roda : " + roda + " warna : " + warna);
    }
}

class senjata extends player {
    String senjataName;

    @Override // ini digunakan untuk memastikan method benar sudah di override/ gunakan ulang
    void Display() { // ini disebut overring: karena meng-override di beda kelas
        System.out.println("Senjata dimiliki player");
    };
}

public class app {
    public static void main(String[] args) {
        senjata s1 = new senjata();
        s1.Display();
        player p1 = new player();
        p1.Display();
        player sp1 = new senjata();
        sp1.Display();

        p1.kendaraanPlayer(2);
        p1.kendaraanPlayer(4, "hitam");
    }

}
