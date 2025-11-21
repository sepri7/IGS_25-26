class siswa {
    String kelas;
    String nama;
    int umur;

    siswa(String kelas, String nama, int umur) { // iini adalah constractor
        this.kelas = kelas;
        this.nama = nama;
        this.umur = umur;
    }
}

class sma extends siswa {
    String tingkatSekolah = "SMA";

    sma(String kelas, String nama, int umur) {
        super(kelas, nama, umur);// super constractor
    }

}

public class app {
    public static void main(String[] args) {
        siswa siswa1 = new siswa("11 IPA 3", "Atsal", 16);
        System.out.println("nama siswa1 = " + siswa1.nama);
        siswa s2 = new siswa("11 IPA 2", "Edbert", 17);
        System.out.println("nama s2 = " + s2.nama + " Kelas = " + s2.kelas);

        sma sma01 = new sma("11 IPA 1", "BUDI", 16);
        System.out.println(sma01.nama);
        System.out.println(sma01.tingkatSekolah);
    }
}
