import javax.swing.*;

public class Ulanganpamujib2soal {
    public static void main(String[] args) {
        while (true) {
            String menu = JOptionPane.showInputDialog(
                "Menu:\n1. Piramida Kebalik\n2. Segitiga Angka\n3. Keluar\n\nPilihan Anda:"
            );
            if (menu == null || menu.equals("3")) break;

            int pilihan = Integer.parseInt(menu);
            String input = JOptionPane.showInputDialog("Masukkan jumlah baris:");
            int baris = Integer.parseInt(input);
            StringBuilder out = new StringBuilder();

            if (pilihan == 1) {
                for (int i = baris; i >= 1; i--) {
                    out.append("  ".repeat(baris - i));
                    out.append("* ".repeat(2 * i - 1)).append("\n");
                }
                JOptionPane.showMessageDialog(null, out.toString(), "Piramida Kebalik", 1);
            } else if (pilihan == 2) {
                for (int i = 1; i <= baris; i++) {
                    for (int j = 1; j < i; j++) out.append(j);
                    out.append("\n");
                }
                JOptionPane.showMessageDialog(null, out.toString(), "Segitiga Angka", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Pilihan tidak valid.");
            }
        }
    }
}
