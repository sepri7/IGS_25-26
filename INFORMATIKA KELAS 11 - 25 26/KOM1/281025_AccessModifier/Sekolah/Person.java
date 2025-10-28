package sekolah;

public class Person {
    public String nama = "Jessy";

    public void DisplayNama() {
        System.out.println("nama : " + nama);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.nama);
        p1.DisplayNama();
    }
}
