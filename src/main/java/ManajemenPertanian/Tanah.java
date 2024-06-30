package ManajemenPertanian;

public class Tanah {
    //atribut kelas
    private String id;
    private double luas;
    
    //konstruktor untuk menginisialisasi objek tanah
    public Tanah(String id, double luas) {
        this.id = id;
        this.luas = luas;
    }
    
    //accesor untuk mendapatkan nilai id
    public String getId() {
        return id;
    }
    
    //accesor untuk mendapatkan nilai luas
    public double getLuas() {
        return luas;
    }
    
    //mutator untuk mengubah nilai luas
    public void setLuas(double luas){
        this.luas = luas;
    }
    
    //metode toString untuk mencetak informasi objek Tanah
    @Override
    public String toString() {
        return "Tanah(" +
                "id='" + id + '\'' +
                ", luas=" + luas +
                ')';
    }
}