package TugasEnam;

public class Mahasiswa extends Manusia{
    double beasiswa;
    private String nim;
    private double ipk;


    public Mahasiswa(String nama, String nik, boolean jenisKelamin, boolean statusMenikah,  String nim, double ipk) {
        super(nama, nik, jenisKelamin, statusMenikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getStatus(){
        int a = Integer.parseInt(getNim().substring(6,7));
        if (a==2){
            return "Teknik Meniup Gelembung";
        }if (a==3){
            return "Teknik Berburu Ubur-ubur";
        }if (a==4){
            return "Sistem Perhamburgeran";
        }if (a==6){
            return "Pendidikan Chum Bucket";
        }if (a==7){
            return "Teknologi Telepon Kerang";
        } else return "Prodi Tidak Ada";
    }

    public double getBeasiswa() {
        if(getIpk()<3.5){
            return 50;
        } else return 75;
    }

    @Override
    public double getPendapatan() {
        return (super.getPendapatan()+getBeasiswa());
    }

    @Override
    public String toString() {
        return super.toString()+ "\n" +
                "IPK                 : "+ getIpk() + "\n" +
                "NIM                 : "+ getNim() + "\n" +
                "Status              : "+ getStatus()+", 20" + getNim().substring(0,2) + "\n";
    }
}
