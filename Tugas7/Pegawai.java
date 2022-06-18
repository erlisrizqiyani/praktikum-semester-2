package TugasTujuh;

public class Pegawai {
    private String nama;
    private String noKtp;

    public Pegawai(String nama, String noKtp) {
        this.nama = nama;
        this.noKtp = noKtp;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKtp() {
        return noKtp;
    }

    public String toString(){
        return "";
    }

    public int gaji(){
        return 0;
    }
}
