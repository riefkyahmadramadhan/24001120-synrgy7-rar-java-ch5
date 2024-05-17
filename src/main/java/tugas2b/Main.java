package tugas2b;

public class Main {
    public static void main(String[] args) {
        HondaJazz hondaJazz = new HondaJazz(4, 50, "Merah");
        System.out.println(hondaJazz.pindahTransmisi(2));

        ToyotaFortuner toyotaFortuner = new ToyotaFortuner(4, 70, true);
        System.out.println(toyotaFortuner.pindahTransmisi(3));

        SuzukiKatana suzukiKatana = new SuzukiKatana(4, 60, true);
        System.out.println(suzukiKatana.pindahTransmisi(4));
    }
}