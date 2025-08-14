public class App2 {
    public static void main(String[] args) {
        String nama = "Budi";
        // var name = "SAntoso";
        System.out.println(nama);
        int a;
        // var b; // error
        final byte kelas = 11;
        // kelas = 12; // error
        final byte new_class = kelas + 1;
        byte b = 1;
        // final byte new_class2 = b + 12; //error
        System.out.println("__Data non/primitif");
        byte aa = 15;
        // System.out.println(aa.compareTo(b)); //error
        System.out.println(aa + 5);
        Byte bb = 14;
        System.out.println(bb + 4);
        System.out.println(bb.compareTo(b));
        System.out.println(nama.length());
        System.out.println("__Assign OP");
        byte z = 99;
        System.out.println(z);
        z += 1; // z = z +1
        System.out.println("__Unary");
        byte zz = 5;
        byte xx = 5;
        System.out.println(zz);
        zz++;// decrement
        ++xx;// increment
    }
}
