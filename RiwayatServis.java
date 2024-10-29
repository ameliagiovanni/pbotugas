import java.util.ArrayList;
import java.util.List;

public class RiwayatServis {
    private Kendaraan kendaraan;
    private Pelanggan pelanggan;
    private List<LayananServis> layanan;

    public RiwayatServis(Kendaraan kendaraan, Pelanggan pelanggan) {
        this.kendaraan = kendaraan;
        this.pelanggan = pelanggan;
        this.layanan = new ArrayList<>();
    }

    public void tambahLayanan(LayananServis layananServis) {
        layanan.add(layananServis);
    }

    public void tampilkanRiwayat() {
        System.out.println("Riwayat Servis Kendaraan untuk Pelanggan: " + pelanggan.getNama());
        kendaraan.tampilkanInfo();
        for (LayananServis ls : layanan) {
            ls.tampilkanLayanan();
        }
    }
}
