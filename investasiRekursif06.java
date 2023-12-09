import java.util.Scanner;
public class investasiRekursif06 {
    public static void main(String[] args) {
        int tahun = 10;
        double investasiAwal = 10000; 
        double hasilInvestasi = hitungInvestasiEmas(investasiAwal, tahun, 0.117);   
        System.out.println("Hasil investasi setelah " + tahun + " tahun: " + hasilInvestasi);
    }
    public static double hitungInvestasiEmas(double investasiAwal, int tahun, double tingkatKeuntungan) {
        if (tahun <= 0) {
            return investasiAwal;
        } else {
            double keuntunganTahunan = investasiAwal * tingkatKeuntungan;
            double totalInvestasiTahunIni = investasiAwal + keuntunganTahunan;
            return hitungInvestasiEmas(totalInvestasiTahunIni, tahun - 1, tingkatKeuntungan);
     }
   }
}