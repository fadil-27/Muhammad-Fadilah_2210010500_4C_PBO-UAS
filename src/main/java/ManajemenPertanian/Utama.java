package ManajemenPertanian;

import java.util.Scanner;

// Kelas utama untuk menjalankan aplikasi manajemen lahan pertanian
public class Utama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LahanService lahanService = new LahanService();
        InventarisService inventarisService = new InventarisService();

        // Menampilkan pesan selamat datang
        System.out.println("Selamat datang di program manajemen pertanian");
        System.out.println("Pilihan Menu");
        
        // Loop utama aplikasi untuk menerima input pengguna
        while (true) {
            System.out.println("1. Tambah Lahan");
            System.out.println("2. Lihat Daftar Lahan");
            System.out.println("3. Hapus Lahan");
            System.out.println("4. Tambah Inventaris");
            System.out.println("5. Lihat Daftar Inventaris");
            System.out.println("6. Hapus Inventaris");
            System.out.println("7. Keluar");
            System.out.print("Pilih opsi: ");
            int opsi = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (opsi) {
                    case 1:
                        // Menambah lahan baru
                        System.out.print("Masukkan id: ");
                        String id = scanner.nextLine();
                        System.out.print("Masukkan luas(m): ");
                        double luas = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Masukkan tanaman: ");
                        String tanaman = scanner.nextLine();
                        Lahan lahan = new Lahan(id, luas, tanaman);
                        lahanService.tambahLahan(lahan);
                        break;
                    case 2:
                        // Menampilkan daftar lahan
                        for (Lahan l : lahanService.getDaftarLahan()) {
                            System.out.println(l);
                        }
                        break;
                    case 3:
                        // Menghapus lahan berdasarkan id
                        System.out.print("Masukkan id lahan yang ingin dihapus: ");
                        id = scanner.nextLine();
                        if (lahanService.hapusLahan(id)) {
                            System.out.println("Lahan berhasil dihapus.");
                        } else {
                            System.out.println("Lahan tidak ditemukan.");
                        }
                        break;
                    case 4:
                        // Menambah inventaris baru
                        System.out.print("Masukkan nama alat: ");
                        String namaAlat = scanner.nextLine();
                        System.out.print("Masukkan jumlah: ");
                        int jumlah = scanner.nextInt();
                        scanner.nextLine();
                        Inventaris inventaris = new Inventaris(namaAlat, jumlah);
                        inventarisService.tambahInventaris(inventaris);
                        break;
                    case 5:
                        // Menampilkan daftar inventaris
                        for (Inventaris i : inventarisService.getDaftarInventaris()) {
                            System.out.println(i);
                        }
                        break;
                    case 6:
                        // Menghapus inventaris berdasarkan nama alat
                        System.out.print("Masukkan nama alat yang ingin dihapus: ");
                        namaAlat = scanner.nextLine();
                        if (inventarisService.hapusInventaris(namaAlat)) {
                            System.out.println("Inventaris berhasil dihapus.");
                        } else {
                            System.out.println("Inventaris tidak ditemukan.");
                        }
                        break;
                    case 7:
                        // Keluar dari aplikasi
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opsi tidak valid.");
                        break;
                }
            } catch (Exception e) {
                // Menangani kesalahan umum
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                scanner.nextLine(); // Membersihkan buffer scanner
            }
        }
    }
}
