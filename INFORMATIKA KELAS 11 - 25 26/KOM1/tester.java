import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tiga angka: ");
        double angka1 = input.nextDouble();
        double angka2 = input.nextDouble();
        double angka3 = input.nextDouble();

        double average = (angka1 + angka2 + angka3) / 3;

        if (average >= 80)
            System.out.println("Rata-rata tinggi: " + Math.round(average));
        else
            System.out.println("Rata-rata: " + average);
    }
}
