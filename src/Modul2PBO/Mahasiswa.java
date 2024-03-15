package Modul2PBO;

class Mahasiswa {
    String nama;
    String nim;
    String jurusan;

    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public static void dataUniversitas() {
        System.out.println("Data Mahasiswa Universitas Muhammadiyah Malang :");
    }

    public void listDataMahasiswa() {
        System.out.print("Nama      : " + nama);
        System.out.print("\nNIM       : " + nim);
        System.out.println("\nJurusan   : " + jurusan);
    }
}
