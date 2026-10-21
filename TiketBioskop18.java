
import java.util.Scanner;

public class TiketBioskop18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket;
        int totalTiket = 0;
        int hargaTiket = 50000;
        int totalPenjualan = 0;
        int totalBayar;
        double diskon;

        System.out.println("=== PROGRAM PENJUALAN TIKET BIOSKOP ===");

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid!");
                System.out.println("Silakan masukkan ulang.");
                continue;
            }

            if (jumlahTiket == 0) {
                break;
            }

            totalBayar = jumlahTiket * hargaTiket;
            diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            totalBayar -= (int) (totalBayar * diskon);

            System.out.println("Jumlah tiket: " + jumlahTiket);
            System.out.println("Diskon: " + (int) (diskon * 100) + "%");
            System.out.println("Total pembayaran: Rp" + totalBayar);

            totalTiket += jumlahTiket;
            totalPenjualan += totalBayar;
        }

        System.out.println("\n=== TOTAL PENJUALAN HARIAN ===");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total harga penjualan: Rp" + totalPenjualan);

        sc.close();
    }
}
