class Siswa {
    String nama = "Jessy"; // Default
    int kelas = 10;// Default
    private double nilai = 70; // Private
    // GETTER

    public double GetNilai() {
        return this.nilai;
    }

    // SETTER
    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
}

public class OOP_Part1 {
    public static void main(String[] args) {
        Siswa s01 = new Siswa();
        System.out.println(s01.kelas); // 10
        s01.kelas = 11;
        System.out.println(s01.kelas); // 11
        // System.out.println(s01.nilai); error karena private
        // s01.nilai = 100;error karena private
        System.out.println(s01.GetNilai());
        s01.setNilai(90);
        System.out.println(s01.GetNilai());
    }
}
