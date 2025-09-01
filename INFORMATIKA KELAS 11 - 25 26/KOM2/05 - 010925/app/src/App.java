import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("----------------------------- ARRAY MULTIDIMENSI");
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("cara ambil value 2 : " + matrix[0][1]);
        System.out.println("cara ambil value 9 : " + matrix[2][2]);
        System.out.println("cara ambil value 5 : " + matrix[1][1]);
        System.out.println(matrix[1]);
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(matrix);
        System.out.println(Arrays.deepToString(matrix));
        System.out.println("-----------------------------If-Statement");
        double x = 210;
        if (x % 2 == 0) {
            System.out.println("Genap...");
        } else if (x % 2 == 1) {
            System.out.println("Ganjil...");
        } else {
            System.out.println("INVALID !");
        }
        System.out.println("-----------------------------Input-user");
        // byte y = 111;
        Scanner Inputan = new Scanner(System.in);
        System.out.println("Enter nilai x : ");
        byte y = Inputan.nextByte();
        System.out.println(y);
        System.out.println("-----------------------------Ternary OP");
        System.out.print("Enter nilai ( Ganjil / Genap ) ? ");
        int abc = Inputan.nextInt();
        String Result = (abc % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println(Result);
    }
}
