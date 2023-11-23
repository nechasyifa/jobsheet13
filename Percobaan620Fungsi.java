import java.util.Scanner;

public class Percobaan620Fungsi {

    static int hitungLuas (int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume (int tinggi, int a, int b) {
        int volume = hitungLuas(a,b) * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        int p, l, t, L, vol;
        System.out.print("Masukkan panjang: ");
        p = input20.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input20.nextInt();
        System.out.print("Masukan tinggi: ");
        t = input20.nextInt();

        L = hitungLuas(p,l);
        System.out.println("Luas Persegi Panjang adalah " + L);

        vol = hitungVolume(t,p,l);
        System.out.println("Volume balok adalah " + vol);
    }
}
