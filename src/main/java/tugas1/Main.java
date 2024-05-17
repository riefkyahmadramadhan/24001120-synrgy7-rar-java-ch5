package tugas1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        double waktu, biayaJam, biayaHari;
        int waktuHari, waktuAkhir;

        Scanner s = new Scanner(System.in);

        System.out.println("Selamat datang di sistem parkir. Kami dapat menghitung baiaya parkir anda sesuai dengan waktu parkir anda");
        System.out.print("Silakan masukkan total waktu parkir anda dalam jam: ");
        waktu = s.nextInt();

        biayaJam = (1 + ((waktu-5) * 0.5));

        if (waktu >= 24){
            waktuHari = (int)waktu/24;
            waktuAkhir = (int)waktu % 24;
            biayaHari = (waktuHari * 15) + (waktuAkhir * 0.5);
            System.out.println("Biaya total: " + biayaHari + "$");
        } else if (waktu >=0 && waktu <=5 ){
            System.out.println("Biaya total 1$");
        } else if (waktu >5 && waktu <24) {
            System.out.println("Biaya total: " + biayaJam + "$");
        } else {
            System.out.println("masukan tidak valid");
        }
    }
}


