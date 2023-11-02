import java.util.Scanner;
public class BioskopWithScanner28 {
    public static void main(String [] args) {
        Scanner input28 = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int baris, kolom;
        String nama, next;


        while (true) {
            System.out.println("Menu:  ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");

            System.out.print("Pilih menu 1/2/3: ");
            int choice = input28.nextInt();
            input28.nextLine();

            switch (choice) {
             case 1:
                System.out.print("Masukkan nama: ");
                nama = input28.nextLine();
                System.out.print("Masukkan baris: ");
                baris = input28.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = input28.nextInt();
                input28.nextLine();
                penonton[baris-1][kolom-1] = nama;
            

            case 2:
                System.out.println("Daftar Penonton: ");
                for (int i = 0; i < 4; i++) {
                    for(int j=0; j < 2; j++){
                        if (penonton[i][j] != null) {
                        System.out.println("Baris " + (i + 1) + ",  Kolom" + (j+ 1) + ": " + penonton[i][j]);
                        }
                    }
                }
                break;
            case 3:
                System.out.println("Terimakasih!");
                System.exit(0);
            default:
                System.out.println("Menu yang Anda pilih tidak valid. Silahkan pilih 1, 2, atau 3.");
           

        
        }
        

    }
    }

}
