package UBFood;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("""
                Nama    : Erlis Maulidiyah Rizqiyani
                NIM     : 215150700111015 """);
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        System.out.println("Masukkan Nama Merchant, Nama Produk, Harga Makanan : ");
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(in.nextLine(), in.nextLine(), in.nextDouble()));
        DataMerchant.tampilData();

    }
}
