import java.util.Scanner;

public class modifikasiSiakadWhile15 {
    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);
        int Nilai ,jumlah = 5, i = 0;
        System.out.print("Masukkan jumlah mahasiswa");
        jumlah = util.nextInt();
        while (i < jumlah) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            Nilai = util.nextInt();
            if (Nilai < 0 || Nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid");
                continue;
            }
            if (Nilai > 80 && Nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A ");
                System.out.println("Bagus, pertahankan nilainya");
            } else if (Nilai > 73 && Nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B+");
            } else if (Nilai > 65 && Nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B");
            } else if (Nilai > 60 && Nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C+");
            } else if (Nilai > 50 && Nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C");
            } else if (Nilai > 39 && Nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah E");
            }
            i++;
        }
        util.close();

    }
}
