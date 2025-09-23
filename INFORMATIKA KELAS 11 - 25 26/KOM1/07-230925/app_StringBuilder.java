public class app {

    public static void main(String[] args) {
        String kelas = "IPA2";
        System.out.println(kelas);
        kelas.concat(" keren");
        System.out.println(kelas);
        String hasil = kelas.concat(" keren");
        System.out.println(hasil);
        // I P A 2
        // 0 1 2 3
        System.out.println(kelas.substring(0, 3) + "1");
        System.out.println("------STRING BUILDER");
        StringBuilder obj = new StringBuilder("IPA");
        System.out.println(obj);
        obj.append(" KOM 1");
        System.out.println(obj);
        obj.insert(9, " KEREN");
        System.out.println(obj);
        obj.replace(0, 3, "IPS");
        System.out.println(obj);
        obj.delete(0, 4);
        System.out.println(obj);
        obj.reverse();
        System.out.println(obj);
    }
}