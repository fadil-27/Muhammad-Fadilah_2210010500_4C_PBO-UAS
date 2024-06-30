
package ManajemenPertanian;

public class Inventaris {
   //atribut kelas
    private String namaAlat;
    private int jumlah;
    
    //konstruktor untuk menginisialisasi objek inventaris
    public Inventaris(String namaAlat, int jumlah) {
        this.namaAlat = namaAlat;
        this.jumlah = jumlah;
    }
    
    //Accesor untuk mendapatkan nilai namaAlat
    public String getNamaAlat () {
        return namaAlat;
    }
    
    //Mutator untuk mengubah nilai namaALat
    public void setNamaAlat(String namaAlat) {
        this.namaAlat = namaAlat;
    }
    
    //Accesor untuk mendapatkan nilai jumlah
    public int getJumlah () {
        return jumlah;
    }
    
    //Mutator untuk mengubah nilai jumlah
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    //metode toString untuk mencetak informasi 
    @Override
    public String toString(){
        return "Inventaris(" + 
                ",namaAlat='" + namaAlat + '\'' +
                ", jumlah='" + jumlah +
                ')';
    }
}


