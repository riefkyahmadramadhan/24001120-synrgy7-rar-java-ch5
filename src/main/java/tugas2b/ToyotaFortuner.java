package tugas2b;

public class ToyotaFortuner extends Car {
    private boolean penggerakEmpatRoda;

    public ToyotaFortuner(int roda, int kapasitasTangki, boolean penggerakEmpatRoda) {
        super(roda, kapasitasTangki);
        this.penggerakEmpatRoda = penggerakEmpatRoda;
    }

    @Override
    public String pindahTransmisi(int gigi) {
        return "Honda Jazz roda " + this.roda + ", kapasitas tangki " + this.kapasitasTangki + ", Mobil penggerak empat roda = " + this.penggerakEmpatRoda + ", pindah ke transmisi " + gigi;
    }
}
