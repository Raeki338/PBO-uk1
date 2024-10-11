// Kelas induk pertama: HewanLaut
class HewanLaut {
    protected String nama;
    protected String habitat;

    // Constructor tanpa parameter
    public HewanLaut() {
        this.nama = "Tidak diketahui";
        this.habitat = "Tidak diketahui";
    }

    // Overloading constructor dengan parameter
    public HewanLaut(String nama, String habitat) {
        this.nama = nama;
        this.habitat = habitat;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk habitat
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // Overriding method untuk menampilkan info hewan
    public void tampilkanInfo() {
        System.out.println("Hewan: " + nama + ", Habitat: " + habitat);
    }
}

// Kelas anak pertama: Ikan (menginduk ke HewanLaut)
class Ikan extends HewanLaut {
    public Ikan(String nama, String habitat) {
        super(nama, habitat); // Memanggil constructor induk
    }

    // Overriding method
    @Override
    public void tampilkanInfo() {
        System.out.println("Ikan: " + nama + ", Habitat: " + habitat);
    }
}

// Kelas anak kedua: LumbaLumba (menginduk ke HewanLaut)
class LumbaLumba extends HewanLaut {
    public LumbaLumba(String nama, String habitat) {
        super(nama, habitat); // Memanggil constructor induk
    }

    // Overriding method
    @Override
    public void tampilkanInfo() {
        System.out.println("Lumba-lumba: " + nama + ", Habitat: " + habitat);
    }
}

// Kelas anak ketiga: Paus (menginduk ke HewanLaut)
class Paus extends HewanLaut {
    public Paus(String nama, String habitat) {
        super(nama, habitat); // Memanggil constructor induk
    }

    // Overriding method
    @Override
    public void tampilkanInfo() {
        System.out.println("Paus: " + nama + ", Habitat: " + habitat);
    }
}

public class Main {
    public static void main(String[] args) {
        HewanLaut ikan = new Ikan("Hiu", "Laut Tropis");
        ikan.tampilkanInfo();

        HewanLaut lumbaLumba = new LumbaLumba("Lumba-lumba", "Samudra Pasifik");
        lumbaLumba.tampilkanInfo();

        HewanLaut paus = new Paus("Paus Biru", "Laut Dalam");
        paus.tampilkanInfo();
    }
}