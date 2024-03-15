package KegiatanModul2PBO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Student> students = new ArrayList<>();
    private static ArrayList<Book> books = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in); // Pindahkan Scanner ke level main

    public static void main(String[] args) {
        books.add(new Book("0001", "Filosofi Teras.", "Henry", "Filsuf", 2));
        books.add(new Book("0002", "Kuala Kumal.", "Radit", "Komedi", 2));
        books.add(new Book("0003", "Laskar Pelangi", "Andrea", "Novel", 1));

        while (true) {
            System.out.println("=====  UMM Library System =====");
            System.out.println("1. Login sebagai Mahasiswa.");
            System.out.println("2. Login sebagai Admin.");
            System.out.println("3. Keluar.");
            System.out.print("Pilih menu : ");
            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    loginAsStudent();
                    break;
                case 2:
                    log_admin();
                    break;
                case 3:
                    System.out.println("Terima kasih telah mengunjungi UMM Library.");
                    scanner.close(); // Tutup Scanner di sini sebelum keluar dari program
                    System.exit(0);
                default:
                    System.out.println("Input tidak valid. Pilih sesuai menu di atas. Silahkan coba lagi.");
            }
        }
    }

    public static void loginAsStudent() {
        System.out.println("===== Mahasiswa Menu ====");
        System.out.print("Masukkan NIM Anda (ketik 99 untuk kembali): ");
        String nim = scanner.next();

        if (nim.equals("99")) {
            System.out.println("Kembali ke menu utama.");
            return;
        }

        Student student = findStudentByNim(nim);

        if (student == null) {
            System.out.println("Mahasiswa tidak ditemukan. Kembali ke menu utama.");
            return;
        }

        while (true) {
            System.out.println("\n===== Mahasiswa Menu ====");
            System.out.println("1. Buku Terpinjam.");
            System.out.println("2. Pinjam Buku.");
            System.out.println("3. Keluar.");
            System.out.print("Pilih menu : ");
            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    student.viewBorrowedBooks();//memanggil metode dari objek student
                    break;
                case 2:
                    student.borrowBook(books, scanner);
                    break;
                case 3:
                    System.out.println("Keluar dari Menu Mahasiswa.");
                    return;
                default:
                    System.out.println("Input tidak valid. Pilih sesuai menu di atas. Silakan coba lagi.");
            }
        }
    }

    static void log_admin(){
        System.out.print("Masukan username Admin : ");
        Scanner scan = new Scanner(System.in);
        String user = scan.nextLine();
        System.out.print("Masukan pasword Admin : ");
        String pwd = scan.nextLine();

        if (user.equals(Admin.adminUsername)&&pwd.equals(Admin.adminPassword)) {
            System.out.println();
            Main.MenuAdmin();
        }else{
            System.out.println("Data tidak valid. Silahkan Coba lagi.\n");
        }
    }

    public static Student findStudentByNim(String nim) {
        for (Student s : students) {
            if (s.getNim().equals(nim)) {
                return s;
            }
        }
        return null;
    }

    public static void MenuAdmin() {
        System.out.println("===== Admin Menu =====");
        System.out.println("1. Tambah Mahasiswa.");
        System.out.println("2. Tampilkan Mahasiswa Terdaftar.");
        System.out.println("3. Keluar.");
        System.out.print("Pilih menu : ");
        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                addStudent();
                break;
            case 2:
                displayRegisteredStudents();
                break;
            case 3:
                System.out.println("Keluar dari Menu Admin.");
                break;
            default:
                System.out.println("Input tidak valid. Pilih sesuai menu di atas. Silakan coba lagi.");
        }
    }

    public static void addStudent() {
        System.out.print("Masukkan Nama Mahasiswa : ");
        String name = scanner.next();
        System.out.print("Masukkan NIM Mahasiswa : ");
        String nim = scanner.next();
        System.out.print("Masukkan Program Studi Mahasiswa : ");
        String program = scanner.next();
        System.out.print("Masukkan Fakultas Mahasiswa : ");
        String faculty = scanner.next();


        students.add(new Student(name, faculty, nim, program));
        System.out.println("Mahasiswa berhasil ditambahkan!");
    }

    public static void displayRegisteredStudents() {
        System.out.println("\n===== Mahasiswa Terdaftar =====");
        System.out.printf("%-20s %-20s %-15s %-20s\n", "Nama", "Fakultas", "NIM", "Program Studi");
        for (Student student : students) {
            System.out.printf("%-20s %-20s %-15s %-20s\n", student.getName(), student.getFaculty(), student.getNim(), student.getProgram());
        }
    }
}
