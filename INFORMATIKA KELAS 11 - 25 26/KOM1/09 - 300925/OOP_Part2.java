class Mobil {
    String merk;
    int year;
    String slogan = "Mobil Terbaik";

    Mobil(String merk, int year) {
        this.merk = merk;
        this.year = year;
    }

    void madeIn() {
        System.out.println("Produksi India");
    }
}

class Electric extends Mobil {
    Electric(String merk, int year) {
        super(merk, year);
    }
}

public class OOP_Part2 {
    public static void main(String[] args) {
        Mobil mobil01 = new Mobil("toyota", 2026);
        mobil01.madeIn();
        System.out.println(mobil01.slogan);

        Electric mobilElec01Electric = new Electric("Hundai", 2025);
        mobilElec01Electric.madeIn();
    }
}
