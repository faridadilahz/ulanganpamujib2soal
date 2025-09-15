import java.util.Scanner;

public class Ulanganpamujib2soal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            // Tampilkan menu
            System.out.println("Menu:");
            System.out.println("1. Piramida Kebalik");
            System.out.println("2. Segitiga Angka");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                // --- Piramida Kebalik ---
                System.out.print("Masukkan jumlah baris untuk Piramida Kebalik: ");
                int baris = input.nextInt();

                for (int i = baris; i >= 1; i--) {
                    for (int spasi = 0; spasi < baris - i; spasi++) {
                        System.out.print("  "); // spasi
                    }
                    for (int bintang = 1; bintang <= 2 * i - 1; bintang++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }

            } else if (pilihan == 2) {
                // --- Segitiga Angka ---
                System.out.print("Masukkan jumlah baris untuk Segitiga Angka: ");
                int baris = input.nextInt();

                for (int i = 1; i <= baris; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }

            } else if (pilihan == 3) {
                // --- Keluar ---
                System.out.println("Terima kasih, program selesai.");
            } else {
                // --- Pilihan tidak valid ---
                System.out.println("Pilihan tidak valid. Silakan pilih 1–3.");
            }

            System.out.println(); // Spasi antar menu

        } while (pilihan != 3);

        input.close();
    }
}
