class Ketua {
    String title = "senior";
    int range = 1;
}

class wakilKetua extends Ketua {
    String title = "middle";
}

class anggota extends wakilKetua {
    String title = "lower";

}

// ini adalah contoh inheritance : multilevel
public class app3 {
    public static void main(String[] args) {
        wakilKetua wakil01 = new wakilKetua();
        System.out.println(wakil01.title);
        System.out.println(wakil01.range);
    }
}
