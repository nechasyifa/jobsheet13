import java.util.Scanner;

public class Percobaan620 {

    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.print("Masukkan panjang: ");
        p = input20.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input20.nextInt();
        System.out.print("Masukan tinggi: ");
        t = input20.nextInt();

        L = p * l;
        System.out.println("Luas Persegi Panjang adalah " + L);

        vol = p * l * t;
        System.out.println("Volume balok adalah " + vol);
    }
}
