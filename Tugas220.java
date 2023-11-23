import java.util.Scanner;

public class Tugas220 {
    static int[][] nilai; 
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input20.nextInt();

        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = input20.nextInt();

        nilai = new int[jumlahMahasiswa][jumlahTugas];

        inputNilai();
        tampilNilai();
        hariNilaiTertinggi();
        mahasiswaNilaiTertinggi();
    }

    // Fungsi untuk menginput data nilai mahasiswa
    static void inputNilai() {
        Scanner input20 = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Masukkan nilai tugas mahasiswa ke-" + (i + 1) + " minggu ke-" + (j + 1) + ": ");
                nilai[i][j] = input20.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan seluruh nilai mahasiswa
    static void tampilNilai() {
        System.out.println("+-----------------------------------------------------+");
        System.out.println("|" + "\t\tNilai Tugas Mahasiswa   \t\t" + "|");
        System.out.println("+-----------------------------------------------------+");
        System.out.print("      ");
        for (int i = 0; i < nilai[0].length; i++) {
            System.out.print("Mg-" + (i + 1) + "\t");
        }
        System.out.println("\n+-----------------------------------------------------+");    
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Mh-" + (i + 1) + ": ");
        for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println("+-----------------------------------------------------+");
    }

    // Fungsi untuk mencari hari dengan nilai tertinggi
    static void hariNilaiTertinggi() {
        int nilaiTertinggi = nilai[0][0];
        int hariTertinggi = 0;

        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilaiTertinggi < nilai[i][j]) {
                    nilaiTertinggi = nilai[i][j];
                    hariTertinggi = j + 1;
                }
            }
        }

        System.out.println("Nilai tertinggi terdapat pada hari ke-" + hariTertinggi);
    }

    // Fungsi untuk menampilkan mahasiswa dengan nilai tertinggi
    static void mahasiswaNilaiTertinggi() {
        int nilaiTertinggi = nilai[0][0];
        int mahasiswaTertinggi = 0;
        int mingguTertinggi = 0;

        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilaiTertinggi < nilai[i][j]) {
                    nilaiTertinggi = nilai[i][j];
                    mahasiswaTertinggi = i + 1;
                    mingguTertinggi = j + 1;
                }
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi adalah mahasiswa ke-" + mahasiswaTertinggi + ", dengan Nilai " + nilaiTertinggi + ", dari minggu ke-" + mingguTertinggi);
    }
}
