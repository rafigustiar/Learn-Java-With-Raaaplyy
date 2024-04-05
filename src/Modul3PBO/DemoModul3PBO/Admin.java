package Modul3PBO.DemoModul3PBO;

import java.util.Random;
import java.util.Scanner;

public class Admin extends User {
    static String adminusername = "admin";
    static String adminpassword = "admin";

    static String username, password;
    static Scanner inputuser = new Scanner(System.in);



    public static void addstudent() {
        int loop;
        System.out.println("\n==== Tambah Mahasiswa ====");
        System.out.print("Masukkan Nama :");
        String nama = inputuser.nextLine();

        String nim;
        do {
            System.out.print("Masukkan NIM :");
            nim = inputuser.nextLine();
            if (nim.length() != 15) {
                System.out.println("\n> NIM harus 15 digit!");
                loop = 0;
            } else {
                loop = 1;
            }
        } while (loop == 0);
        System.out.print("Masukkan Fakultas :");
        String fakultas = inputuser.nextLine();

        System.out.print("Masukkan Jurusan :");
        String jurusan = inputuser.nextLine();

        Student.arr_userStudent.add(new Student.UserStudent(nama, nim, fakultas, jurusan));

        System.out.println("==== Mahasiswa berhasil didaftarkan ====");
    }
    @Override
    public void inputBook() {
        super.inputBook();
    }
    @Override
    public void displayBooks() {
        super.displayBooks();
    }
    static void displaystudent() {
        System.out.println("\n==== Daftar Mahasiswa ====");
        for (Student.UserStudent i : Student.arr_userStudent) {
            System.out.print("Nama : " + i.nama + "\n");
            System.out.print("NIM : " + i.nim + "\n");
            System.out.print("Fakultas : " + i.fakultas + "\n");
            System.out.print("Prodi : " + i.prodi + "\n");
            System.out.println("============================");

        }

    }
    boolean isAdmin() {
        System.out.println("\n==== Login Admin ====");
        System.out.print("Masukkan Username : ");
        username = inputuser.nextLine();

        System.out.print("Massukkan Password : ");
        password = inputuser.nextLine();

        if (username.equals(adminusername) && password.equals(adminpassword)) {
            System.out.println("==== Login berhasil ====\n");
            return true;
        } else {
            System.out.println("==== Pengguna tidak ditemukan ====");
            return false;
        }
    }

    public String generateId () {
        Random random = new Random();

        StringBuilder idTengah = new StringBuilder();
        StringBuilder idAkhir = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            idTengah.append(random.nextInt(4));
            idAkhir.append(random.nextInt(4));

        }
        return ("UMM-" + idTengah + "-" + idAkhir);

    }

    public void validasiLogin(){
        if(isAdmin()){
            Main.menuadmin();
        }else{
            isAdmin();
        }
    }
}