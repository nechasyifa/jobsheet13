import java.util.Scanner;

public class Kubus20 {

    static int hitungVolume(int s) {
        int vol = s * s * s;
        return vol;
    }

    static int hitungLuasPermukaan(int s) {
        int luas = s * s;
        int luasPermukaan = luas * 6;
        return luasPermukaan;
    }

    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        int s, v, lp;
        System.out.print("Masukkan sisi: ");
        s = input20.nextInt();

        v = hitungVolume(s);
        System.out.println("Volume kubus: " + v);

        lp = hitungLuasPermukaan(s);
        System.out.println("Luas permukaan kubus: " + lp);        
    }
}