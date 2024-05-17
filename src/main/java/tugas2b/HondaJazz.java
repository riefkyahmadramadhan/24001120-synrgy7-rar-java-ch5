package tugas2b;

public class HondaJazz extends Car {
    private String warna;

    public HondaJazz(int roda, int kapasitasTangki, String warna) {
        super(roda, kapasitasTangki);
        this.warna = warna;
    }

    @Override
    public String pindahTransmisi(int gigi) {
        return "Honda Jazz roda " + this.roda + ", kapasitas tangki " + this.kapasitasTangki + ", warna " + this.warna + ", pindah ke transmisi " + gigi;
    }
}
