import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Kita coba pakai Toshiba (bisa diganti MacBook)
            Laptop toshiba = new Toshiba();
            LaptopUser user = new LaptopUser(toshiba);

            String aksi;
            System.out.println("=== APLIKASI KONTROL LAPTOP (WULAN) ===");
            System.out.println("Pilihan Perintah: ON, OFF, UP, DOWN, EXIT");

            while (true) {
                System.out.print("\nMasukkan Perintah: ");
                aksi = input.nextLine().toUpperCase();

                if (aksi.equals("EXIT")) break;

                switch (aksi) {
                    case "ON" -> user.turnOnLaptop();
                    case "OFF" -> user.turnOffLaptop();
                    case "UP" -> user.makeLaptopLoud();
                    case "DOWN" -> user.makeLaptopSilent();
                    default -> System.out.println("Perintah Tidak Dikenal!");
                }
            }
            System.out.println("Aplikasi Berhenti.");
        }
    }
}
