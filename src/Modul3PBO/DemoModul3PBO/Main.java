package Modul3PBO.DemoModul3PBO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }


    //===============================================================================================================//
    static ArrayList<BookList> arr_bookList = new ArrayList<>();

    //================================================================
    static Scanner inputpilihan = new Scanner(System.in);
    static Scanner inputuser = new Scanner(System.in);
    //================================================================
    static String NIM;
//================================================================

    static class BookList{
        String idbuku, judulbuku, penulisbuku, kategoriBuku;
        int stokbuku;


        public BookList(String idbuku, String judulbuku, String penulisbuku, String kategoriBuku, int stokbuku){


            this.idbuku          = idbuku;
            this.judulbuku       = judulbuku;
            this.penulisbuku     = penulisbuku;
            this.kategoriBuku    = kategoriBuku;
            this.stokbuku        = stokbuku;



        }
    }

    //================================================================
    static void menu(){
        Admin adminObj = new Admin();
        int menuloop = 0;

        do{
            System.out.println("\n==== UMM Library System ====");
            System.out.println("1. Login as Student.");
            System.out.println("2. Login as Admin.");
            System.out.println("3. Exit.");
            System.out.print("Choose option (1-3): ");

            int pilihan = inputpilihan.nextInt();
            switch (pilihan) {
                case 1:
                    Student.loginstudent();
                    menustudent();
                    break;

                case 2:
                    adminObj.validasiLogin();
                    menuadmin();

                    break;

                case 3:
                    menuloop = 1;
                    break;
            }
        }while(menuloop == 0);
    }

    static void inputNIM(){
        System.out.println("Masukkan NIM : ");
        NIM = inputuser.nextLine();
    }

    static void menuadmin() {
        Admin adminObject = new Admin();
        System.out.println("=== Dashboard Admin ===");
        System.out.println("1. Tambah Mahasiswa.");
        System.out.println("2. Tampilkan Mahasiswa.");
        System.out.println("3. Input Buku.");
        System.out.println("4. Tampilkan Daftar Buku.");
        System.out.println("5. Logout.");
        System.out.print("Choose option (1-5): ");

        int pilihan = inputpilihan.nextInt();
        switch (pilihan) {
            case 1:
                Admin.addstudent();
                menuadmin();
                break;
            case 2:
                Admin.displaystudent();
                menuadmin();
                break;
            case 3:
                adminObject.inputBook();
                menuadmin();
                break;
            case 4:
                adminObject.displayBooks();
                menuadmin();
                break;
            case 5:
                menu();
                break;
            default:
                System.out.print("Choose option (1-5)");
                menuadmin();
        }


    }

    static void menustudent(){
        Student studentObject = new Student();
        Student.displayInfo();
        System.out.println("\n==== Dashboard Student ====");
        System.out.println("1. Buku Terpinjam.");
        System.out.println("2. Pinjam Buku.");
        System.out.println("3. Kembalikan Buku.");
        System.out.println("4. Logout.");
        System.out.println("\n Choose option (1-4): ");

        int pilihan = inputpilihan.nextInt();
        switch (pilihan){
            case 1:
                Student.showBorrowedBooks();
                menustudent();
                break;
            case 2:
                studentObject.displayBooks();
                Student.borrowedBooks();
                menustudent();
                break;
            case 3:
                Student.showBorrowedBooks();
                Student.returnBooks();
                menustudent();
                break;
            case 4:
                Student.logout();
                break;
            default:
                System.out.print("Choose option (1-4)");
                menustudent();
        }

    }
}