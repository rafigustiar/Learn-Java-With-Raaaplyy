package Modul3PBO.CodeLabModul3PBO;

import java.util.Scanner;

public class Tabung extends BangunRuang {
    Scanner scanner = new Scanner(System.in);
    private double tinggi;
    private double jari_jari;

    Tabung(String nameBangun) {
        super(nameBangun);
    }

    @Override
    public void inputNilai() {
        super.inputNilai();
        System.out.println("=== KALKULATOR TABUNG ===");
        System.out.print("Input Tinggi : ");
        tinggi = scanner.nextDouble();
        System.out.print("Input Jari-Jari : ");
        jari_jari = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan() {
        double hasil = 2 * Math.PI * jari_jari * (jari_jari + tinggi);
        super.luasPermukaan();
        System.out.println("Hasil Luas Permukaan : " + hasil);
    }

    @Override
    public void volume() {
        double hasil = Math.PI * Math.pow(jari_jari, 2) * tinggi;
        super.volume();
        System.out.println("Hasil Volume : " + hasil);
    }
}