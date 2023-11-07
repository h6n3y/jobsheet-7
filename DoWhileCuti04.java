import java.util.Scanner;

public class DoWhileCuti04 {
    public static void main(String[] args) {

        // Scanner
        Scanner scan = new Scanner(System.in);

        // Tipe Data
        int jatahCuti, jumlahHari;
        String konfirmasi;

        // Proses
        System.out.print("Masukkan Jatah Cuti : ");
        jatahCuti = scan.nextInt();

        do {
            System.out.print("Apakah Anda ingin mengambil Jatah Cuti? (Ya atau Tidak)");
            konfirmasi = scan.next();

            if (konfirmasi.equalsIgnoreCase("Ya")) {
                System.out.println("Jumlah Hari : ");
                jumlahHari = scan.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa Jatah Cuti : " + jatahCuti);
                } else {
                    System.out.println("Sisa Jatah Cuti Anda tidak mencukupi");
                }
            } else {
                System.out.println("Terima kasih!");
                break;
            }

        } while (jatahCuti > 0);
    }
}