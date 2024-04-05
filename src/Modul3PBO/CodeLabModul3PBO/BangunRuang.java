package Modul3PBO.CodeLabModul3PBO;

public class BangunRuang {
    private String name;

    BangunRuang(String name) {
        this.name = name;
    }

    public void inputNilai() {
        System.out.println("");
    }

    public void luasPermukaan() {
        System.out.println("Menghitung Luas Permukaan " + name);
    }

    public void volume() {
        System.out.println("Menghitung Volume " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
