package Sekolah;

// SubClass dari person. dalam package sama
public class Guru extends Person {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("nama : " + p.nama);
        System.out.println("DataProtected : " + p.DataProtected);
        System.out.println("dataDefault : " + p.dataDefault);
        // System.out.println("dataPrivate : " + p.dataPrivate);
        p.DisplayNama();
    }
}