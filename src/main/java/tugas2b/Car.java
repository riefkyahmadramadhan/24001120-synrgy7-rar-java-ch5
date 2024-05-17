package tugas2b;

public class Car extends Vehicle {
    int kapasitasTangki;

    public Car(int roda, int kapasitasTangki) {
        super(roda);
        this.kapasitasTangki = kapasitasTangki;
    }

    public String pindahTransmisi(int gigi) {
        return "Mobil pindah ke transmisi " + gigi;
    }
}
