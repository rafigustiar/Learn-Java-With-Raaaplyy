package Modul3PBO.DemoModul3PBO;

import java.util.Scanner;

public class User {



//    public void displayBooks() {
//        // Implementasi menampilkan daftar buku
//        Book bookObj = null;
//        Book historyBookObj = null;
//        System.out.println("Daftar Buku Tersedia:");
//        System.out.println("================================================================");
//        System.out.println("|| No. || Id Buku || Nama Buku || Author || Category || Stock ||");
//        int index = 1;
//        for (Main.BookList book : Main.arr_bookList) {
//            if (book != null) {
//                System.out.printf("|| %-4d || %-8s || %-20s || %-15s || %-10s || %-5d ||%n", index, bookObj.getBookId(), bookObj.getTitle(), bookObj.getAuthor(), historyBookObj.getCategory(), bookObj.getStock());
//                System.out.println("================================================================");
//                index++;
//            }
//        }
//    }

    public void displayBooks() {
        System.out.println("=========================================================================================================================");
        System.out.printf("|| %-25s || %-25s || %-25s || %-20s || %-3s ||", "ID Buku", "Nama Buku", "Penulis", "Kategori", "Stok");
        System.out.println("\n=========================================================================================================================");

        for (Main.BookList i : Main.arr_bookList) {
            System.out.printf("|| %-25s || %-25s || %-25s || %-20s || %-3s  ||\n", i.idbuku, i.judulbuku, i.penulisbuku, i.kategoriBuku, i.stokbuku);
        }

        System.out.println("=========================================================================================================================");

    }

    public void inputBook() {
        Admin adminObj = new Admin();
        Scanner inputuser = new Scanner(System.in);

        System.out.println("\n==== Tambah Buku ====");
        System.out.println("Pilih kategori buku :");
        System.out.println("1. History Book.");
        System.out.println("2. Story Book.");
        System.out.println("3. Text Book.");
        System.out.print("Pilih 1-3: ");
        String pilihan = inputuser.nextLine();

        String idBuku = adminObj.generateId();

        System.out.print("Masukkan Judul Buku : ");
        String judulBuku = inputuser.nextLine();

        System.out.print("Masukkan Nama Penulis : ");
        String penulisBuku = inputuser.nextLine();

        System.out.print("Masukkan Jumlah Stok Buku : ");
        int stokBuku = inputuser.nextInt();

        HistoryBook historyBookObj = new HistoryBook(idBuku, judulBuku, penulisBuku, stokBuku);
        StoryBook storyBookObj     = new StoryBook(idBuku, judulBuku, penulisBuku, stokBuku);
        TextBook textBookObj       = new TextBook(idBuku, judulBuku, penulisBuku, stokBuku);
        Book bookObj               = new Book(idBuku, judulBuku, penulisBuku, stokBuku);
        bookObj.setBookId(idBuku);
        bookObj.setTitle(judulBuku);
        bookObj.setAuthor(penulisBuku);
        bookObj.setStock(stokBuku);

        switch (pilihan){
            case "1":
                historyBookObj.setCategory("History Book");
                Main.arr_bookList.add(new Main.BookList(bookObj.getBookId(), bookObj.getTitle(), bookObj.getAuthor(), historyBookObj.getCategory(), bookObj.getStock()));
                break;
            case "2":
                storyBookObj.setCategory("Story Book");
                Main.arr_bookList.add(new Main.BookList(bookObj.getBookId(), bookObj.getTitle(), bookObj.getAuthor(), storyBookObj.getCategory(), bookObj.getStock()));
                break;
            case "3":
                textBookObj.setCategory("Text Book");
                Main.arr_bookList.add(new Main.BookList(bookObj.getBookId(), bookObj.getTitle(), bookObj.getAuthor(), textBookObj.getCategory(), bookObj.getStock()));
                break;
            default :
                System.out.println("Choose option (1-3)");
                inputBook();

        }
        System.out.println("==== Buku berhasil ditambahkan ====");
    }
}