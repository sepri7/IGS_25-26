package Osis;

import Sekolah.Person;

// bukan subClass dan beda package
public class DataOsis {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.nama);
        // System.out.println(p.DataProtected);
        // System.out.println(p.dataDefault);
        // System.out.println(p.dataPrivate);
        p.DisplayNama();
    }
}
