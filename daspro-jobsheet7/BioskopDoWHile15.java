import java.util.Scanner;
/**
 * BioskopDoWHile15
 */
public class BioskopDoWHile15 {
    public static void main(String[] args) {
      Scanner util = new Scanner(System.in);  
      int totalTiket=0, hargaTiket=50000, jumlahTiket;
      double totalpenjualan=0;

      while (true){
        System.out.print("Masukkan Jumlah Tiket yang terjual (ketik 0 untuk selesai) ");
        jumlahTiket = util.nextInt();

        if (jumlahTiket == 0) {
            break;
        }
        if (jumlahTiket < 0) {
            System.out.print("Jumlah Tiket tidak valid! Silahkan masukkan ulang");
            continue;
        }
        double totalHarga = jumlahTiket * hargaTiket;

        if (jumlahTiket > 10) {
            totalHarga *=0.85;
            System.out.println("Anda Mendapatkan Diskon 15%");
        } else if (jumlahTiket > 4) {
            System.out.println("Anda Mendapatkan Diskon 10%");
            totalHarga *= 0.90;
        }
        totalTiket += jumlahTiket;
        totalpenjualan += totalHarga;

        System.out.println("Total harga tiket untuk " + jumlahTiket + " Tiket Rp " + totalHarga);
      }
      util.close();
      System.out.println("\nTotal tiket yang terjual hari ini: " + totalTiket);
      System.out.println("Total penjualan tiket: Rp " + totalpenjualan);
    } 
}