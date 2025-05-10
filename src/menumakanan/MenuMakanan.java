package menumakanan;

/**
 *
 * @author Edy
 * TGL : 10 Mei 2025
 */
public class MenuMakanan {
    private String kode;
    private String nama;
    private double harga;
    private String kategori;

    // Constructor Overloading
    public MenuMakanan(String kode, String nama, double harga, String kategori) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
    }

    public MenuMakanan(String kode) {
        this.kode = kode;
    }

    // Getter & Setter
    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public double getHarga() { return harga; }
    public String getKategori() { return kategori; }

    public void setNama(String nama) { this.nama = nama; }
    public void setHarga(double harga) { this.harga = harga; }
    public void setKategori(String kategori) { this.kategori = kategori; }

    // Overriding
    @Override
    public String toString() {
        return "[" + kode + "] " + nama + " | " + kategori + " | Rp" + harga;
    }
}