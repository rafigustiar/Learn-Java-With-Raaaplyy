package Modul2PBO.CodeLabModul2PBO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int pilihan = 0;

        while (pilihan != 3) {
            System.out.println("\n=== UNIVERSITAS MUHAMMADIYAH MALANG ===");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan : ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahDataMahasiswa(input, daftarMahasiswa);
                    break;

                case 2:
                    tampilkanDataMahasiswa(daftarMahasiswa);
                    break;

                case 3:
                    System.out.println("Terima Kasih Sudah Berkunjung!");
                    break;

                default:
                    System.out.println("Pilihan tidak ada. Silakan pilih lagi.");
                    break;
            }
        }
        input.close();
    }

    public static void tambahDataMahasiswa(Scanner input, ArrayList<Mahasiswa> daftarMahasiswa) {
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine();

        String nim;
        while (true) {
            System.out.print("Masukkan NIM Mahasiswa : ");
            nim = input.nextLine();
            if (nim.length() == 15) {
                break;
            } else {
                System.out.println("NIM harus 15 digit! Silakan coba lagi.");
            }
        }

        System.out.print("Masukkan Jurusan Mahasiswa: ");
        String jurusan = input.nextLine();

        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan);
        daftarMahasiswa.add(mahasiswa);

        System.out.println("Data Mahasiswa berhasil diinput.");
    }

    public static void tampilkanDataMahasiswa(ArrayList<Mahasiswa> daftarMahasiswa) {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Belum ada data Mahasiswa yang diinput.");
        } else {
            Mahasiswa.dataUniversitas();
            for (Mahasiswa mhs : daftarMahasiswa) {
                mhs.listDataMahasiswa();
            }
        }
    }
}
