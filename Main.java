import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<RiwayatServis> riwayatServisList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Sistem Manajemen Kendaraan Bengkel ===");
            System.out.println("1. Tambah Kendaraan dan Pelanggan");
            System.out.println("2. Tambah Layanan Servis");
            System.out.println("3. Tampilkan Riwayat Servis");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (pilihan) {
                case 1:
                    tambahKendaraan(scanner);
                    break;
                case 2:
                    tambahLayanan(scanner);
                    break;
                case 3:
                    tampilkanRiwayatServis();
                    break;
                case 4:
                    running = false;
                    System.out.println("Keluar dari sistem.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }

    private static void tambahKendaraan(Scanner scanner) {
        System.out.print("Masukkan jenis kendaraan (Mobil/Motor): ");
        String jenis = scanner.nextLine();
        System.out.print("Masukkan plat nomor: ");
        String platNomor = scanner.nextLine();
        System.out.print("Masukkan model: ");
        String model = scanner.nextLine();

        Kendaraan kendaraan;
        if (jenis.equalsIgnoreCase("Mobil")) {
            System.out.print("Masukkan kapasitas mesin (cc): ");
            int kapasitasMesin = scanner.nextInt();
            kendaraan = new Mobil(platNomor, model, kapasitasMesin);
        } else {
            System.out.print("Masukkan tipe motor: ");
            String tipe = scanner.nextLine();
            kendaraan = new Motor(platNomor, model, tipe);
        }

        System.out.print("Masukkan nama pelanggan: ");
        String nama = scanner.nextLine();
        Pelanggan pelanggan = new Pelanggan(nama);
        RiwayatServis riwayatServis = new RiwayatServis(kendaraan, pelanggan);
        riwayatServisList.add(riwayatServis);

        System.out.println("Kendaraan dan pelanggan berhasil ditambahkan.");
    }

    private static void tambahLayanan(Scanner scanner) {
        if (riwayatServisList.isEmpty()) {
            System.out.println("Belum ada riwayat servis. Silakan tambahkan kendaraan terlebih dahulu.");
            return;
        }

        System.out.print("Berapa banyak layanan yang ingin ditambahkan? ");
        int jumlahLayanan = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        for (int i = 0; i < jumlahLayanan; i++) {
            System.out.println("Layanan " + (i + 1) + ":");
            System.out.print("Masukkan jenis layanan: ");
            String jenisLayanan = scanner.nextLine();
            System.out.print("Masukkan biaya layanan: Rp ");
            double biaya = scanner.nextDouble();
            scanner.nextLine(); // Clear buffer

            // Menambahkan layanan ke riwayat servis terakhir
            if (!riwayatServisList.isEmpty()) {
                riwayatServisList.get(riwayatServisList.size() - 1).tambahLayanan(new LayananServis(jenisLayanan, biaya));
            }
        }

        System.out.println("Layanan berhasil ditambahkan.");
    }

    private static void tampilkanRiwayatServis() {
        if (riwayatServisList.isEmpty()) {
            System.out.println("Belum ada riwayat servis.");
            return;
        }

        for (RiwayatServis riwayat : riwayatServisList) {
            riwayat.tampilkanRiwayat();
            System.out.println("---------------------------------------");
        }
    }
}
