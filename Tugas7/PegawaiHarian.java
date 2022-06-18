package TugasTujuh;

public class PegawaiHarian extends Pegawai{
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKtp, double upahPerJam, int totalJam) {
        super(nama, noKtp);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Pegawai Harian  : " + getNama() + "\n" +
                "Nomor KTP       : " + getNoKtp() + "\n" +
                "Upah/jam        : Rp " + getUpahPerJam() + "\n" +
                "Total Jam Kerja : " + getTotalJam() + "\n" +
                "Pendapatan      : Rp " + gaji() + "\n";
    }

    @Override
    public int gaji() {
        if(getTotalJam()>40){
           return (int) ((40 * getUpahPerJam())+((getTotalJam()-40)*getUpahPerJam()*1.5));
        } else return (int) (getTotalJam() * getUpahPerJam());
    }
}
