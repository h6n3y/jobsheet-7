import java.util.Scanner;

public class ForKelipatan04 {
    public static void main(String[] args) {

        // Scanner
        Scanner scan = new Scanner(System.in);

        // Tipe Data
        int kelipatan, total, counter;

        total = 0;
        counter = 0;

        // Proses
        System.out.print("Masukkan Bilangan Kelipatan (1-9) : ");
        kelipatan = scan.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
        }

        System.out.printf("Bayaknya Bilangan %d dari 1 sampai 50 adalah %d\n",kelipatan, counter);
        System.out.printf("Total Bilangan Kelipatan %d dari 1 sampai 50 adalah %d\n",kelipatan, total);
    }
}
