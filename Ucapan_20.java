import java.util.Scanner;

public class Ucapan_20 {

    public static String PenerimaUcapan() {
        Scanner input20 = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = input20.nextLine();
        input20.close();
        return namaOrang;
    }

    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + "\nMay the force be with you.");
    }
}
