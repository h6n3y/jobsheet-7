import java.util.Scanner;

public class WhileKelipatan04 {
    public static void main(String[] args) {

        // Scanner
        Scanner scan = new Scanner(System.in);

        // Tipe Data
        int kelipatan, total, counter;
        float ratarata;

        // Inisialisasi
        total = 0;
        counter = 0;

        // Proses
        System.out.print("Masukkan Bilangan Kelipatan (1-9) : ");
        kelipatan = scan.nextInt();

        // Inisialisasi - 2.0
        int i = 1;

        while (i <= 50) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }

            // Update
            i++;

        }

        // Proses Rata-Rata
        ratarata = (float) total / counter;

        System.out.printf("Bayaknya Bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total Bilangan Kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.printf("Rata-Rata Bilangan dari Kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, ratarata);

    }
}
