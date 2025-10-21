abstract class sekolah {
    String sekolahName = "Ignatius Global School";

    sekolah(String newName) {
        this.sekolahName = newName;
    }
    abstract void Display();
}

class sma extends sekolah {
    sma(String newName) {
        super(newName);
    }

    @Override
    void Display() {
        System.out.println("nama sekolah : " + this.sekolahName);
    }
}

public class app_abstract {
    public static void main(String[] args) {
        // sekolah igs = new sekolah(); error karena class abstract
        sma igs = new sma("IGS CGC");
    }
}
