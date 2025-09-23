class Student {
    String nama;
    int umur;
    String kelas;
}

public class app_ClassObject {
    public static void main(String[] args) {
        Student std01 = new Student();
        std01.nama = "Jessy";
        std01.umur = 16;
        std01.kelas = "IPA 2";
        System.out.println("nama = " + std01.nama);
        System.out.println("umur = " + std01.umur);
        System.out.println("kelas = " + std01.kelas);
        Student std02 = new Student();
        std02.nama = "Jessy";
        System.out.println("nama = " + std02.nama);
    }
}
