package TugasEnam;

public class Manager extends Pekerja{
    private int lamaKerja;

    public Manager(String nama, String nik, boolean jenisKelamin, boolean statusMenikah, int jamKerja, int hariKerja, String NIP, int lamaKerja) {
        super(nama, nik, jenisKelamin, statusMenikah, jamKerja, hariKerja, NIP);
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan()+15;
    }

    @Override
    public double getBonus() {
        return super.getBonus() + (0.3 * super.getBonus());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Lama Kerja          : " + getLamaKerja() +" hari \n";
    }
}
