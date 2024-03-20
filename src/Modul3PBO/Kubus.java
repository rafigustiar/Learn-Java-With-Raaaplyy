package Modul3PBO;

import java.util.Scanner;

public class Kubus extends BangunRuang {
    Scanner scanner = new Scanner(System.in);
    private double sisi;

    Kubus(String nameBangun) {
        super(nameBangun);
    }

    @Override
    public void inputNilai() {
        super.inputNilai();
        System.out.println("=== KALKULATOR KUBUS ===");
        System.out.print("Input Panjang Sisi : ");
        sisi = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan() {
        double hasil = 6 * sisi * sisi;
        super.luasPermukaan();
        System.out.println("Hasil Luas Permukaan : " + hasil);
    }

    @Override
    public void volume() {
        double hasil = Math.pow(sisi, 3);
        super.volume();
        System.out.println("Hasil Volume : " + hasil);
    }
}
