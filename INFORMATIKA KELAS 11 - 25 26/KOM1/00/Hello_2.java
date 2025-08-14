class Hello_2 {
    public static void main(String[] args) {
        // var
        var nama = "budi";
        var usia = 15;
        var isBool = true;
        int a;
        nama = "indah";
        // final
        final String sekolah = "IGS";
        final var tahun = 2026;
        // var b; // error
        System.out.println("--------------- primitif/ nonprimitif");
        // primitif
        byte isPri = 10;
        // byte isNullPri = null; // error
        // System.out.println(isPri.toString()); // error
        // non-primitif
        Byte isnonPri = 20;
        Byte isNullnonPri = null;
        System.out.println(isnonPri.toString());
        System.out.println("--------------- aritmatika");
        byte aa = 7;
        byte bb = 2;
        System.out.println("hasil1 = " + (aa + bb));
        System.out.println("hasil2 = " + (10 + 2 + aa));
        System.out.println("--------------- ");
        System.out.println("nilai aa = " + aa);
        aa += 6; // aa = aa + 6
        System.out.println("new nilai aa = " + aa);
        System.out.println("--------------- ");
        byte z = 10;
        byte y = 10;
        System.out.println("1. zz = " + z);
        System.out.println("3. yy = " + z);
        // z++/ ++z sama denngan, z = z + 1
        System.out.println("2. zz = " + (++z));// z =11
        System.out.println("2. yy = " + (y++));// z =10
        System.out.println("3. yy = " + y);// z =11
        System.out.println("! true = " + !(true));
        System.out.println("--------------- ");
        System.out.println(10 >= 11); // false
        System.out.println(10 < 11); // true
        System.out.println("--------------- ");
        var t = true;
        var f = false;
        System.out.println(t && f);
        System.out.println(f || f);
        System.out.println("--------------- array ");
        int[] nilai = { 90, 85, 78, 92 };
        System.out.println(nilai[2]);

    }
}