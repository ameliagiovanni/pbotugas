public class LayananServis {
    private String jenisLayanan;
    private double biaya;

    public LayananServis(String jenisLayanan, double biaya) {
        this.jenisLayanan = jenisLayanan;
        this.biaya = biaya;
    }

    public void tampilkanLayanan() {
        System.out.println("Jenis Layanan: " + jenisLayanan + ", Biaya: Rp " + biaya);
    }
}
