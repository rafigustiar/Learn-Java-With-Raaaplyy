import java.util.Scanner;

class Main {

    private static final String UsernameAdmin = "admin123";
    private static final String PasswordAdmin = "admin123";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("==== Welcome to UMM Academy! ====");

        boolean isLoggedIn = false;
        while (!isLoggedIn) {
            System.out.println("\nSilakan pilih jenis login:");
            System.out.println("1. Mahasiswa");
            System.out.println("2. Admin");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    isLoggedIn = mahasiswaLogin(scanner);
                    break;
                case 2:
                    isLoggedIn = adminLogin(scanner);
                    break;
                case 3:
                    System.out.println("Terima kasih telah mengakses UMM Academy!.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Pilih sesuai pilihan.");
            }
        }

    }

    private static boolean mahasiswaLogin(Scanner scanner) {
        System.out.println("Masukkan NIM mahasiswa: ");
        System.out.println("Panjang NIM harus tepat 15 karakter.");
        String nim = scanner.nextLine();
        if (nim.length() == 15) {
            System.out.println("login berhasil sebagai Mahasiswa");
            return true;
        }else {
            System.out.println("NIM tidak valid.");
            return false;
        }
    }

    private static boolean adminLogin(Scanner scanner) {
        System.out.print("Masukkan username Admin: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password Admin: ");
        String password = scanner.nextLine();
        if ( UsernameAdmin.equals(username) && PasswordAdmin.equals(password)){
            System.out.print("Login berhasil sebagai Admin");
            return true;
        } else {
            System.out.print("username atau password anda salah");
        }
        return false;
    }
}