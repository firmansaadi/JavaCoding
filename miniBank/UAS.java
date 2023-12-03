package miniBank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UAS {
    public static void main(String[] args) {
        // Membuat beberapa objek nasabah dengan rekening tabungan dan investasi
        RekeningTabungan rekeningTabungan = new RekeningTabungan("12345", 1000);
        RekeningInvestasi rekeningInvestasi = new RekeningInvestasi("67890", 5000);

        Nasabah nasabah1 = new Nasabah("Budi", "Jl. ABC No. 123", rekeningTabungan);
        Nasabah nasabah2 = new Nasabah("Tono", "Jl. XYZ No. 456", rekeningInvestasi);

        List<Nasabah> nasabahList = new ArrayList<>();
        nasabahList.add(nasabah1);
        nasabahList.add(nasabah2);

        Admin admin = new Admin();
        Personal user = new Personal(nasabah1);

        // Menampilkan informasi seluruh nasabah oleh admin
        admin.lihatInfoNasabah(nasabahList);

        // Menampilkan informasi diri oleh personal
        user.lihatInfoDiri();

        // Melakukan transaksi oleh personal
        user.lakukanTransaksi(200);

        // Menampilkan informasi diri setelah transaksi oleh personal
        user.lihatInfoDiri();
    }
}
