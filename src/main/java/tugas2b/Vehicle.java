package tugas2b;

public class Vehicle {
    protected int roda;

    public Vehicle(int roda) {
        this.roda = roda;
    }

    public String bergerakMaju() {
        return "Kendaraan bergerak maju";
    }

    public String belok(String arah) {
        return "Kendaraan belok " + arah;
    }
}
