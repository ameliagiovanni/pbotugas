public class Kendaraan {
    private String platNomor;
    private String model;

    public Kendaraan(String platNomor, String model) {
        this.platNomor = platNomor;
        this.model = model;
    }

    public void tampilkanInfo() {
        System.out.println("Plat Nomor: " + platNomor + ", Model: " + model);
    }
}
