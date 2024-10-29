public class Motor extends Kendaraan {
    private String tipe;

    public Motor(String platNomor, String model, String tipe) {
        super(platNomor, model);
        this.tipe = tipe;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tipe Motor: " + tipe);
    }
}
