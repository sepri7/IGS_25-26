import java.util.InputMismatchException;
import java.util.Scanner;

class ifLoop {
    public static void main(String[] args) {
        var nilai = 10;
        if (nilai % 2 == 0) {
            System.out.println("genap");
        } else if (nilai % 2 == 1) {
            System.out.println("ganjil");
        } else {
            System.out.println("salah !");
        }
        System.out.println("-----------------");
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a = ");
        var a = Input.nextDouble();
        System.out.print("Enter b = ");
        var b = Input.nextInt();
        System.out.println("a+b = " + (a + b));

        System.out.println("-----------------");
        try {
            System.out.print("Enter c = ");
            var c = Input.nextDouble();
            System.out.print("Enter d = ");
            var d = Input.nextInt();
            double hasil = c * d;
            System.out.println("c*d = " + hasil);

            if (hasil >= 10) {
                System.out.println("Lebih besar dari 10");
            } else {
                System.out.println("lebih kecil dari 10");
            }
        } catch (InputMismatchException e) {
            System.out.println("(c/d)Harus angka !");
        }

        System.out.println("TERNARY : -----------------");
        var z = 20;
        var ganjilGenap = (z % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println(ganjilGenap);

        System.out.println("Switch : -----------------");
        var x = 10;
        switch (x % 2) {
            case 0:
                System.out.println("Genap");
                break;
            case 1:
                System.out.println("Genap");
                break;

            default:
                System.out.println("Salah !");
        }
        System.out.println("Switch Lamda : -----------------");
        int y = 10;
        String result = switch (y % 2) {
            case 1 -> "Ganjil";
            case 0 -> "Genap";
            default -> "salah...";
        };

    }
}
