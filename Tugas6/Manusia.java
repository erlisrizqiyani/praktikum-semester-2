package TugasEnam;

public class Manusia {
    private String nama, nik;
    private boolean jenisKelamin;
    private boolean statusMenikah;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean statusMenikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.statusMenikah = statusMenikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean isStatusMenikah() {
        return statusMenikah;
    }

    public void setStatusMenikah(boolean statusMenikah) {
        this.statusMenikah = statusMenikah;
    }

    public double getTunjangan(){
        if(isStatusMenikah()==true){
            if(isJenisKelamin()==true){
                return 25;
            } else return 20;
        } else return 15;
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    public String jK(){
        if(isJenisKelamin()==true){
            return "Laki-laki";
        } else return "Perempuan";
    }

    public String toString(){
        return  "Nama                : " + getNama()+"\n" +
                "NIK                 : " + getNik()+"\n"+
                "Jenis Kelamin       : " + jK()+"\n"+
                "Jumlah Pendapatan   : " + getPendapatan()+"$";
    }
}
