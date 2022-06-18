package TugasTujuh;

public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKtp, int penjualan, double komisi) {
        super(nama, noKtp);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Sales           : " + getNama() + "\n" +
                "Nomor KTP       : " + getNoKtp() + "\n" +
                "Total Penjualan : " + getPenjualan() + "\n" +
                "Besar Komisi    : " + getKomisi() + "\n" +
                "Pendapatan      : Rp " + gaji() + "\n";
    }

    @Override
    public int gaji() {
        return (int) (getPenjualan()*getKomisi());
    }
}
