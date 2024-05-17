package tugas2b;

public class SuzukiKatana extends Car {
    private boolean siapOffRoad;

    public SuzukiKatana(int roda, int kapasitasTangki, boolean siapOffRoad) {
        super(roda, kapasitasTangki);
        this.siapOffRoad = siapOffRoad;
    }

    @Override
    public String pindahTransmisi(int gigi) {
        return "Honda Jazz roda " + this.roda + ", kapasitas tangki " + this.kapasitasTangki + ", Mobil siap offroad = " + this.siapOffRoad + ", pindah ke transmisi " + gigi;
    }
}
