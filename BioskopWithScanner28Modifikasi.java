import java.util.Scanner;
public class BioskopWithScanner28Modifikasi {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menuChoice = input28.nextInt();
            input28.nextLine(); // Menangani karakter newline setelah memasukkan pilihan menu

            switch (menuChoice) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    nama = input28.nextLine();
                    System.out.print("Masukkan Baris: ");
                    baris = input28.nextInt();
                    System.out.print("Masukkan Kolom: ");
                    kolom = input28.nextInt();
                    input28.nextLine();

                    if (isValidIndex(baris, kolom, penonton)) {
                        if (penonton[baris - 1][kolom - 1] == null) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil disimpan.");
                        } else {
                            System.out.println("Kursi tersebut sudah terisi. Silakan pilih kursi yang lain.");
                        }
                    } else {
                        System.out.println("Input tidak valid. Harap masukkan indeks yang sesuai.");
                    }
                    break;
                case 2:
                    displayPenonton(penonton);
                    break;
                case 3:
                    System.out.println("Terima kasih. Keluar dari program.");
                    System.exit(0); // Keluar dari program
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid. Silakan coba lagi.");
            }

            System.out.print("Kembali ke menu? (y/n): ");
            next = input28.nextLine();
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    // Fungsi untuk menampilkan daftar penonton
    private static void displayPenonton(String[][] penonton) {
        System.out.println("Daftar Penonton:");
        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                if (penonton[i][j] != null) {
                    System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                }
                else {
                    System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + "***");
                }
            }
        }
    }

    // Fungsi untuk memeriksa apakah indeks yang dimasukkan valid
    private static boolean isValidIndex(int baris, int kolom, String[][] penonton) {
        return baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length;
    }
}

