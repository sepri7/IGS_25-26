import java.util.HashMap;

class siswa {
    String nama;
    int umur;
    String kelas;

    siswa(String nama, int umur, String kelas) {
        this.nama = nama;
        this.umur = umur;
        this.kelas = kelas;
    }

    void display() {
        System.out.println("nama : " + nama);
        System.out.println("umur : " + umur);
        System.out.println("kelas : " + kelas);
    }
}

public class App2 {
    public static void main(String[] args) {
        HashMap<String, siswa> DataSiswa = new HashMap<>();
        DataSiswa.put("001", new siswa("joko", 15, "11 kom 2"));
        DataSiswa.put("002", new siswa("jiki", 16, "11 kom 1"));
        System.out.println(DataSiswa.get("001"));
        DataSiswa.get("001").display();
    }
}
