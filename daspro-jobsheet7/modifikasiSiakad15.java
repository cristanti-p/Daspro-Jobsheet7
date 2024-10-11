import java.util.Scanner;

public class modifikasiSiakad15 {
    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);
        double nilai,tertinggi=0,terendah=100;
        int jumlahLulus=0, jumlahTidakLulus=0;
        double tidakLulus=60.0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + i + ": ");
            nilai = util.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= tidakLulus) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }
        util.close();
        System.out.println("\n-----------------------------\n");
        System.out.println("Nilai tertinggi   : " + tertinggi);
        System.out.println("Nilai terendah    : " + terendah);
        System.out.println("Mahasiswa yang Lulus  : " + jumlahLulus);
        System.out.println("Mahasiswa yang Tidak Lulus   : " + jumlahTidakLulus);
        System.out.println("\n-----------------------------\n");
    }
}
