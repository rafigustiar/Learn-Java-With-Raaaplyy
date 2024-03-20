package Modul3PBO;

public class App {
    public static void main(String[] args) {
        Tabung tabung = new Tabung("Tabung");
        Kubus kubus = new Kubus("Kubus");
        Balok balok = new Balok("Balok");

        kubus.inputNilai();
        kubus.luasPermukaan();
        kubus.volume();

        tabung.inputNilai();
        tabung.luasPermukaan();
        tabung.volume();

        balok.inputNilai();
        balok.luasPermukaan();
        balok.volume();
    }
}
