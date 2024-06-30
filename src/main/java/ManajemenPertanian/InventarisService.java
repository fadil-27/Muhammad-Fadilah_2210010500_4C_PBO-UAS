package ManajemenPertanian;

import java.util.ArrayList;
import java.util.List;

// Kelas yang menyediakan layanan CRUD untuk objek Inventaris
public class InventarisService {
    // Daftar untuk menyimpan objek Inventaris
    private List<Inventaris> daftarInventaris;

    // Constructor untuk menginisialisasi daftarInventaris
    public InventarisService() {
        daftarInventaris = new ArrayList<>();
    }

    // Metode untuk menambah objek Inventaris ke daftar
    public void tambahInventaris(Inventaris inventaris) {
        daftarInventaris.add(inventaris);
    }

    // Metode untuk mendapatkan daftar Inventaris
    public List<Inventaris> getDaftarInventaris() {
        return daftarInventaris;
    }

    // Metode untuk mencari objek Inventaris berdasarkan nama alat
    public Inventaris cariInventaris(String namaAlat) {
        for (Inventaris inventaris : daftarInventaris) {
            if (inventaris.getNamaAlat().equalsIgnoreCase(namaAlat)) {
                return inventaris;
            }
        }
        return null;
    }

    // Metode untuk menghapus objek Inventaris berdasarkan nama alat
    public boolean hapusInventaris(String namaAlat) {
        return daftarInventaris.removeIf(inventaris -> inventaris.getNamaAlat().equalsIgnoreCase(namaAlat));
    }
}
