package miniBank;

// Kelas RekeningInvestasi
public class RekeningInvestasi extends Rekening {
    public RekeningInvestasi(String nomorRekening, double saldoAwal) {
        super(nomorRekening, saldoAwal);
    }

    //@override
    public void transaksi(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Transaksi : Tarik uang sebesar " + jumlah);
        } else {
             System.out.println("Transaksi : Saldo tidak mencukupi");
        }
    }
}
