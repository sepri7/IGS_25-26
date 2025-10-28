package Siswa;

import Sekolah.Person;

// SubClass dari person. dalam package beda
public class DataSiswa extends Person {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.nama);
        // System.out.println(p.DataProtected);
        // System.out.println(p.dataDefault);
        // System.out.println(p.dataPrivate);
        p.DisplayNama();
    }
}
