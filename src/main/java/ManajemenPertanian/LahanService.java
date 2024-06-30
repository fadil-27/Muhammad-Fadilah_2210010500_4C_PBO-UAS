package ManajemenPertanian;

import java.util.ArrayList;
import java.util.List;

// Kelas yang menyediakan layanan CRUD untuk objek Lahan
public class LahanService {
    // Daftar untuk menyimpan objek Lahan
    private List<Lahan> daftarLahan;

    // Constructor untuk menginisialisasi daftarLahan
    public LahanService() {
        daftarLahan = new ArrayList<>();
    }

    // Metode untuk menambah objek Lahan ke daftar
    public void tambahLahan(Lahan lahan) {
        daftarLahan.add(lahan);
    }

    // Metode untuk mendapatkan daftar Lahan
    public List<Lahan> getDaftarLahan() {
        return daftarLahan;
    }

    // Metode untuk mencari objek Lahan berdasarkan id
    public Lahan cariLahan(String id) {
        for (Lahan lahan : daftarLahan) {
            if (lahan.getId().equalsIgnoreCase(id)) {
                return lahan;
            }
        }
        return null;
    }

    // Metode untuk menghapus objek Lahan berdasarkan id
    public boolean hapusLahan(String id) {
        return daftarLahan.removeIf(lahan -> lahan.getId().equalsIgnoreCase(id));
    }
}
