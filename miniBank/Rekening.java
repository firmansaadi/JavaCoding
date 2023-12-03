package miniBank;

// Kelas abstrak untuk entitas yang memiliki saldo
public class Rekening {
    private String nomorRekening;
    protected double saldo;

    public Rekening(String nomorRekening, double saldoAwal) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldoAwal;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public double getSaldo() {
        return saldo;
    }
    public void transaksi(double jumlah) {
        System.out.println("Anda sedang bertransaksi");
        System.out.println("Saldo anda : " + saldo);
    }
}
