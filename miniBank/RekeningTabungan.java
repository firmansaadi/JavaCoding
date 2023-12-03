package miniBank;

// Kelas RekeningTabungan
public class RekeningTabungan extends Rekening {
    public RekeningTabungan(String nomorRekening, double saldoAwal) {
        super(nomorRekening, saldoAwal);
    }

    //@Override
    public void transaksi(double jumlah) {
        super.transaksi(jumlah);
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Transaksi : simpan uang sebesar " + jumlah);
        } else {
            System.out.println("Transaksi : Jumlah transaksi tidak valid");
        }
    }
}
