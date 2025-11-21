abstract class sekolah {
    void display() {
        System.out.println("tampil dari method biasa");
    }

    abstract void displayAbs();// ini abstract method
}

class sma extends sekolah {
    void displayAbs() {
        System.out.println("ini dari abstract method");
    }

    String nama = "IGS";
    // private String nama = "IGS"; // kalau ada private maka nilai tidak dibolleh
    // diubah !

}

public class app {
    public static void main(String[] args) {
        // sekolah sma = new sekolah(); tidak bisa buat object dari class abstract
        sma igs = new sma();
        igs.display();
        System.out.println(igs.nama);
        igs.nama = "sma igs";
        System.out.println(igs.nama);
    }

}