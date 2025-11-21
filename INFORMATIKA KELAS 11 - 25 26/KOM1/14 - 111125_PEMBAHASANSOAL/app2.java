interface Kamera {
    void ambilFoto();
}

interface GPS {
    void lacakLokasi();
}

class Smartphone implements Kamera {
    public void ambilFoto() {
        System.out.println("Foto berhasil diambil!");
    }

    public void lacakLokasi() {
        System.out.println("Melacak lokasi dengan GPS...");
    }
}

public class app2 {
    public static void main(String[] args) throws Exception {
        Smartphone m = new Smartphone();
        m.ambilFoto();
        m.lacakLokasi();
        int count = 0;
        while (count++ < 10) {
            System.out.println(count);
        }
        System.out.println(count);
    }
}
