package ManajemenPertanian;

// Kelas utilitas untuk menangani dan mencetak pesan kesalahan
public class PenangananKesalahan {
    // Metode untuk mencetak pesan kesalahan
    public static void cetakPesanKesalahan(Exception e) {
        System.out.println("Terjadi kesalahan: " + e.getMessage());
    }
}
