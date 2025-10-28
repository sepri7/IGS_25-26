class animal {
    String nama;
    String warna;
    int usia;
}

public class app {
    public static void main(String[] args) {
        animal animal01 = new animal();
        System.out.println("1.nama obj 01 = " + animal01.nama);
        animal01.nama = "semut";
        animal01.warna = "hitam";
        animal01.usia = 100;
        System.out.println("2.nama obj 01 = " + animal01.nama);
        animal objTikus = new animal();
        objTikus.nama = "Jerry";
        objTikus.warna = "Coklat";
        System.out.println(objTikus.nama + " berwarna " + objTikus.warna);

    }
}
