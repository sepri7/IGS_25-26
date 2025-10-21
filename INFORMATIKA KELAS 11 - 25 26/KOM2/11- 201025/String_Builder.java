public class String_Builder {
    public static void main(String[] args) {
        String provinsi = "Sumatera Selatan";
        System.out.println("1. provinsi : " + provinsi);
        System.out.println(provinsi.concat(" ada kota palembang"));
        System.out.println("2. provinsi : " + provinsi);
        StringBuilder Kelurahan = new StringBuilder("Talang Kelapa");
        System.out.println("1. Kelurahan : " + Kelurahan);
        Kelurahan.append(" di sumsel");
        System.out.println("2. Kelurahan : " + Kelurahan);
        // kelurahan = Talang Kelapa di sumsel
        // 0123456......
        Kelurahan.insert(0, "kel : ");
        System.out.println("3. Kelurahan : " + Kelurahan);
        Kelurahan.insert(3, "(kelurahan)");
        System.out.println("4. : " + Kelurahan);
        Kelurahan.replace(0, 2, "adani");
        System.out.println("5. : " + Kelurahan);
        Kelurahan.delete(0, 19);
        System.out.println("6. : " + Kelurahan);
    }
}
