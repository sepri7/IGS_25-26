package Sekolah;

// dalam class sendiri
public class Person {
    public String nama = "Jessy";
    protected int DataProtected = 10;
    int dataDefault = 11; // ini default
    private int dataPrivate = 12;

    public void DisplayNama() {
        System.out.println("nama : " + nama);
        System.out.println("DataProtected : " + DataProtected);
        System.out.println("dataDefault : " + dataDefault);
        System.out.println("dataPrivate : " + dataPrivate);
    }

    private void hai() {
        System.out.println("wioo");
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.nama);
        p1.DisplayNama();
        p1.hai();
    }
}
