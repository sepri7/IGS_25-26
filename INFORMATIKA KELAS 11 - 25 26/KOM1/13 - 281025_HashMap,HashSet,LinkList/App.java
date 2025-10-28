import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        HashMap<String, String> Siswa = new HashMap<>();
        Siswa.put("001", "Jessy");
        Siswa.put("002", "Jeje");
        Siswa.put("003", "Joki");
        System.out.println(Siswa.get("002"));
        System.out.println(Siswa.get("003"));

        for (String nis : Siswa.keySet()) {
            System.out.println("nis : " + nis);
            System.out.println("siswa : " + Siswa.get(nis));
        }
        Siswa.remove("001"); // hapus data
        System.out.println(Siswa.get("001"));
        Siswa.replace("002", "dani");
        System.out.println(Siswa.get("002"));
    }
}
