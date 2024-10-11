import java.util.Scanner;

public class KafeDoWhile15 {
    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);
        int kopi, teh, roti;
        String namaPelanggan;
        double totalHarga,hargaKopi=12000, hargaTeh=7000,hargaRoti=20000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = util.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("jumlah kopi: ");
            kopi = util.nextInt();
            System.out.print("jumlah teh: ");
            teh = util.nextInt();
            System.out.print("jumlah roti: ");
            roti = util.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            util.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai.");
    }
}
