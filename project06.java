import java.util.Scanner;

public class project06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data mahasiswa
        System.out.print("NIM      : ");
        String nim = scanner.nextLine();
        
        System.out.print("NAMA     : ");
        String nama = scanner.nextLine();

        // Input data mata kuliah
        System.out.println("Masukkan informasi mata kuliah:");

        System.out.print("Kode Mata Kuliah : ");
        String kodeMk1 = scanner.next();
        System.out.print("Mata Kuliah      : ");
        String mk1 = scanner.next();
        System.out.print("SKS              : ");
        int sks1 = scanner.nextInt();
        System.out.print("Huruf Mutu       : ");
        String hurufMutu1 = scanner.next();
        System.out.print("Nilai            : ");
        int nilai1 = scanner.nextInt();

        System.out.print("Kode Mata Kuliah : ");
        String kodeMk2 = scanner.next();
        System.out.print("Mata Kuliah      : ");
        String mk2 = scanner.next();
        System.out.print("SKS              : ");
        int sks2 = scanner.nextInt();
        System.out.print("Huruf Mutu       : ");
        String hurufMutu2 = scanner.next();
        System.out.print("Nilai            : ");
        int nilai2 = scanner.nextInt();

        System.out.print("Kode Mata Kuliah : ");
        String kodeMk3 = scanner.next();
        System.out.print("Mata Kuliah      : ");
        String mk3 = scanner.next();
        System.out.print("SKS              : ");
        int sks3 = scanner.nextInt();
        System.out.print("Huruf Mutu       : ");
        String hurufMutu3 = scanner.next();
        System.out.print("Nilai            : ");
        int nilai3 = scanner.nextInt();

        // Cetak KHS
        System.out.println("\nKARTU HASIL STUDI");
        System.out.println("NIM      : " + nim);
        System.out.println("NAMA     : " + nama);
        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("| %-4s | %-16s | %-20s | %-4s | %-10s |\n",
                "No.", "Kode Mata Kuliah", "Mata Kuliah", "SKS", "Huruf Mutu", "Nilai");
        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("| %-2d | %-16s | %-20s | %-4d | %-10s | %-4d |\n", 1, kodeMk1, mk1, sks1, hurufMutu1, nilai1);
        System.out.printf("| %-2d | %-16s | %-20s | %-4d | %-10s | %-4d |\n", 2, kodeMk2, mk2, sks2, hurufMutu2, nilai2);
        System.out.printf("| %-2d | %-16s | %-20s | %-4d | %-10s | %-4d |\n", 3, kodeMk3, mk3, sks3, hurufMutu3, nilai3);
        System.out.println("-----------------------------------------------------------------------------");
    }
}
