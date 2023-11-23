import java.util.Scanner;

public class UcapanTerimaKasih_20 {

    public static String PenerimaUcapan() {
        Scanner input20 = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = input20.nextLine();
        input20.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you for being the best teacher in the world.\n" +
                "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void UcapanTambahan(String ucapanTambahan) {
        System.out.println(ucapanTambahan);
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
        String ucapan = "You're Amazing!";
        UcapanTambahan(ucapan);
    }
}