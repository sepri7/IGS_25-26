interface suaraMesin {
    // String suara; // tidak boleh, wajib ada value
    String suaraM = "ngeenge";

    // void lamaSuara(){ // tidak boleh ada body method ( kecuali default / static)
    // System.out.println("1 menit");
    // }
    void lamaSuara();

    default void tinggiSuara() {
        System.out.println("from tinggi suara");
    }

    static void sumberSuara() {
        System.out.println("from sumber suara");
    }
}

interface suaraLakson {
    String suaraL = "biipp";
}

class mobil implements suaraMesin, suaraLakson {
    @override
    public void lamaSuara() {
        System.out.println("2 menit");
    }

    @override
    public void tinggiSuara() {
        System.out.println("from tinggi suara berubah");
    }

    @override
    void sumberSuara() {
        System.out.println("from sumber suara berubah");
    }
}

public class App {
    public static void main(String[] args) {
        mobil m = new mobil();
        System.out.println(m.suaraM);
        System.out.println(m.suaraL);
        m.lamaSuara();
        m.tinggiSuara();
        m.sumberSuara();
    }
}