class sekolah {
    String namaSekolah;
    private String visiMisi = "sekolah terbaik";
}

public class app {
    public static void main(String[] args) {
        sekolah s1 = new sekolah();
        s1.namaSekolah = "igs";
    System.out.println("sekolah = " +s1.namaSekolah);
    //System.out.println("visiMisi = " +s1.visiMisi);
    //s1.visiMisi = "sekolah mayor ruslan";
    }
}
