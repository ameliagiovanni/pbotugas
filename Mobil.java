public class Mobil extends Kendaraan {
    private int kapasitasMesin;

    public Mobil(String platNomor, String model, int kapasitasMesin) {
        super(platNomor, model);
        this.kapasitasMesin = kapasitasMesin;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kapasitas Mesin: " + kapasitasMesin + " cc");
    }
}
