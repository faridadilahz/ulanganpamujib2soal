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
                // Segitiga Angka
                int baris = 6;
                for (int i = 1; i <= baris; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
            } else if (pilihan == 2) {
                // Piramida Kebalik
                int bariss = 5;
                for (int k = bariss; k >= 1; k--) {
                    for (int s = 0; s < bariss - k; s++) {
                        System.out.print("  ");
                    }
                    for (int b = 1; b <= 2 * k - 1; b++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            } else if (pilihan == 3) {
                System.out.println("Terima kasih, program selesai.");
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih 1–3.");
            }

            System.out.println(); // Spasi antar menu

        } while (pilihan != 3);

        input.close();
    }

}
