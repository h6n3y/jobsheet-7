import java.util.Scanner;

public class WhileGaji04 {
    public static void main(String[] args) {

        // Scanner
        Scanner scan = new Scanner(System.in);

        // Tipe Data
        int jumlahKaryawan, jumlahjamLembur;
        double gajiLembur, totalgajiLembur;
        String jabatan;

        // Inisialisasi
        gajiLembur = 0;
        totalgajiLembur = 0;

        // Proses
        System.out.print("Masukkan Jumlah Karyawan : ");
        jumlahKaryawan = scan.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {

            System.out.println("Pilihlah Jabatan (Direktur, Manajer, atau Karyawan)");
            System.out.print("Masukkan Jabatan Karyawan Ke - " + (i + 1) + " : ");
            jabatan = scan.nextLine();

            System.out.println("Masukkan Jumlah Jam Lembur : ");
            jumlahjamLembur = scan.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("Direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("Manajer")) {
                gajiLembur = jumlahjamLembur + 100000;
            } else if (jabatan.equalsIgnoreCase("Karyawan")) {
                gajiLembur = jumlahjamLembur + 75000;
            } else {
                i -= 1;
                System.out.println("Jabatan Invalid");
                continue;
            }

            totalgajiLembur += gajiLembur;

        }

        System.out.println("Total Gaji Lembur : " + totalgajiLembur);

    }
}