import javax.swing.JOptionPane;

public class Ulanganpamujib2soal {
    public static void main(String[] args) {
        int pilihan;

        do {
            // Tampilkan menu dalam bentuk popup
            String inputPilihan = JOptionPane.showInputDialog(
                "Menu:\n" +
                "1. Piramida Kebalik\n" +
                "2. Segitiga Angka\n" +
                "3. Keluar\n\n" +
                "Masukkan pilihan Anda:"
            );

            if (inputPilihan == null) {
                // Jika user menekan Cancel atau menutup popup
                break;
            }

            try {
                pilihan = Integer.parseInt(inputPilihan);

                if (pilihan == 1) {
                    // --- Piramida Kebalik ---
                    String inputBaris = JOptionPane.showInputDialog("Masukkan jumlah baris untuk Piramida Kebalik:");
                    int baris = Integer.parseInt(inputBaris);

                    StringBuilder hasil = new StringBuilder();
                    for (int i = baris; i >= 1; i--) {
                        for (int spasi = 0; spasi < baris - i; spasi++) {
                            hasil.append("  ");
                        }
                        for (int bintang = 1; bintang <= 2 * i - 1; bintang++) {
                            hasil.append("* ");
                        }
                        hasil.append("\n");
                    }

                    JOptionPane.showMessageDialog(null, hasil.toString(), "Piramida Kebalik", JOptionPane.INFORMATION_MESSAGE);

                } else if (pilihan == 2) {
                    // --- Segitiga Angka ---
                    String inputBaris = JOptionPane.showInputDialog("Masukkan jumlah baris untuk Segitiga Angka:");
                    int baris = Integer.parseInt(inputBaris);

                    StringBuilder hasil = new StringBuilder();
                    for (int i = 1; i <= baris; i++) {
                        for (int j = 1; j < i; j++) {
                            hasil.append(j);
                        }
                        hasil.append("\n");
                    }

                    JOptionPane.showMessageDialog(null, hasil.toString(), "Segitiga Angka", JOptionPane.INFORMATION_MESSAGE);

                } else if (pilihan == 3) {
                    JOptionPane.showMessageDialog(null, "Terima kasih, program selesai.");
                } else {
                    JOptionPane.showMessageDialog(null, "Pilihan tidak valid. Silakan pilih 1–3.");
                }

            } catch (NumberFormatException e) {
                // Menangani input yang bukan angka
                JOptionPane.showMessageDialog(null, "Input tidak valid. Masukkan angka saja.");
                pilihan = 0; // Supaya loop tetap berjalan
            }

        } while (true); // Loop hingga user memilih keluar atau menutup dialog
    }
}
