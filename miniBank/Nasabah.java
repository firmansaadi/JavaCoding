package miniBank;

// Kelas Nasabah berisi informasi tentang nasabah dan hubungannya dengan Rekening
public class Nasabah {
    private String nama;
    private String alamat;
    private Rekening rekening;

    public Nasabah(String nama, String alamat, Rekening rekening) {
        this.nama = nama;
        this.alamat = alamat;
        this.rekening = rekening;
    }
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public Rekening getRekening() {
        return rekening;
    }
}
