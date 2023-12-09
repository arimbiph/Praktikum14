import java.util.Scanner;
public class investasiIterative06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah investasi awal (misalnya 1000): ");
        double investasiAwal = scanner.nextDouble();

        System.out.print("Masukkan jumlah tahun investasi: ");
        int tahunInvestasi = scanner.nextInt();
        System.out.println("Hasil investasi emas setiap tahun:");

        double saldo = investasiAwal;
        for (int tahun = 1; tahun <= tahunInvestasi; tahun++) {
            double keuntunganTahunan = saldo * 0.117; // 11,7% keuntungan
            saldo += keuntunganTahunan;
            System.out.printf("Tahun %d: %.2f%n", tahun, saldo);
        }
        System.out.println("\nTotal saldo setelah " + tahunInvestasi + " tahun: " + saldo);
        scanner.close();
    }
}