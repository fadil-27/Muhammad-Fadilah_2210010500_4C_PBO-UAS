package ManajemenPertanian;

public class Lahan extends Tanah {
    //atribut tambahan untuk kelas lahan
    private String tanaman;
    
    //konstruktor untuk menginisialisasi objek Lahan
    public Lahan(String id, double luas, String tanaman) {
        super(id, luas); //memanggil konstruktor dari kelas induk(tanah)
        this.tanaman = tanaman;
    }
    
    //accesor untuk mendapatkan nilai tanaman
    public String getTanaman() {
        return tanaman;
    }
    
    //mutator untuk mengubah nilai tanaman
    public void setTanaman(String tanaman) {
        this.tanaman = tanaman;
    }
    
    //metode toString untuk mencetak informasi objek lahan
    @Override
    public String toString(){
        return "Lahan(" + 
                ",id ='" + getId () + '\'' +
                ", luas='" + getLuas() +
                ", tanaman='" + tanaman + '\'' +
                ')';
    }
}