class person {
    String nama;
    int kelas;
    String alamat;

    person(String nama, int kelas) { // ini constractor
        this.nama = nama;
        this.kelas = kelas;
        // System.out.println("ini pasti dipanggil..");
    }

    public static void mapel() {
        System.out.println("MATEMATIKA MUDAH !");
    }

    public static String sekolah(String namaSekolah) {
        return "nama sekolahku : " + namaSekolah;
    }
}

public class app2 {
    public static void main(String[] args) {
        person p1 = new person("jesy", 11);
        person p2 = new person("zizi", 12);
        System.out.println("haii nama saya " + p1.nama + " ada di kelas " + p1.kelas);
        p1.mapel();
        p2.mapel();
        System.out.println(p2.sekolah("IGS"));
    }
}
