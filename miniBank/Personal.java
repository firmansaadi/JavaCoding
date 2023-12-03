package miniBank;

// Kelas Personal dapat melihat informasi dirinya sendiri
public class Personal {
    private Nasabah nasabah;

    public Personal(Nasabah nasabah) {
        this.nasabah = nasabah;
    }

    public void lihatInfoDiri() {
        System.out.println("----------------------------------------------------------");
        System.out.println("Nama : " + nasabah.getNama());
        System.out.println("Alamat : " + nasabah.getAlamat());
        System.out.println("Nomor Rekening : " + nasabah.getRekening().getNomorRekening());
        System.out.println("Saldo : " + nasabah.getRekening().getSaldo());
        System.out.println("----------------------------------------------------------");
    }
    public void lakukanTransaksi(double jumlah) {
        nasabah.getRekening().transaksi(jumlah);
    }
}