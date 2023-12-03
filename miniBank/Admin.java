package miniBank;
import java.util.List;

// Kelas Admin dapat melihat informasi seluruh nasabah
public class Admin {
    public void lihatInfoNasabah(List<Nasabah> nasabahList) {
        for (Nasabah nasabah : nasabahList) {
            System.out.println("Nama Nasabah : " + nasabah.getNama());
            System.out.println("Alamat Nasabah : " + nasabah.getAlamat());
            System.out.println("Nomor Rekening : "+ nasabah.getRekening().getNomorRekening());
            System.out.println("Saldo : " + nasabah.getRekening().getSaldo());
        }
    }
}
